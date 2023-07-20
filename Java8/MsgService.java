package in.ashokit.Java8;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter User ID");
		
		int userId= s.nextInt();
		
		User u =new User();
//		String usernameById = u.getUsernameById(userId);
//		
//		if(usernameById!=null) {
//			String msg = usernameById.toUpperCase()+", Hello";
//			System.out.println(msg);
//		}else {
//			System.out.println("Invalid userId");
//		}
//		
		Optional<String> username =u.getUsername(userId);
		
		if(username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase()+",Hello");
		}else {
			System.out.println("No Data Found");
		}
		
		
		
		}

}
