package in.ashokit.Java8;

import java.util.Optional;

public class User {
	
	public String getUsernameById(Integer id) {
		if(id == 100) {
			return "Raju";
			
		}else if(id == 101) {
			return "Rani";
			}else {
				return null;
			}
	}
	
	public Optional<String> getUsername(Integer id){
		String name =null;
		
		if(id ==100) {
			name ="Raju";
		}else if(id == 101) {
			name = "Rani";
		}
		return Optional.ofNullable(name);
	}

}
