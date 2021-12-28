package Estudos;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClassCheckBox extends JFrame{
	private static final long serialVersionUID = 1L;
	private final JTextField textField;
	private final JCheckBox boldJCheckBox;
	private final JCheckBox italicJCheckBox;
	
	public ClassCheckBox() {
		//TITULO
		super("Caixa de seleção");
		setLayout(new FlowLayout());
		textField = new JTextField("Watch the font style change", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 20));
		add(textField); // adiciona textField ao JFrame
		boldJCheckBox = new JCheckBox("Negrito");
		italicJCheckBox = new JCheckBox("Italic");
		add(boldJCheckBox);
		add(italicJCheckBox);
		
		
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJCheckBox.addItemListener(handler);
		italicJCheckBox.addItemListener(handler);
		
	}
	public static void main(String[] args) {
		ClassCheckBox checkBoxFrame = new ClassCheckBox();
		checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkBoxFrame.setSize(475, 200);
		checkBoxFrame.setLocation(300,300);
		checkBoxFrame.setVisible(true);
		
	}
	
	private class CheckBoxHandler implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent event) {
			Font font = null; // armazena a nova Font
			
			if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
			else if (boldJCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD, 20);
			else if (italicJCheckBox.isSelected())
				font = new Font("Serif", Font.ITALIC, 20);
			else
				font = new Font("Serif", Font.PLAIN, 20);
			
			textField.setFont(font);
		}
	}
} 
