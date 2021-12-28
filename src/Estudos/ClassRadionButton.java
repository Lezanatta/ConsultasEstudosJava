package Estudos;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ClassRadionButton extends JFrame{
	private static final long serialVersionUID = 1L;
	private final JTextField textField; // utilizado para exibir altera��es de fonte
	private final Font plainFont; // fonte para texto simples
	private final Font boldFont; // fonte para texto em negrito
	private final Font italicFont; // fonte para texto em it�lico
	private final Font boldItalicFont; // fonte para texto em negrito e it�lico
	private final JRadioButton plainJRadioButton; // seleciona texto simples 
	private final JRadioButton boldJRadioButton; // seleciona texto em negrito 
	private final JRadioButton italicJRadioButton; // seleciona texto em it�lico
	private final JRadioButton boldItalicJRadioButton; // negrito e it�lico 
	private final ButtonGroup radioGroup; // cont�m bot�es de op��o
	
	public ClassRadionButton() {
		super("Teste do radio button");
		setLayout(new FlowLayout());
		textField = new JTextField("Watch the font style change", 25);
		add(textField); // adiciona textField ao JFrame
		plainJRadioButton = new JRadioButton("Plain", true); 
		boldJRadioButton = new JRadioButton("Bold", false); 
		italicJRadioButton = new JRadioButton("Italic", false); 
		boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
		add(plainJRadioButton); // adiciona bot�o no estilo simples ao JFrame
		add(boldJRadioButton); // adiciona bot�o de negrito ao JFrame
		add(italicJRadioButton); // adiciona bot�o de it�lico ao JFrame
		add(boldItalicJRadioButton); // adiciona bot�o de negrito e it�lico
		radioGroup = new ButtonGroup(); // cria ButtonGroup 
		radioGroup.add(plainJRadioButton); // adiciona texto simples ao grupo�
		radioGroup.add(boldJRadioButton); // adiciona negrito ao grupo 
		radioGroup.add(italicJRadioButton); // adiciona it�lico ao grupo 
		radioGroup.add(boldItalicJRadioButton); // adiciona negrito e it�lic
		
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);
		plainJRadioButton.addItemListener( 
				new RadioButtonHandler(plainFont)); 
		boldJRadioButton.addItemListener(
				new RadioButtonHandler(boldFont)); 
		italicJRadioButton.addItemListener( 
				new RadioButtonHandler(italicFont)); 
		boldItalicJRadioButton.addItemListener( 
				new RadioButtonHandler(boldItalicFont));
	}
	public static void main(String[] args){
		ClassRadionButton radioButtonFrame = new ClassRadionButton();
		radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radioButtonFrame.setSize(350, 200);
		radioButtonFrame.setLocation(300,300);
		radioButtonFrame.setVisible(true);
	}
	
	private class RadioButtonHandler implements ItemListener {
		private Font font;
		
		public RadioButtonHandler(Font f)
		{
		font = f;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			textField.setFont(font);			
		}
	}
}
