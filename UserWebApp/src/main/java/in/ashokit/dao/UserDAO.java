package in.ashokit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.ashokit.ConnectionFactory;
import in.ashokit.dto.UserDTO;

public class UserDAO {
	
	private static final String INSERT_SQL=
			"insert into user_dtls(user_name,user_email,user_phno) values (?,?,?,?)";
	
	private static final String SELECT_SQL="select * from user_dtls";
	
	public boolean saveUser(UserDTO userdto) {
		boolean isSaved=false;
		
		try {
			Connection con=ConnectionFactory.getConnection();
			
			PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
			pstmt.setString(1,userdto.getUserName());
			pstmt.setString(2,userdto.getUserEmail());
			pstmt.setInt(3, userdto.getUserPhno());
			
			int count = pstmt.executeUpdate();
			if(count>0) {
				isSaved=true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSaved;
	}
	
	public List<UserDTO> getUsers(){
		
		List<UserDTO> users=new ArrayList<>();
		
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_SQL);
			
			while(rs.next()) {
				UserDTO user=new UserDTO();
				user.setUserId(rs.getInt("user_Id"));
				user.setUserName(rs.getString("user_Name"));
				user.setUserEmail(rs.getString("user_Email"));
				user.setUserPhno(rs.getInt("user_Phno"));
				
				//adding each user obj to collection
				users.add(user);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return users;
		
		
		
		
		
	}
}
