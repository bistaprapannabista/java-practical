
import java.rmi.*;
import java.rmi.registry.*;

public class Client {
    public static void main(String[] args) {
        try {
            Registry regsty = LocateRegistry.getRegistry(9000);
            Calc obj = (Calc) regsty.lookup("multiply");
            int x = obj.multiply(10, 20);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}