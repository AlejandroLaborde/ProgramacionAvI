import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class program {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String pathConection = "jdbc:mysql://localhost:3306/test";
			Connection  con = DriverManager.getConnection(pathConection,"root","");
			
			PreparedStatement ps = con.prepareStatement("Insert into productos values(1,'producto1',20.5)");
			ps.execute();
			
			PreparedStatement ps2 = con.prepareStatement("SELECT * FROM PRODUCTOS");
			ResultSet rs = ps2.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getDouble("precio") );
			}
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
