package exemplos;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class JanelaSenha {

	public static void main(String[] args) 
	{
	
		
		String nome = JOptionPane.showInputDialog("Nome do usuario:");
		String pass = JOptionPane.showInputDialog("Senha:" );
		//JPasswordField pass = new JPasswordField();
		//pass.setEchoChar('*');
		
		
		if ( (nome!= null && pass != null) && nome.equals("ED") && pass.equals("swordfish")) 
		{
			JOptionPane.showMessageDialog(null, "Você esta conectado");
		} else {
			JOptionPane.showMessageDialog(null, "Invasão, rala peito!!!");
		}
			
		
				
	}

}
