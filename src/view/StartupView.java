package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import control.MainController;

public class StartupView extends View{

	MainController mc;
	
	public StartupView(){
		preInit();
		init();
		personalize();
		postInit();
	}
	
	protected void init(){
		setTitle("Willkommen");
		pane = new JPanel(new GridBagLayout());
		JPanel descriptionPanel = new JPanel(new GridBagLayout());
		String descriptionText = "<html><body style = 'width:300px'><p align='justify'>Willkommen im Conference System<br>"
				+ "Loggen sie sich bitte ein, um Zugriff auf das System zu bekommen</p></body></html>";
		JLabel descriptionLabel = new JLabel(descriptionText);
		descriptionLabel.setFont(font);;
		descriptionLabel.setForeground(new Color(50, 50, 25));
		descriptionPanel.add(descriptionLabel, new GridBagConstraints(0, 0, 4, 2, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		
		JPanel buttonPanel = new JPanel(new GridBagLayout());
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("Öffne Login...");
			}
		});
		buttonPanel.add(loginButton, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		
		pane.add(descriptionPanel, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		pane.add(buttonPanel, new GridBagConstraints(0, 1, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
	}
	
	public void personalize(){
		JTabbedPane tabLeiste = new JTabbedPane();
		JPanel panelAutor = new JPanel();
		panelAutor.add(new JButton("Autor"));
		tabLeiste.addTab("Autor", panelAutor);
		JPanel panelGutachter = new JPanel();
		panelGutachter.add(new JButton("Gutachter"));
		tabLeiste.addTab("Gutachter", panelGutachter);
		JPanel panelVeranstalter = new JPanel();
		panelVeranstalter.add(new JButton("Veranstalter"));
		tabLeiste.addTab("Veranstalter", panelVeranstalter);
		JPanel panelTeilnehmer = new JPanel();
		panelTeilnehmer.add(new JButton("Teilnehmer"));
		tabLeiste.addTab("Tab1", panelTeilnehmer);
	}
	
	public void setController(MainController mc){
		this.mc=mc;
	}
	
}
