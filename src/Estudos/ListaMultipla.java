package Estudos;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class ListaMultipla extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JList<String> colorJList; // lista para armazenar nomes de cor
	private final JList<String> copyJList; // lista para armazenar nomes copiados
	private JButton copyJButton; // botão para copiar nomes selecionados
	private static final String[] colorNames = {"Black", "Blue", "Cyan",
			"Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
			"Pink", "Red", "White", "Yellow"};
	
	public ListaMultipla()
	{
		super("Multiple Selection Lists");
		setLayout(new FlowLayout());
		colorJList = new JList<String>(colorNames); // lista dos nomes de cores
		colorJList.setVisibleRowCount(5); // mostra cinco linhas
		colorJList.setSelectionMode( 
		ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList)); // adiciona lista com scrollpane
		copyJButton = new JButton("Copy >>>");
		copyJButton.addActionListener(
				new ActionListener() // classe interna anônima
				{
					@Override
					public void actionPerformed(ActionEvent event){
						copyJList.setListData( 
								colorJList.getSelectedValuesList().toArray(
										new String[0]));
						}	
				}
			);
				
		add(copyJButton); // adiciona botão de cópia ao JFrame
		
		copyJList = new JList<String>(); // lista para armazenar nomes copiados
		copyJList.setVisibleRowCount(5); // mostra 5 linhas
		copyJList.setFixedCellWidth(100); // configura a larguraÿ
		copyJList.setFixedCellHeight(15); // configura a altura ÿ
		copyJList.setSelectionMode( 
				ListSelectionModel.SINGLE_INTERVAL_SELECTION); 
		add(new JScrollPane(copyJList)); // adiciona lista com scrollpane
}

	public static void main(String[] args) {
		ListaMultipla multipleSelectionFrame =
		new ListaMultipla();
		multipleSelectionFrame.setDefaultCloseOperation(
		JFrame.EXIT_ON_CLOSE);
		multipleSelectionFrame.setSize(350, 150);
		multipleSelectionFrame.setLocation(350,250);
		multipleSelectionFrame.setVisible(true);

	}

}
