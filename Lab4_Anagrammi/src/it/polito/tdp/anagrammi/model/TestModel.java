package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		
		String word = "eat";
//		List<Character> caratteri = new ArrayList<Character>();
		List<String> permutazioni = new ArrayList<String>();
		int fatto=0;
		
		
		
		AnagrammiModel model = new AnagrammiModel();
		permutazioni = model.permutation(word);
		
		System.out.println(permutazioni.toString());
		
		

	}

}
