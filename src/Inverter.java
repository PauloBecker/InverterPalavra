import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Inverter implements ActionListener {
	
	JLabel label;
	JTextField textField;
	JTextField textField2;
	JLabel resposta;
	
	public Inverter() {
		
		JFrame frame = new JFrame("Inverter");
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Digite um texto: ");
		frame.add(label);
		
		textField = new JTextField(10);
		textField.addActionListener(this);
		textField.setActionCommand("Enter");
		frame.add(textField);
		
		textField2 = new JTextField(10);
		frame.add(textField2);
		textField2.setEditable(false);
		
		JButton button = new JButton("Inverter");
		button.addActionListener(this);
		frame.add(button);
		
		resposta = new JLabel("");
		frame.add(resposta);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new Inverter();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(textField.getText().equals("")) {
			resposta.setText("Digite uma palavra!");
		}else {
			
			String palavra = textField.getText();
			String aux = "";
			
			for(int i = palavra.length()-1; i>=0; i--) {
				aux += palavra.charAt(i);
				
			}
			textField2.setText(aux);
			
		}
		textField.setText("");
	}

}




