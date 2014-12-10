package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class View extends JFrame{
	
	protected Toolkit toolkit;
	protected JPanel pane;
	protected Dimension screensize;
	protected JMenuBar menubar;
	protected JMenu dateiMenue;
	protected Font font = new Font("Calibri", Font.PLAIN, 14);
	protected Color color = new Color(50, 50, 25);
	
	public View(){
		preInit();
		init();
		postInit();
	}

	protected void preInit(){
		
		toolkit = getToolkit();
		screensize = toolkit.getScreenSize();
		
		menubar = new JMenuBar();
		ImageIcon icon = new ImageIcon("exit.png");
		
		dateiMenue = new JMenu("Datei");
		dateiMenue.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem eMenuItem = new JMenuItem("Schließen", icon);
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Programm Schließen");
		eMenuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		dateiMenue.add(eMenuItem);
				
	}
	
	protected void init(){
		setTitle("Oberflächnname");
		pane = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JPanel descriptionPanel = new JPanel(new GridBagLayout());
		String descriptionText = "<html><body style = 'width:300px'><p align='justify'>Hier steht eine Beschreibung für diese Test-Oberfläche</p></body></html>";
		JLabel descriptionLabel = new JLabel(descriptionText);
		descriptionLabel.setFont(font);;
		descriptionLabel.setForeground(new Color(50, 50, 25));
		descriptionPanel.add(descriptionLabel, c);
		
		JPanel buttonPanel = new JPanel(new GridBagLayout());
		JButton testButton1 = new JButton("Test1");
		testButton1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("Testbutton1 gibt etwas aus.");
			}
		});
		buttonPanel.add(testButton1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		
		JButton testButton2 = new JButton("Test2");
		testButton2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("Testbutton2 gibt etwas aus.");
			}
		});
		buttonPanel.add(testButton2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		pane.add(descriptionPanel, new GridBagConstraints(0, 0, 5, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
		pane.add(buttonPanel, new GridBagConstraints(0, 1, 5, 1, 0.0, 0.0, GridBagConstraints.CENTER, 
				GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
	}
	
	protected void postInit(){
		menubar.add(dateiMenue);
		setJMenuBar(menubar);
		
		add(pane);
		pack();
		setLocation((screensize.width - getWidth())/2, (screensize.height - getHeight())/2);
		setSize(screensize.width/4, screensize.height/5);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void close(){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		toolkit.getSystemEventQueue().postEvent(winClosingEvent);
	}
	
}
