import java.sql.*; //Step 2
class basicJDBC {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //Step 3
        Connection connection = DriverManager.getConnection("jdbc:odbc:northbrick");   //Step 4
        
        Statement stmt = connection.createStatement();  // Step 5
        ResultSet rs = stmt.executeQuery("Select * from Shippers");   //Step 6
        
        while(rs.next()) {   //Step 7
            System.out.print( rs.getString("CompanyName")+", ");
            System.out.println(rs.getString("Phone"));
        }
        
        //Step 8
        rs.close();
        stmt.close();
        
        //Step 9
        connection.close();
    }
}