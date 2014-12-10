package base;

import java.util.ArrayList;
import java.util.List;

public class Konferenz {
	
	int ID;
	Veranstalter veranstalter;
	List<Teilnehmer> teilnehmerliste = new ArrayList<Teilnehmer>();
	String titel;
	List<Publikation> publikationen = new ArrayList<Publikation>();
	
	public Konferenz(Veranstalter veranstalter, String titel, int ID){
		this.veranstalter = veranstalter;
		this.titel=titel;
	}
	
	public Veranstalter getVeranstalter(){
		return veranstalter;
	}
	
	public String getTitel(){
		return titel;
	}
	
	public List<Teilnehmer> getTeilnehmer(){
		return teilnehmerliste;
	}
	
	public void addPublikation(Publikation p){
		publikationen.add(p);
	}
	
}
