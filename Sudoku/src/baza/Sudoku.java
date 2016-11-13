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
	
	public char [][] vratiMatricuZaPrikaz(char[][] randomMatrica){
		
		char[][] matricaZaPrikaz = new char [9][9];
		
		for (int i = 0; i < randomMatrica.length; i++) {
			for (int j = 0; j < randomMatrica.length; j++) {
				if((i%2==0)&&(j%2==1)||(i%2==1 &&j%4==0)){
					matricaZaPrikaz[i][j] = randomMatrica[i][j];
				}
				else matricaZaPrikaz[i][j]= ' ';
				
			}
			
		}
		
		return matricaZaPrikaz;
	}
	public char[][] vratiUnetuMatricu(){
		//ispisi metodu
		return null;
	}
	
	public boolean uporediMatrice(char[][] unetaMatrica, char[][] trazenaMatrica){
		
		for (int i = 0; i < trazenaMatrica.length; i++) {
			for (int j = 0; j < trazenaMatrica.length; j++) {
				if(unetaMatrica[i][j] != trazenaMatrica[i][j])
					return false;
			}
		}
		return true;	
		
	}

	public boolean proveriUnos(Object value) {
		
		if(value instanceof String){
			String stringValue = (String) value;
			char [] charNiz = new char [stringValue.trim().toCharArray().length];
			charNiz = stringValue.trim().toCharArray();		
			char charValue = charNiz[0];
			if(charValue=='1'||charValue=='2'||charValue=='3'||charValue=='4'||charValue=='5'
					||charValue=='6'||charValue=='7'||charValue=='8'||charValue=='9')
				return true;
			}
			else if(value instanceof Character){
				char charValue = (Character) value;
				if(charValue=='1'||charValue=='2'||charValue=='3'||charValue=='4'||charValue=='5'
						||charValue=='6'||charValue=='7'||charValue=='8'||charValue=='9')
					return true;
			}

		return false;
	}

}
