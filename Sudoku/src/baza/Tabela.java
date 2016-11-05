package baza;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class Tabela extends AbstractTableModel{
	
	private char[][] tabelaZaPrikaz;
	
	
	

	public Tabela(char[][] tabelaZaPrikaz) {		
		this.tabelaZaPrikaz = tabelaZaPrikaz;
		fireTableDataChanged();
		
	}


	public char[][] getTabelaZaPrikaz() {
		return tabelaZaPrikaz;
		
	}

	 public boolean isCellEditable(int row, int col) {
         return true;
     }
	 
	 @Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		super.addTableModelListener(l);
	}
	 
	 @Override
	public void fireTableCellUpdated(int row, int column) {
		// TODO Auto-generated method stub
		super.fireTableCellUpdated(row, column);
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
	
	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		
		if(value instanceof String){
		String stringValue = (String) value;
		char [] charNiz = new char [stringValue.trim().toCharArray().length];
		charNiz = stringValue.trim().toCharArray();		
		tabelaZaPrikaz[rowIndex][columnIndex]=  charNiz[0];
		fireTableCellUpdated(rowIndex, columnIndex);	
		}
		else if(value instanceof Character){
			tabelaZaPrikaz[rowIndex][columnIndex]=  (Character) value;
			fireTableCellUpdated(rowIndex, columnIndex);
		}
		
	}	

}
