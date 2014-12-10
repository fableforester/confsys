package base;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Rolle{
	
	private String name;
	private List<Publikation> publikationen=new ArrayList<Publikation>();
	
	public Autor(String name){
		this.name=name;
	}
	
	public void addPublikation(Publikation p){
		publikationen.add(p);
	}
	
	public List<Publikation> getPublikationen(){
		return publikationen;
	}
	
	public String getName(){
		return name;
	}
	
}
