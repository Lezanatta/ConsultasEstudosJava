package Estudos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JPanel;


public class Exercicio extends JFrame {
	private static final long serialVersionUID = 1L;
	private final JCheckBox Cor;
	private final JCheckBox Texto;
	private final JButton btn1;
	private final JButton btn2;
	private static JPanel panel;
	private static JComboBox<String> list;
	private static final String[] colorNames = {"Black", "Blue", "Cyan",
			"Dark Gray", "Gray", "Green", "Light Gray", "Magenta"};

	public Exercicio() {
		super("Selecionar Cor");
		Cor = new JCheckBox("Background");
		Texto = new JCheckBox("Forground");
		btn1 = new JButton("ok");
		btn2 = new JButton("cancel");
		panel = new JPanel();
		panel.setLayout(new FlowLayout(1,20,20));
		setLayout(new BorderLayout());
		list = new JComboBox<String>(colorNames);
		panel.add(Cor);
		panel.add(Texto);
		panel.add(btn1);
		panel.add(btn2);
		add(list,BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		Exercicio e = new Exercicio();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setSize(300, 200);
		e.setLocation(300, 300);
		e.setVisible(true);
	}

}
