package base;

import java.util.Set;
import java.util.TreeSet;

public class User {
	
	private int ID;
	private boolean isAutor = false;
	private boolean isGutachter = false;
	private boolean isVeranstalter = false;
	private boolean isTeilnehmer = false;
	

	public User(int ID){
		this.ID=ID;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setAutor(boolean isAutor){
		this.isAutor=isAutor;
	}
	
	public void setGutachter(boolean isGutachter){
		this.isGutachter=isGutachter;
	}
	
	public void setVeranstalter(boolean isVeranstalter){
		this.isVeranstalter=isVeranstalter;
	}
	
	public void setTeilnehmer(boolean isTeilnehmer){
		this.isTeilnehmer=isTeilnehmer;
	}
	
	public boolean isAutor(){
		return isAutor;
	}
	
	public boolean isGutachter(){
		return isGutachter;
	}
	
	public boolean isVeranstalter(){
		return isVeranstalter;
	}
	
	public boolean isTeilnehmer(){
		return isTeilnehmer;
	}
	
}
