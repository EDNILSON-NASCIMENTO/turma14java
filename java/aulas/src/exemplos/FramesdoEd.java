package exemplos;

import javax.swing.JFrame;

public class FramesdoEd {

	public static void main(String[] args) 
	{
		JFrame janela = new JFrame();
		String titulo = "Minha Janela";
		
		janela.setTitle(titulo);
		janela.setSize(300, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		

	}

}
