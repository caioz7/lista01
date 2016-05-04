/**
 * Codigo referente ao Exerc�cio 51 da lista de exercicios(os outros est�o apenas no OneDrive).
 * @author Caio Cesar D.
 */
package pacoteEx51;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercicio51 extends JFrame implements ActionListener {

	JFrame janela = new JFrame();
	
	JButton button1 = new JButton("Cadastrar");
	JButton button2 = new JButton("Atualizar");
	JButton button3 = new JButton("Excluir");
	JButton button4 = new JButton("Consultar");
	JButton button5 = new JButton("Sair");
	JProgressBar progresso = new JProgressBar();
	Font fonteLabel = new Font("Serif",Font.BOLD,20);
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

	public Exercicio51() {	// CLASSE CONSTRUTOR
		
		// usarNinbus();
		getContentPane().setBackground(Color.black);
		getContentPane().setForeground(Color.white);
		setResizable(false);
		getContentPane().setLayout(null);

		// Botoes
		getContentPane().add(button1);
		button1.setBackground(Color.white);
		button1.setForeground(Color.black);
		button1.setToolTipText("Cadastrar um novo cliente");
		
		
		getContentPane().add(button2);
		button2.setBackground(Color.white);
		button2.setForeground(Color.black);
		button2.setToolTipText("Atualizar ou editar os dados de um cliente");
		
		getContentPane().add(button3);
		button3.setBackground(Color.white);
		button3.setForeground(Color.black);
		button3.setToolTipText("Excluir cadastros");
		
		getContentPane().add(button4);
		button4.setBackground(Color.white);
		button4.setForeground(Color.black);
		button4.setToolTipText("Consultar cadastros");
		
		getContentPane().add(button5);
		button5.setBackground(Color.GRAY);
		button5.setForeground(Color.WHITE);
		button5.setToolTipText("Encerrar aplicativo");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

		button1.setBounds(114, 66, 100, 25);
		button1.setToolTipText("Opcao de cadastro.");
		button2.setBounds(273, 66, 100, 25);
		button3.setBounds(461, 66, 100, 25);
		button4.setBounds(632, 66, 100, 25);
		button5.setBounds(747, 322, 100, 35);

		// Dados da Janela
		JLabel lblSccSistema = new JLabel("SCC - SISTEMA DE CADASTRO DE CLIENTES");
		lblSccSistema.setBounds(220, 12, 500, 24);
		getContentPane().add(lblSccSistema);
		lblSccSistema.setFont(fonteLabel);
		lblSccSistema.setForeground(Color.white);
		
		progresso.setToolTipText("Cadastros ja utilizados");
		progresso.setStringPainted(true);
		progresso.setBounds(220, 337, 382, 19);
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
		JPanel painelCadastro = new JPanel();
		JLabel nome = new JLabel("Nome: ");
		JTextField nomeEnt = new JTextField(30);
		painelCadastro.add(nome);
		painelCadastro.add(nomeEnt);
		nomeEnt.setBounds(40, 5, 300, 18);
	
		System.out.println();
		nome.setForeground(Color.black);
		nome.setBounds(0, 8, 55, 10);
		
		
		getContentPane().add(painelCadastro);

		painelCadastro.setForeground(Color.black);
		painelCadastro.setBackground(Color.white);
		painelCadastro.setBounds(159, 103, 549, 215);
		
	}

	public void Atualizar() {
		JPanel painelAualizar = new JPanel();

		getContentPane().add(painelAualizar);
		painelAualizar.setBounds(159, 103, 549, 215);
		painelAualizar.setForeground(Color.WHITE);
		painelAualizar.setBackground(Color.GRAY);
	}

	public void Excluir() {
		JOptionPane.showMessageDialog(null, "Voce selecionou o botao para exclusao");
	}

	public void Consultar() {
		JPanel painelConsulta = new JPanel();
		
		getContentPane().add(painelConsulta);
		
		painelConsulta.setBounds(159, 103, 549, 215);
		painelConsulta.setForeground(Color.WHITE);
		painelConsulta.setBackground(Color.GRAY);
		

	}

	public void Sair() {
		JOptionPane.showMessageDialog(null, "Saindo");
		System.exit(0);
	}
}
