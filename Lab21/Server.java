
import java.rmi.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) {
        try {
            CalcRemote obj = new CalcRemote();
            Registry regsty = LocateRegistry.createRegistry(9000);
            regsty.rebind("multiply", obj);
            System.out.println("Server Ready");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}