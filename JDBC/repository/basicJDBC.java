import java.sql.*;
class basicJDBC {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        
        //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        
        //Connection connection = DriverManager.getConnection("jdbc:odbc:northbrick");
		
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			//ServletContext context = config.getServletContext();
			System.out.println("realPath: " + context.getRealPath("northbrick.mdb"));
			String dbURL = "jdbc:ucanaccess://" + context.getRealPath("northbrick.mdb");
			connection = DriverManager.getConnection(dbURL);
		
        
        Statement statement = connection.createStatement();
        
        // You should write the sql to check if there is a problem
        String sql="Select * from Employees WHERE EmployeeID='10'";
        System.out.println("sql: " + sql);
        
        ResultSet result = statement.executeQuery(sql);
        
        
        while(result.next()) {
			System.out.println("dentro bucle");
            System.out.print(result.getString("LastName")+", ");
            System.out.println(result.getString("FirstName")+ " , ");
            System.out.println(result.getString("City"));
        }
        
        result.close();
        statement.close();
        
        connection.close();
    }
    
}
