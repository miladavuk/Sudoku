package baza;

import java.util.Random;

public class Sudoku {
	
	
	public char [][] vratiRandomMatricu(){
		
		Matrice mat = new Matrice();
		
		Random rand = new Random();
		int randBroj = rand.nextInt(10);
		switch(randBroj){
			
			case 0:
				return mat.getMatrica1();
				
			case 1:
				return mat.getMatrica2();
				
			case 2:
				return mat.getMatrica3();
				
			case 3:
				return mat.getMatrica4();
				
			case 4:
				return mat.getMatrica5();
				
			case 5:
				return mat.getMatrica6();
				
			case 6:
				return mat.getMatrica7();
				
			case 7:
				return mat.getMatrica8();
				
			case 8:
				return mat.getMatrica9();
				
			case 9:
				return mat.getMatrica10();
						
		}
		return null;	
		
	}
	
	public char [][] vratiMatricuZaPrikaz(char [][] randomMatrica){
		
		for (int i = 0; i < randomMatrica.length; i++) {
			for (int j = 0; j < randomMatrica.length; j++) {
				if(j%3==0){
					continue;
				}
				else randomMatrica[i][j]= ' ';
				
			}
			
		}
		
		return randomMatrica;
	}

}
