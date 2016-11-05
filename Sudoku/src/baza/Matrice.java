package baza;

public class Matrice {
	
	private final char [][] matrica1 = {{'5','3','4','6','7','8','9','1','2'},
								        {'6','7','2','1','9','5','3','4','8'},
								        {'1','9','8','3','4','2','5','6','7'},
								        {'8','5','9','7','6','1','4','2','3'},
								        {'4','2','6','8','5','3','7','9','1'},
								        {'7','1','3','9','2','4','8','5','6'},
								        {'9','6','1','5','3','7','2','8','4'},
								        {'2','8','7','4','1','9','6','3','5'},
	        						    {'3','4','5','2','8','6','1','7','9'}};
						
	private final char [][] matrica2 = {{'9','1','5','7','2','3','4','6','8'},
										{'7','6','3','8','9','4','5','2','1'},
										{'2','4','8','5','1','6','7','9','3'},
										{'4','8','2','6','7','5','3','1','9'},
										{'1','5','9','3','8','2','6','7','4'},
										{'6','3','7','9','4','1','2','8','5'},
										{'5','9','1','2','3','7','8','4','6'},
										{'8','2','6','4','5','9','1','3','7'},
										{'3','7','4','1','6','8','9','5','2'}};
	
	private final char [][] matrica3 = {{'2','4','8','3','9','5','7','1','6'},
			                            {'5','7','1','6','2','8','3','4','9'},
		                                {'9','3','6','7','4','1','5','8','2'},
		 	                            {'6','8','2','5','3','9','1','7','4'},
			                            {'3','5','9','1','7','4','6','2','8'},
			                            {'7','1','4','8','6','2','9','5','3'},
			                            {'8','6','3','4','1','7','2','9','5'},
			                            {'1','9','5','2','8','6','4','3','7'},
			                            {'4','2','7','9','5','3','8','6','1'}};
	
	private final char [][] matrica4 = {{'2','9','6','3','1','8','5','7','4'},
		                                {'5','8','4','9','7','2','6','1','3'},
		                                {'7','1','3','6','4','5','2','8','9'},
		                                {'6','2','5','8','9','7','3','4','1'},
		                                {'9','3','1','4','2','6','8','5','7'},
		                                {'4','7','8','5','3','1','9','2','6'},
		                                {'1','6','7','2','5','3','4','9','8'},
		                                {'8','5','9','7','6','4','1','3','2'},
		                                {'3','4','2','1','8','9','7','6','5'}};
	
	private final char [][] matrica5 = {{'8','2','7','1','5','4','3','9','6'},
										{'9','6','5','3','2','7','1','4','8'},
										{'3','4','1','6','8','9','7','5','2'},
										{'5','9','3','4','6','8','2','7','1'},
										{'4','7','2','5','1','3','6','8','9'},
										{'6','1','8','9','7','2','4','3','5'},
										{'7','8','6','2','3','5','9','1','4'},
										{'1','5','4','7','9','6','8','2','3'},
										{'2','3','9','8','4','1','5','6','7'}};
	
	private final char [][] matrica6 = {{'3','9','6','4','1','5','2','7','8'},
										{'1','2','5','7','3','8','4','6','9'},
										{'4','7','8','2','6','9','3','1','5'},
										{'7','5','9','6','4','2','8','3','1'},
										{'8','4','3','5','9','1','7','2','6'},
										{'2','6','1','3','8','7','5','9','4'},
										{'5','3','4','9','2','6','1','8','7'},
										{'6','8','7','1','5','3','9','4','2'},
										{'9','1','2','8','7','4','6','5','3'}};
	
	private final char [][] matrica7 = {{'9','5','4','8','7','2','3','1','6'},
										{'8','6','1','9','4','3','7','2','5'},
										{'3','2','7','6','5','1','4','9','8'},
										{'1','3','2','5','9','7','8','6','4'},
										{'7','4','9','2','8','6','5','3','1'},
										{'5','8','6','1','3','4','2','7','9'},
										{'2','9','8','7','6','5','1','4','3'},
										{'4','1','5','3','2','9','6','8','7'},
										{'6','7','3','4','1','8','9','5','2'}};
	
	private final char [][] matrica8 = {{'5','6','3','2','1','9','8','4','7'},
										{'7','1','8','4','5','3','9','2','6'},
										{'2','9','4','6','7','8','3','1','5'},
										{'1','2','5','7','9','6','4','3','8'},
										{'6','8','7','3','4','2','1','5','9'},
										{'3','4','9','1','8','5','7','6','2'},
										{'4','5','1','8','2','7','6','9','3'},
										{'9','7','6','5','3','1','2','8','4'},
										{'8','3','2','9','6','4','5','7','1'}};
	
	private final char [][] matrica9 = {{'2','4','6','8','5','7','9','1','3'},
										{'1','8','9','6','4','3','2','7','5'},
										{'5','7','3','2','9','1','4','8','6'},
										{'4','1','8','3','2','9','5','6','7'},
										{'6','3','7','4','8','5','1','2','9'},
										{'9','5','2','1','7','6','3','4','8'},
										{'7','6','4','5','3','2','8','9','1'},
										{'3','2','1','9','6','8','7','5','4'},
										{'8','9','5','7','1','4','6','3','2'}};
	
	private final char [][] matrica10 = {{'2','1','5','6','4','7','3','9','8'},
										 {'3','6','8','9','5','2','1','7','4'},
										 {'7','9','4','3','8','1','6','5','2'},
										 {'5','8','6','2','7','4','9','3','1'},
										 {'1','4','2','5','9','3','8','6','7'},
										 {'9','7','3','8','1','6','4','2','5'},
										 {'8','2','1','7','3','9','5','4','6'},
										 {'6','5','9','4','2','8','7','1','3'},
										 {'4','3','7','1','6','5','2','8','9'}};

	public char[][] getMatrica1() {
		return matrica1;
	}

	public char[][] getMatrica2() {
		return matrica2;
	}

	public char[][] getMatrica3() {
		return matrica3;
	}

	public char[][] getMatrica4() {
		return matrica4;
	}

	public char[][] getMatrica5() {
		return matrica5;
	}

	public char[][] getMatrica6() {
		return matrica6;
	}

	public char[][] getMatrica7() {
		return matrica7;
	}

	public char[][] getMatrica8() {
		return matrica8;
	}

	public char[][] getMatrica9() {
		return matrica9;
	}

	public char[][] getMatrica10() {
		return matrica10;
	}
	
	public void odstampajMatricu(char [][] matrica){
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				
				System.out.print(matrica[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	

}
