package anonymousinner;

public class DriverManager {
	static Connection getConnection() {
		Connection con=new Connection() {
			public void createStatement() {
				System.out.println("Anonymouse inner class method");
			}
		};
		return con;
	}

}
