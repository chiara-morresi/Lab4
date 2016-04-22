package it.polito.tdp.quadratomagico.model;

public class TestModel {

	public static void main(String[] args) {
		QuadratoMagicoModel model = new QuadratoMagicoModel();
		
		int[][] sol= model.ricorsione(3, 0);
		
		for(int i=0; i<3; i++)
		{
			
			for(int j=0; j<3; j++)
			{
				System.out.print(sol[i][j] + " ");
			}
			
			System.out.print("\n");
			
		}
		

	}

}
