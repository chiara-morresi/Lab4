package it.polito.tdp.quadratomagico.model;

public class TestModel {

	public static void main(String[] args) {
		QuadratoMagicoModel model = new QuadratoMagicoModel();
		
		int n=3;
		
		int[][] sol= model.ricorsione(n, 0);
		
		for(int i=0; i<n; i++)
		{
			
			for(int j=0; j<n; j++)
			{
				System.out.print(sol[i][j] + " ");
			}
			
			System.out.print("\n");
			
		}
		

	}

}
