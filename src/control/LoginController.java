package control;

import utils.LoginService;
import view.LoginView;

public class LoginController{
	
	LoginView currentView;
	
	public LoginController(){
		currentView=new LoginView();
		currentView.setVisible(true);
		currentView.setController(this);
	}
	
	public void login(String username, char[] password){
		LoginService.login(username, password);
		
	}

}
