package baza;

import java.awt.Color;
import java.awt.Component;
import java.util.EventObject;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

public class MojRender implements TableCellEditor {

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int i, int j) {
        JTextField editor = new JTextField();
        if (value != null) {
            editor.setText(value.toString());
        }
        if((i>=0&&i<=2)&&(j>=3&&j<=5))
        editor.setBackground(Color.WHITE);
        if((i>=3&&i<=5)&&(j>=0&&j<=2))
            editor.setBackground(Color.WHITE);
        if((i>=3&&i<=5)&&(j>=6&&j<=8))
            editor.setBackground(Color.WHITE);
        if((i>=6&&i<=8)&&(j>=3&&j<=5))
            editor.setBackground(Color.WHITE);
        return editor;
    }

	public void addCellEditorListener(CellEditorListener l) {
		// TODO Auto-generated method stub
		
	}

	public void cancelCellEditing() {
		// TODO Auto-generated method stub
		
	}

	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isCellEditable(EventObject anEvent) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeCellEditorListener(CellEditorListener l) {
		// TODO Auto-generated method stub
		
	}

	public boolean shouldSelectCell(EventObject anEvent) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean stopCellEditing() {
		// TODO Auto-generated method stub
		return false;
	}

	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		// TODO Auto-generated method stub
		return null;
	}

}
