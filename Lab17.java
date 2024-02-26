import java.sql.*;

public class Lab17 {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/school";

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a statement
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // Insert a record into the student table
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO student (id, name, district, age) VALUES (101, 'John', 'XYZ', 20)";
            stmt.executeUpdate(sql);
            System.out.println("Record inserted successfully");

            // Update a record in the student table
            System.out.println("Updating record in the table...");
            sql = "UPDATE student SET age = 21 WHERE id = 101";
            stmt.executeUpdate(sql);
            System.out.println("Record updated successfully");

            // Retrieve records from the student table
            System.out.println("Retrieving records from the table...");
            sql = "SELECT id, name, district, age FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            // Display records
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String district = rs.getString("district");
                int age = rs.getInt("age");

                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.print(", District: " + district);
                System.out.println(", Age: " + age);
            }
            rs.close();

            // Delete a record from the student table
            System.out.println("Deleting record from the table...");
            sql = "DELETE FROM student WHERE id = 101";
            stmt.executeUpdate(sql);
            System.out.println("Record deleted successfully");

            // Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
