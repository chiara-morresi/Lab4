package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.db.AnagrammiDAO;

public class AnagrammiModel {

	private String s;
	private List<String> permutazioni;
	
	
	
	public AnagrammiModel() {
		s="";
		permutazioni = new ArrayList<String>();
		
		
	}
	
	
	public List<String> getPermutazioni() {
		return permutazioni;
	}

	public void setPermutazioni(List<String> permutazioni) {
		this.permutazioni = permutazioni;
	}
	

//	public List<String> doPermuta(List<Character> caratteri, int fatto) {
//		for(Character c: caratteri)
//		{
////			while(caratteri.size()!=0)
////			{
//				if(fatto==length()-1)
//				{
//					permutazioni.add(s);
//				
//				} else
//				{
//					s+=c;
//					caratteri.remove(c);
//					permutazioni(caratteri, fatto++);
//				}
////			}
//		}
//		
//		return permutazioni;
//	}
//	
//	public List<String> getPermutazioni(String word, List<Character> caratteri>) {
//		
////		if(fatto==0) {
////			s="";	
////		}
//		
//		Parola parola = new Parola(word);
//		caratteri=parola.caratteri(word);
//		return this.doPermuta(caratteri, fatto);
//		
//		
//		
//	}
//
//	
////	public List<String> getPermutazioni(List<Character> caratteri) {
////		
////		
////		List<String> altrePermutazioni = new ArrayList<String>();
////		
////		return permutazioni;
////	}
	
	
	public List<String> permutation(String s) {
		return permutation("", s);
		
	}
	
	public List<String> permutation(String p, String s) {
		int n=s.length();
		if(n==0) 
		{
			permutazioni.add(p);
		}
		else
		{
			for(int i=0; i<n;i++)
			{
				permutation(p+s.charAt(i), s.substring(0,i)+s.substring(i+1,n));
			}
		}
		return permutazioni;
	}
	
	public String toString() {
		String result="";
		for(String s: permutazioni)
		{
			result+= s+"\n";
		}
		return result;
	}
	
	public boolean ifEsistente(String s) {
		AnagrammiDAO dao = new AnagrammiDAO();
		return dao.ifEsistente(s);
	}
}
