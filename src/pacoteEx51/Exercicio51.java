/**
 * Codigo referente ao Exerc�cio 51 da lista de exercicios(os outros est�o apenas no OneDrive).
 * @author Caio Cesar D.
 */
package pacoteEx51;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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
	Color cor01 = new Color(200,200,200);
	Color corSalvar = new Color(34,1,34);
	JButton button1 = new JButton("Cadastrar");
	JButton button2 = new JButton("Atualizar");
	JButton button3 = new JButton("Excluir");
	JButton button4 = new JButton("Consultar");
	JButton button5 = new JButton("Sair");
	JButton buttonSalvar = new JButton("Salvar");
	JProgressBar progresso = new JProgressBar();
	Font fonteLabel = new Font("Serif",Font.BOLD,20);
	String[][] Clientes = new String[100][4];
	JTextField nomeEnt = new JTextField(30);
	JTextField cpfEnt = new JTextField(11);
	JTextField cidadeEnt = new JTextField(30);
	JTextField estadoEnt = new JTextField(2);
	int tamanhoClientes;

	
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
		if(e.getSource() == buttonSalvar){
			Salvar(nomeEnt,cpfEnt,cidadeEnt,estadoEnt);
			Cadastrar();
		}
	}

	public Exercicio51() {	// CLASSE CONSTRUTOR
		//setLayout(new GridLayout(10,10));
		// usarNinbus();
		getContentPane().setBackground(Color.white);
		getContentPane().setForeground(Color.black);
		setResizable(false);
		getContentPane().setLayout(null);

		// Botoes
		getContentPane().add(button1);
		button1.setBackground(Color.gray);
		button1.setForeground(Color.white);
		button1.setToolTipText("Cadastrar um novo cliente");
		
		
		getContentPane().add(button2);
		button2.setBackground(Color.gray);
		button2.setForeground(Color.white);
		button2.setToolTipText("Atualizar ou editar os dados de um cliente");
		
		getContentPane().add(button3);
		button3.setBackground(Color.gray);
		button3.setForeground(Color.white);
		button3.setToolTipText("Excluir cadastros");
		
		getContentPane().add(button4);
		button4.setBackground(Color.gray);
		button4.setForeground(Color.white);
		button4.setToolTipText("Consultar cadastros");
		
		getContentPane().add(button5);
		button5.setBackground(cor01);
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
		lblSccSistema.setForeground(Color.black);
		
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
		JLabel cpf = new JLabel("CPF: ");
		JLabel cidade = new JLabel("Cidade: ");
		JLabel estado = new JLabel("Estado: ");
		
		painelCadastro.add(nome);
		nome.setBounds(2, 8, 55, 10);	
		painelCadastro.add(cpf);
		cpf.setBounds(2, 58, 30, 10);
		painelCadastro.add(cidade);
		cidade.setBounds(2, 108, 60, 10);
		painelCadastro.add(estado);
		estado.setBounds(2,158,50,10);
		
		painelCadastro.add(nomeEnt);
		nomeEnt.setBounds(48, 5, 400, 20);
		painelCadastro.add(cpfEnt);
		cpfEnt.setBounds(48, 55, 200, 20);
		painelCadastro.add(cidadeEnt);
		cidadeEnt.setBounds(48, 105, 250, 20);
		painelCadastro.add(estadoEnt);
		estadoEnt.setBounds(48, 155, 60, 20);
	
		getContentPane().add(painelCadastro);
		painelCadastro.setForeground(Color.white);
		painelCadastro.setBackground(cor01);
		painelCadastro.setBounds(159, 103, 549, 215);
		
		painelCadastro.add(buttonSalvar);
		buttonSalvar.setBounds(430,180,80,20);
		buttonSalvar.setBackground(corSalvar);
		buttonSalvar.setForeground(Color.white);
		buttonSalvar.addActionListener(this);
		
	}

	public void Atualizar() {
		JPanel painelAualizar = new JPanel();

		getContentPane().add(painelAualizar);
		painelAualizar.setBounds(159, 103, 549, 215);
		painelAualizar.setForeground(Color.WHITE);
		painelAualizar.setBackground(cor01);
	}

	public void Excluir() {
		JOptionPane.showMessageDialog(null, "Voce selecionou o botao para exclusao");
	}

	public void Consultar() {
		JPanel painelConsulta = new JPanel();
		
		getContentPane().add(painelConsulta);
		
		painelConsulta.setBounds(159, 103, 549, 215);
		painelConsulta.setForeground(Color.WHITE);
		painelConsulta.setBackground(cor01);
		
	}

	public void Sair() {
		//JOptionPane.showMessageDialog(null, "Saindo");
		System.exit(0);
	}
	
	public void Salvar(JTextField nome, JTextField cpf,JTextField cidade, JTextField estado){
		for(int i = 0; i< 3; i++){
			tamanhoClientes = Clientes.length - i;
			Clientes[i][0] = nome.getText();
			Clientes[i][1] = cpf.getText();
			Clientes[i][2] = cidade.getText();
			Clientes[i][3] = estado.getText();
			Cadastrar();
		}
		Imprimir();
		System.exit(0);
		
	}
	public void Imprimir(){
		for(int i = 0; i< tamanhoClientes; i++){
		for (int j = 0; j<4; j++){
			System.out.println(Clientes[i][j]);
		}
		
		}
	}
	
}
