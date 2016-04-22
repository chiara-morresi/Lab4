package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Parola {
	
	private String parola;
	private List<Character> caratteri;
	
	public Parola(String parola) {
		this.parola=parola;
		caratteri = new ArrayList<Character>();
		
	}
	
	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	

//	public int lun() {
//		int lun = parola.length();
//		return lun;
//	}
	
	
	public List<Character> caratteri(String parola) {
//		for(int i=0; i<lun; i++)
//		{
//			caratteri[i] = parola.charAt(i);
//		}
		for(int i=0; i<parola.length(); i++)
		{
			caratteri.add(parola.charAt(i));
		}
		return caratteri;
	}
	
	public int lun() {
		int lun = caratteri.size();
		return lun;
	}
	
	
	
	
	

}
