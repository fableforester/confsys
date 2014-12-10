package persistence;

import java.util.ArrayList;
import java.util.List;

import base.Gutachten;
import base.Konferenz;
import base.Publikation;

public class PersistenceService {
	
	public static List<Publikation> publikationen = new ArrayList<Publikation>();
	public static List<Gutachten> gutachten = new ArrayList<Gutachten>();
	public static List<Konferenz> konferenzen = new ArrayList<Konferenz>();

	public static void savePublikation(Publikation p){
		publikationen.add(p);
		//TODO persistieren
		System.out.println("Speichere Publikation: "+p.getTitel());
	}
	
	public static void saveGutachten(Gutachten g){
		gutachten.add(g);
		//TODO persistieren
		System.out.println("Speichere Gutachten zu: "+g.getPublikation().getTitel());
	}
	
	public static void saveConference(Konferenz k){
		konferenzen.add(k);
		//TODO persistieren
		System.out.println("Speichere Konferenz: "+k.getTitel());
	}
	
}
