package control;

import view.LoginView;
import view.StartupView;
import view.View;

public class MainController{

	StartupView currentView;
	
	public MainController(){
		currentView=new StartupView();
		currentView.setVisible(true);
		currentView.setController(this);
	}
	

	
}
