package base;

public class Publikation {
	
	private Autor autor;
	private String titel;
	private int ID;
	private boolean visible;
	

	public Publikation(Autor autor, String titel, int ID){
		this.autor=autor;
		this.titel=titel;
		this.ID=ID;
		visible=false;
	}
	
	public String getTitel(){
		return titel;
	}
	
	public Autor getAutor(){
		return autor;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setVisible(){
		visible=true;
	}
	
	public boolean getVisible(){
		return visible;
	}

}
