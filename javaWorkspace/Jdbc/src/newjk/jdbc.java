package newjk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        String jdbcUrl = "jdbc:mysql://localhost:3306/employeeinfo";
		        String username = "root";
		        String password = "Mani123";
		        
		        try {
		            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
		            System.out.println("Connected to MySQL database!");
		            
		         
		            connection.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
}


	}

}
