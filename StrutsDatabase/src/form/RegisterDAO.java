package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import antlr.collections.List;

public class RegisterDAO {

	public void insert(String firstName, String lastName, String email, String phoneNumber,String username,String password) throws Exception{
		
		System.out.println("inside insert method");
		System.out.println("jdbc connection");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;	
		Statement st=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
			st=con.createStatement();
			int value=st.executeUpdate("insert into user_registration(firstName,lastName,email,phoneNumber,username,password)"+"values('"+firstName+"','"+lastName+"','"+email+"','"+phoneNumber+"','"+username+"','"+password+"')");
			System.out.println("rows affected=="+value);
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public List checkUser(String userName, String password) throws Exception {
		System.out.println("inside check Uesr method");
		System.out.println("jdbc connection");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;	
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		
		try {
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
			st=con.createStatement();
			String query="select password from user_registration where username=?";
			rs=ps.executeQuery();
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
		
		
	}

}
