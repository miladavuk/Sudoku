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
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
