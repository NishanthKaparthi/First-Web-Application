package webapp.login;

public class LoginService {
	
	 boolean isUserValid(String name,  String password) {
		if(name.equals("Nishanth") && password.equals("Nish"))
			return true;
		return false;
	}
}
