/**
 * Codigo referente ao Exerc�cio 51 da lista de exercicios(os outros est�o apenas no OneDrive).
 * @author Caio Cesar D.
 */
package pacoteEx51;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.AncestorListener;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;

public class Exercicio51 extends JFrame implements ActionListener {

	JFrame janela = new JFrame();
	JFrame janelaCadastro = new JFrame();
	JButton button1 = new JButton("Cadastrar");
	JButton button2 = new JButton("Atualizar");
	JButton button3 = new JButton("Excluir");
	JButton button4 = new JButton("Consultar");
	JButton button5 = new JButton("Sair");
	JProgressBar progresso = new JProgressBar();
	
	String[][] Clientes = new String[100][4];
	int QuantidadeClientes = Clientes.length;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			Cadastrar();
		}
		if (e.getSource() == button2) {
			Atualizar();
		}
		if (e.getSource() == button3) {
			Excluir();
		}
		if (e.getSource() == button4) {
			Consultar();
		}
		if (e.getSource() == button5) {
			Sair();
		}
	}

	// CLASSE CONSTRUTOR
	public Exercicio51() {
		// usarNinbus();
		getContentPane().setBackground(Color.black);
		getContentPane().setForeground(Color.white);
		setResizable(false);
		getContentPane().setLayout(null);

		// Botoes
		getContentPane().add(button1);
		button1.setBackground(Color.white);
		button1.setForeground(Color.black);
		getContentPane().add(button2);
		button2.setBackground(Color.white);
		button2.setForeground(Color.black);
		button2.setToolTipText("Atualizar ou editar os dados de um cliente");
		getContentPane().add(button3);
		button3.setBackground(Color.white);
		button3.setForeground(Color.black);
		getContentPane().add(button4);
		button4.setBackground(Color.white);
		button4.setForeground(Color.black);
		getContentPane().add(button5);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

		button1.setBounds(114, 66, 100, 35);
		button1.setToolTipText("Opcao de cadastro.");
		button2.setBounds(273, 66, 100, 35);
		button3.setBounds(461, 66, 100, 35);
		button4.setBounds(632, 66, 100, 35);
		getBackground();
		button5.setBackground(Color.GRAY);
		getForeground();
		button5.setForeground(Color.WHITE);
		button5.setBounds(747, 322, 100, 35);

		// Dados da Janela
		JLabel lblSccSistema = new JLabel("SCC - Sistema de Cadastro de Clientes");
		lblSccSistema.setBounds(325, 12, 300, 24);
		getContentPane().add(lblSccSistema);
		lblSccSistema.setForeground(Color.white);
		
		progresso.setToolTipText("Cadastros ja utilizados");
		progresso.setStringPainted(true);
		progresso.setBounds(193, 337, 382, 19);
		getContentPane().add(progresso);
		progresso.setStringPainted(true);
		progresso.setForeground(Color.white);
		

		setTitle("Cadastro de clientes");
		setVisible(true);
		setSize(900, 420);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	/**
	 * public void usarNinbus(){ try { for (LookAndFeelInfo info :
	 * UIManager.getInstalledLookAndFeels()) { if
	 * ("Nimbus".equals(info.getName())) {
	 * UIManager.setLookAndFeel(info.getClassName()); break; } } } catch
	 * (UnsupportedLookAndFeelException e) { // handle exception } catch
	 * (ClassNotFoundException e) { // handle exception } catch
	 * (InstantiationException e) { // handle exception } catch
	 * (IllegalAccessException e) { // handle exception } }
	 */

	public static void main(String[] args) {
		// usarNinbus();
		new Exercicio51();

	}

	// Funcoes
	public void Cadastrar() {
		/**janelaCadastro.setLocationRelativeTo(null);
		
		janelaCadastro.setLocale(null);
		janelaCadastro.setTitle("Tela de Cadastro");
		janelaCadastro.setVisible(true);
		janelaCadastro.setSize(300, 250);
		janelaCadastro.setResizable(false);
		*/
		janelaCadastro.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void Atualizar() {

		JOptionPane.showInputDialog("Voce selecionou o botao para atualizacao");
	}

	public void Excluir() {
		JOptionPane.showMessageDialog(null, "Voce selecionou o botao para exclusao");
	}

	public void Consultar() {
		
		JOptionPane.showInputDialog("Informe o nome a ser consultado");

	}

	public void Sair() {
		JOptionPane.showMessageDialog(null, "Saindo");
		System.exit(0);
	}
}
