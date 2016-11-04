package baza;

import javax.swing.table.AbstractTableModel;

public class Tabela extends AbstractTableModel{
	
	private char[][] tabelaZaPrikaz;
	
	
	

	public Tabela(char[][] tabelaZaPrikaz) {		
		this.tabelaZaPrikaz = tabelaZaPrikaz;
		fireTableDataChanged();
		
	}


	public char[][] getTabelaZaPrikaz() {
		return tabelaZaPrikaz;
		
	}

	

	public int getColumnCount() {
		return 9;
	}

	public int getRowCount() {
		return 9;
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		return tabelaZaPrikaz[rowIndex][columnIndex];
	}

}
