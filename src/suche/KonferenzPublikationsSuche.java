package suche;

import java.util.ArrayList;
import java.util.List;

import persistence.PersistenceService;
import base.Gutachten;
import base.Konferenz;
import base.Publikation;

public class KonferenzPublikationsSuche {

	public static List<Publikation> lookupPublikationen(String search){
		List<Publikation> results = new ArrayList<Publikation>();
		for(Publikation p : PersistenceService.publikationen){
			if(p.getTitel().contains(search) || p.getAutor().getName().contains(search)){
				results.add(p);
			}
		}
		return results;
	}
	
	public static List<Konferenz> lookupKonferenzen(String search){
		List<Konferenz> results = new ArrayList<Konferenz>();
		for(Konferenz p : PersistenceService.konferenzen){
			if(p.getTitel().contains(search)){
				results.add(p);
			}
		}
		return results;
	}
	
	public static Gutachten lookupGutachten(int ID){
		for(Gutachten g : PersistenceService.gutachten){
			if(g.getID()==ID){
				return g;
			}
		}
		return null;
	}
	
}
