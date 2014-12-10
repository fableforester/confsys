package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import utils.TextPrompt;
import control.LoginController;

public class LoginView extends View{
	
	private LoginController lc;
	
	protected void init(){
		setTitle("Log-In");
		pane = new JPanel(new GridBagLayout());
		JPanel descriptionPanel = new JPanel(new GridBagLayout());
		String descriptionText = "<html><body style = 'width:300px'><p align='center'>Bitte loggen sie sich mit Ihren Daten ein:</p></body></html>";
		JLabel descriptionLabel = new JLabel(descriptionText);
		descriptionLabel.setFont(font);
		descriptionLabel.setForeground(color);
		descriptionPanel.add(descriptionLabel, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		
		JPanel inputPane = new JPanel(new GridBagLayout());
		String inputPaneUsername = "Username:";
		String inputPanePassword = "Passwort:";
		JLabel inputUsernameLabel = new JLabel(inputPaneUsername);
		JLabel inputPasswordLabel = new JLabel(inputPanePassword);
		inputUsernameLabel.setFont(font);
		inputUsernameLabel.setForeground(color);
		inputPasswordLabel.setFont(font);
		inputPasswordLabel.setForeground(color);
		inputPane.add(inputUsernameLabel, new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0, GridBagConstraints.EAST, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		inputPane.add(inputPasswordLabel, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0, GridBagConstraints.EAST, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		
		JTextField username = new JTextField(6);
		TextPrompt usernamePrompt = new TextPrompt("Username", username);
		usernamePrompt.changeStyle(Font.ITALIC);
		inputPane.add(username, new GridBagConstraints(2, 0, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		
		JPasswordField pass = new JPasswordField(6);
		TextPrompt passPrompt = new TextPrompt("Username", username);
		passPrompt.changeStyle(Font.ITALIC);
		inputPane.add(pass, new GridBagConstraints(2, 1, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		
		JPanel buttonPanel = new JPanel(new GridBagLayout());
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("Logge mich mit folgenden Daten ein: User "+username.getText()+", Passwort "+String.valueOf(pass.getPassword()));
				lc.login(username.getText(), pass.getPassword());
			}
		});
		buttonPanel.add(loginButton, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		
		pane.add(descriptionPanel, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		pane.add(inputPane, new GridBagConstraints(0, 1, 4, 2, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		pane.add(buttonPanel, new GridBagConstraints(0, 3, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
	}
	
	public void setController(LoginController lc){
		this.lc=lc;
	}
	
}
