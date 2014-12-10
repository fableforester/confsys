package utils;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import base.User;

public class LoginService {

	static String datei="users";
	
	public static User login(String username, char[] password){
		FileReader fr = null;
		try{
			fr = new FileReader(datei);
			BufferedReader textReader = new BufferedReader(fr);
			String zeile;
			int index;
			while((zeile = textReader.readLine())!=null){
				if(zeile.startsWith(username)){
					index=zeile.indexOf(";");
					zeile=zeile.substring(index+1, zeile.length());
					if(zeile.startsWith(String.valueOf(password))){
						index=zeile.indexOf(";", index);
						zeile=zeile.substring(index+1,zeile.length());
						return loadUser(zeile);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	public static User loadUser(String info){
		User user = null;
		int index;
		int ID;
		try{
			index = info.indexOf(";");
			ID = Integer.parseInt(info.substring(index));
			user=new User(ID);
			info = info.substring(index+1, info.length());
			index = info.indexOf(";");
			if(info.startsWith("X"))
				user.setAutor(true);
			info = info.substring(index+1, info.length());
			index = info.indexOf(";");	
			if(info.startsWith("X"))
				user.setGutachter(true);
			info = info.substring(index+1, info.length());
			index = info.indexOf(";");
			if(info.startsWith("X"))
				user.setVeranstalter(true);
			info = info.substring(index+1, info.length());
			index = info.indexOf(";");
			if(info.startsWith("X"))
				user.setTeilnehmer(true);
		}catch(Exception e){
			System.out.println("Fehler beim Laden des Users.");
		}
		return user;
	}
	
}
