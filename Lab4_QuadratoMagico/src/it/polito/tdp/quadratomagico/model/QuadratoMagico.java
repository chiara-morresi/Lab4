package it.polito.tdp.quadratomagico.model;

public class QuadratoMagico {
	
	private int[][] quadrato;
	private int lato;
	private int numMagico;
	
	public QuadratoMagico(int lato) {
		this.lato=lato;
		quadrato = new int[lato][lato];
		for(int i=0; i<lato; i++) {
			for(int j=0; j<lato; j++) {
				quadrato[i][j]=0;
			}
		}
		int sum=0;
		for(int k=1; k<=lato*lato; k++)
		{
			sum += k;
		}
		numMagico = sum/lato;
	}

	public int size() {
		return lato*lato;
	}
	
	public int getLato() {
		return lato;
	}
	
	public int getNumMagico() {
		return numMagico;
	}
	
	public int[][] getQuadrato() {
		return quadrato;
	}
	
	public int getCasella(int riga, int col) {
		return quadrato[riga][col];
	}
	
	public void setCasella(int riga, int col, int num) {
		quadrato[riga][col] = num;
	}
	

}
