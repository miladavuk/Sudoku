package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import baza.Matrice;
import baza.Sudoku;
import baza.Tabela;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class GlavniProzor extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;	
	private char[][] unetaMatrica;
	private char[][] randomMatrica;
	private JPanel panelZaDugmice;
	private JPanel panel;
	private JButton btnTry;
	private JButton btnGiveUp;
	Sudoku sudoku = new Sudoku();
	private JButton btnBegin;
	private Tabela tabelaZaPrikaz;
	/**
	 * Create the frame.
	 */
	public GlavniProzor() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(GlavniProzor.class.getResource("../s1.png")));
		setForeground(Color.BLUE);
		setFont(new Font("Tahoma", Font.PLAIN, 12));
		setTitle("Sudoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 292);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getPanelZaDugmice(), BorderLayout.EAST);
		contentPane.add(getPanel(), BorderLayout.SOUTH);
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setMaximumSize(new Dimension(32767, 202));
			scrollPane.setPreferredSize(new Dimension(480, 200));
		
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setColumnSelectionAllowed(true);
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					int rowIndex = table.getSelectedRow();
					int columnIndex = table.getSelectedColumn();					
					table.getCellEditor(rowIndex, columnIndex).addCellEditorListener(new CellEditorListener() {
						
						public void editingStopped(ChangeEvent arg0) {
							int rowIndex = table.getSelectedRow();
							int columnIndex = table.getSelectedColumn();
							Object value =  table.getValueAt(rowIndex, columnIndex);
							boolean ispravanUnos = sudoku.proveriUnos(value);
							
							if(ispravanUnos)
							tabelaZaPrikaz.setValueAt(value, rowIndex, columnIndex);
							else{
								JOptionPane.showMessageDialog(contentPane,
										"Incorrect input, only numbers 1-9 allowed!", "Error",0);								
								tabelaZaPrikaz.setValueAt(' ', rowIndex, columnIndex);
								return;
								
								}
						}
						
						public void editingCanceled(ChangeEvent arg0) {
							// TODO Auto-generated method stub
							
						}
					});
						
						
					
				}
			});
			table.setCellSelectionEnabled(true);
			table.setRowHeight(25);
			table.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));			
			table.setBackground(Color.ORANGE);					
			table.setForeground(new Color(0, 0, 139));
			table.setFont(new Font("Tahoma", Font.BOLD, 16));
			table.setPreferredSize(new Dimension(480, 18));
			table.setFillsViewportHeight(true);
			table.setShowHorizontalLines(true);
			DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer)
			table.getDefaultRenderer(String.class);
			stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);		
			table.setTableHeader(null);
		
		}
		return table;
	}
	
	private JPanel getPanelZaDugmice() {
		if (panelZaDugmice == null) {
			panelZaDugmice = new JPanel();
			panelZaDugmice.setBackground(Color.BLACK);
			panelZaDugmice.setPreferredSize(new Dimension(125, 300));
			panelZaDugmice.setLayout(null);
			panelZaDugmice.add(getBtnTry());
			panelZaDugmice.add(getBtnGiveUp());			
			panelZaDugmice.add(getBtnBegin());
			getBtnTry().setEnabled(false);
			getBtnGiveUp().setEnabled(false);
		}
		return panelZaDugmice;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.BLACK);
			panel.setPreferredSize(new Dimension(500, 25));
		}
		return panel;
	}
	private JButton getBtnTry() {
		if (btnTry == null) {
			btnTry = new JButton("Try");
			btnTry.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					unetaMatrica = tabelaZaPrikaz.getTabelaZaPrikaz();										
					char[][] trazenaMatrica = randomMatrica;
					boolean iste = sudoku.uporediMatrice(unetaMatrica, trazenaMatrica);
					if(iste){
						GUIKontrolor.prikaziPobedu();
					}else {
						int opcija = JOptionPane.showConfirmDialog
								(contentPane, "You did not enter the correct values! Try again?", "Incorrect input", JOptionPane.YES_NO_OPTION);
						if (opcija == JOptionPane.YES_OPTION)
							return;
						if (opcija == JOptionPane.NO_OPTION) {							
							System.exit(0);
						}
					}
						}
				
			});
			btnTry.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnTry.setForeground(new Color(51, 204, 255));
			btnTry.setBackground(Color.DARK_GRAY);
			btnTry.setBounds(10, 113, 100, 31);
			
		}
		return btnTry;
	}
	private JButton getBtnGiveUp() {
		if (btnGiveUp == null) {
			btnGiveUp = new JButton("Give up");
			btnGiveUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int opcija = JOptionPane.showConfirmDialog
							(contentPane, "Are you sure you want to give up?", "Leaving", JOptionPane.YES_NO_OPTION);
					if (opcija == JOptionPane.YES_OPTION)
						System.exit(0);
					if (opcija == JOptionPane.NO_OPTION) {							
						return;
					}
				}
			});
			btnGiveUp.setForeground(Color.RED);
			btnGiveUp.setBackground(Color.DARK_GRAY);
			btnGiveUp.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnGiveUp.setBounds(10, 169, 100, 31);
			
		}
		return btnGiveUp;
	}
	private JButton getBtnBegin() {
		if (btnBegin == null) {
			btnBegin = new JButton("Begin");
			btnBegin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					getBtnTry().setEnabled(true);
					getBtnGiveUp().setEnabled(true);					
					panelZaDugmice.add(getBtnTry());
					panelZaDugmice.add(getBtnGiveUp());
					
					getScrollPane().setViewportView(getTable());
					randomMatrica = sudoku.vratiRandomMatricu();	
					Matrice mat = new Matrice();
					mat.odstampajMatricu(randomMatrica);
					char[][] matricaZaPrikaz = sudoku.vratiMatricuZaPrikaz(randomMatrica);
					tabelaZaPrikaz = new Tabela(matricaZaPrikaz);
					table.setModel(tabelaZaPrikaz);	
					
					
				}
			});
			btnBegin.setForeground(Color.YELLOW);
			btnBegin.setBackground(Color.DARK_GRAY);
			btnBegin.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnBegin.setBounds(10, 19, 100, 31);
		}
		return btnBegin;
	}
}
