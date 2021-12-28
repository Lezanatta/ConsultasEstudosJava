package Estudos;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class PanelExample extends JFrame{
	private static final long serialVersionUID = 1L;
	private final JPanel buttonJPanel; // painel para armazenar botões
	private final JButton[] buttons;
	// construtor sem argumento
	
	public PanelExample()
	{	
		super("Panel Demo");
		buttons = new JButton[5];
		buttonJPanel = new JPanel(); 
		buttonJPanel.setLayout(new GridLayout(1, buttons.length));
		// cria e adiciona botões
		for (int count = 0; count < buttons.length; count++)
		{
		buttons[count] = new JButton("Button " + (count + 1));
		buttonJPanel.add(buttons[count]);
		}
		add(buttonJPanel,BorderLayout.SOUTH);
		}// adiciona botão ao paine

	public static void main(String[] args) {
		PanelExample panelFrame = new PanelExample();
		panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelFrame.setSize(450, 200);
		panelFrame.setVisible(true);

	}

}
