package base;

import java.util.Map;
import java.util.TreeMap;

public class Gutachter extends Rolle {
	
	Map<Integer, Gutachten> gutachtenliste = new TreeMap<Integer, Gutachten>();
	
	public void addGutachten(Gutachten g){
		gutachtenliste.put(g.getID(), g);
	}
	
	public void removeGutachten(int ID){
		gutachtenliste.remove(ID);
	}
	
}
