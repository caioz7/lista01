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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import sun.awt.RepaintArea;

public class Exercicio51 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	int codCliente = 0;
	JFrame janela = new JFrame();
	Color cor01 = new Color(200, 200, 200);
	Color corSalvar = new Color(34, 1, 34);
	JButton button1 = new JButton("Cadastrar");
	JButton button2 = new JButton("Atualizar");
	JButton button3 = new JButton("Excluir");
	JButton button4 = new JButton("Consultar");
	JButton button5 = new JButton("Sair");

	JButton buttonSalvar = new JButton("Salvar");
	JProgressBar progresso = new JProgressBar();
	Font fonteLabel = new Font("Serif", Font.BOLD, 20);
	JPanel painelCadastro = new JPanel();
	JPanel painelAualizar = new JPanel();
	JPanel painelConsulta = new JPanel();
	JLabel nome = new JLabel("Nome: ");
	JLabel cpf = new JLabel("CPF: ");
	JLabel cidade = new JLabel("Cidade: ");
	JLabel estado = new JLabel("Estado: ");
	JTextField nomeEnt = new JTextField(30);
	JTextField cpfEnt = new JTextField(11);
	JTextField cidadeEnt = new JTextField(30);
	JTextField estadoEnt = new JTextField(2);
	String[][] clientes = new String[100][4];

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
		if (e.getSource() == buttonSalvar) {
			Salvar();
			codCliente++;
		}
	}

	public Exercicio51() { // CLASSE CONSTRUTOR

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
		progresso.setBackground(Color.white);
		progresso.setForeground(Color.blue);
		progresso.setBounds(220, 337, 382, 19);
		getContentPane().add(progresso);

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
		getContentPane().add(painelCadastro);
		painelCadastro.setForeground(Color.white);
		painelCadastro.setBackground(cor01);
		painelCadastro.setBounds(159, 103, 549, 215);
		repaint();

		painelCadastro.add(nome);
		nome.setBounds(2, 8, 55, 10);
		painelCadastro.add(cpf);
		cpf.setBounds(2, 58, 30, 10);
		painelCadastro.add(cidade);
		cidade.setBounds(2, 108, 60, 10);
		painelCadastro.add(estado);
		estado.setBounds(2, 158, 50, 10);
		// textfields
		painelCadastro.add(nomeEnt);
		nomeEnt.setBounds(48, 5, 400, 20);
		nomeEnt.setText(null);
		painelCadastro.add(cpfEnt);
		cpfEnt.setBounds(48, 55, 200, 20);
		cpfEnt.setText(null);
		painelCadastro.add(cidadeEnt);
		cidadeEnt.setBounds(48, 105, 250, 20);
		cidadeEnt.setText(null);
		painelCadastro.add(estadoEnt);
		estadoEnt.setBounds(48, 155, 60, 20);
		estadoEnt.setText(null);

		painelCadastro.add(buttonSalvar);
		buttonSalvar.setBounds(430, 180, 80, 30);
		buttonSalvar.setBackground(corSalvar);
		buttonSalvar.setForeground(Color.white);
		buttonSalvar.addActionListener(this);
		int atualCod = codCliente;
		JLabel codigo = new JLabel("Codigo: " + atualCod);
		painelCadastro.add(codigo);
		codigo.setBounds(2, 190, 140, 20);
	}

	public void Salvar() {
		progresso.setValue(codCliente + 1);
		boolean laco = true;

		while (laco) {
			if (codCliente >= 100) {
				JOptionPane.showMessageDialog(null, "Limite atingido!");
				laco = false;
			} else {

				clientes[codCliente][0] = nomeEnt.getText();
				clientes[codCliente][1] = cpfEnt.getText();
				clientes[codCliente][2] = cidadeEnt.getText();
				clientes[codCliente][3] = estadoEnt.getText();
				System.out.println("Codigo: " + codCliente + "\nNome " + clientes[codCliente][0] + "\nCpf "
						+ clientes[codCliente][1] + "\nCidade " + clientes[codCliente][2] + "\n Estado: "
						+ clientes[codCliente][3]);
				laco = false;
				JOptionPane.showMessageDialog(button1, "Salvo com sucesso!\nCodigo: " + codCliente);
			}
		}
		nomeEnt.setText(null);
		cpfEnt.setText(null);
		cidadeEnt.setText(null);
		estadoEnt.setText(null);
	}

	public void Atualizar() {

		repaint();
		getContentPane().add(painelAualizar);
		painelAualizar.setBounds(159, 103, 549, 215);
		painelAualizar.setForeground(Color.WHITE);
		painelAualizar.setBackground(cor01);
		
		int codConsulta = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do cliente a ser atualizado."));
		int codCliente = codConsulta;
		painelAualizar.add(nome);
		nome.setBounds(2, 8, 55, 10);
		painelAualizar.add(cpf);
		cpf.setBounds(2, 58, 30, 10);
		painelAualizar.add(cidade);
		cidade.setBounds(2, 108, 60, 10);
		painelAualizar.add(estado);
		estado.setBounds(2, 158, 50, 10);
		// textfields
		painelAualizar.add(nomeEnt);
		nomeEnt.setBounds(48, 5, 400, 20);
		nomeEnt.setText(clientes[codConsulta][0]);
		painelAualizar.add(cpfEnt);
		cpfEnt.setBounds(48, 55, 200, 20);
		cpfEnt.setText(clientes[codConsulta][1]);
		painelAualizar.add(cidadeEnt);
		cidadeEnt.setBounds(48, 105, 250, 20);
		cidadeEnt.setText(clientes[codConsulta][2]);
		painelAualizar.add(estadoEnt);
		estadoEnt.setBounds(48, 155, 60, 20);
		estadoEnt.setText(clientes[codConsulta][3]);

		painelAualizar.add(buttonSalvar);
		buttonSalvar.setBounds(430, 180, 80, 30);
		buttonSalvar.setBackground(corSalvar);
		buttonSalvar.setForeground(Color.white);
		buttonSalvar.addActionListener(this);
		int atualCod = codCliente;
		JLabel codigo = new JLabel("Codigo: " + atualCod);
		painelAualizar.add(codigo);
		codigo.setBounds(2, 190, 140, 20);
	}

	public void atualizaDados(int codigoC){
		clientes[codigoC][0] = nomeEnt.getText();
		clientes[codigoC][1] = cpfEnt.getText();
		clientes[codigoC][2] = cidadeEnt.getText();
		clientes[codigoC][3] = estadoEnt.getText();
	} 
	

	public void Excluir() {
		JOptionPane.showMessageDialog(null, "Voce selecionou o botao para exclusao");
	}

	public void Consultar() {
		/**
		 * Aqui vai ser inserido um joptionPane para solicitar o codigo a
		 * consultar, motrar os dados atraves de JLABEL, remover o
		 * desnecessario.
		 */

		getContentPane().add(painelConsulta);

		painelConsulta.setBounds(159, 103, 549, 215);
		painelConsulta.setForeground(Color.WHITE);
		painelConsulta.setBackground(cor01);
		JOptionPane.showMessageDialog(null, "Painel de Consulta");
//		painelConsulta.add(nome);
//		nome.setBounds(2, 8, 55, 10);
//		painelConsulta.add(cpf);
//		cpf.setBounds(2, 58, 30, 10);
//		painelConsulta.add(cidade);
//		cidade.setBounds(2, 108, 60, 10);
//		painelConsulta.add(estado);
//		estado.setBounds(2, 158, 50, 10);
//		// textfields
//		painelConsulta.add(nomeEnt);
//		nomeEnt.setBounds(48, 5, 400, 20);
//		nomeEnt.setText(null);
//		painelConsulta.add(cpfEnt);
//		cpfEnt.setBounds(48, 55, 200, 20);
//		cpfEnt.setText(null);
//		painelConsulta.add(cidadeEnt);
//		cidadeEnt.setBounds(48, 105, 250, 20);
//		cidadeEnt.setText(null);
//		painelConsulta.add(estadoEnt);
//		estadoEnt.setBounds(48, 155, 60, 20);
//		estadoEnt.setText(null);
//
//		painelConsulta.add(buttonSalvar);
//		buttonSalvar.setBounds(430, 180, 80, 30);
//		buttonSalvar.setBackground(corSalvar);
//		buttonSalvar.setForeground(Color.white);
//		buttonSalvar.addActionListener(this);
//		int atualCod = codCliente;
//		JLabel codigo = new JLabel("Codigo: " + atualCod);
//		painelConsulta.add(codigo);
//		codigo.setBounds(2, 190, 140, 20);
	}

	public void Sair() {
		// JOptionPane.showMessageDialog(null, "Saindo");
		System.exit(0);
	}

}
