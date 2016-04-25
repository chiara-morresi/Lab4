package it.polito.tdp.quadratomagico.model;

public class QuadratoMagicoModel {

	private int level;

	public QuadratoMagicoModel() {

		level = 0;

	}

	public int[][] ricorsione(int lato, int level) {
		QuadratoMagico quadrato = new QuadratoMagico(lato);
		return ricorsione(quadrato, level);

	}

	public int[][] ricorsione(QuadratoMagico quadrato, int level) {
		int riga = level / quadrato.getLato();
		int col = level % quadrato.getLato();

		if (level == quadrato.getLato() * quadrato.getLato()) {
			if(filtro(quadrato))
			{
				return quadrato.getQuadrato();
			}
			
		}

		for (int i = 1; i <= 9; i++) {
			if (!contains(quadrato, i)) {
				quadrato.setCasella(riga, col, i);
				int[][] temp = ricorsione(quadrato, level + 1);
				if (temp != null)
					return temp;
				quadrato.setCasella(riga, col, 0);
			} 
		}
		return null;
	}
	

	public boolean filtro(QuadratoMagico quadrato) {
		int sommaRiga[] = new int[quadrato.getLato()];
		int sommaCol[] = new int[quadrato.getLato()];
		int sommaDiagonale = 0;
		int sommaDiagonale2 = 0;

	

		for(int i=0; i<quadrato.getLato(); i++) {
			for (int j = 0; j < quadrato.getLato(); j++) {
				sommaRiga[i] += quadrato.getCasella(i, j);
			}
			if(sommaRiga[i]!=quadrato.getNumMagico()) {
				return false;
			}
				
		}
		
		
		for(int j=0; j<quadrato.getLato(); j++) {
			for (int i = 0; i < quadrato.getLato(); i++) {
				sommaCol[j] += quadrato.getCasella(i, j);
			}
			if(sommaCol[j]!=quadrato.getNumMagico()) {
				return false;
			}
				
		}	
		
		
		for(int n=0; n<quadrato.getLato(); n++) {
			sommaDiagonale += quadrato.getCasella(n, n);	
		}
		if(sommaDiagonale!= quadrato.getNumMagico()) {
			return false;
		}
		
		
		int m = quadrato.getLato()-1;
		for(int n=0; n<quadrato.getLato(); n++) {
			sommaDiagonale2 += quadrato.getCasella(n, m);
			m--;

		}
		if(sommaDiagonale2!= quadrato.getNumMagico()) {
			return false;
		}
		
		
		
		
		return true;
	}
	
	
	public boolean contains(QuadratoMagico quadrato, int num) {
		for (int i = 0; i < quadrato.getLato(); i++) {
			for (int j = 0; j < quadrato.getLato(); j++) {

				if (quadrato.getCasella(i, j) == num) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
