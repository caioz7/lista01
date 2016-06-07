/**
 * Codigo referente ao Exerc�cio 51 da lista de exercicios(os outros est�o apenas no OneDrive).
 * @author Caio Cesar D.
 * - C.R.U.D
 * C - Create
 * R - Read
 * U - Update
 * D - Delete
 */
package pacoteEx51;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Exercicio51 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	int codCliente = 0;
	int codConsulta = codCliente;
	JFrame janela = new JFrame();
	Color cor01 = new Color(200, 200, 200);
	Color corSalvar = new Color(34, 1, 34);
	JButton button1 = new JButton("Cadastrar");
	JButton button2 = new JButton("Atualizar");
	JButton button3 = new JButton("Excluir");
	JButton button4 = new JButton("Consultar");
	JButton button5 = new JButton("Sair");
	JButton button6 = new JButton("Atualizar");

	JButton buttonSalvar = new JButton("Salvar");
	JProgressBar progresso = new JProgressBar();
	Font fonteLabel = new Font("Serif", Font.BOLD, 20);
	JPanel painelCadastro = new JPanel();
	JPanel painelAtualizar = new JPanel();
	JPanel painelConsulta = new JPanel();
	JLabel nome = new JLabel("Nome: ");
	JLabel cpf = new JLabel("CPF: ");
	JLabel cidade = new JLabel("Cidade: ");
	JLabel estado = new JLabel("Estado: ");
	JTextField nomeEnt = new JTextField(30);
	JTextField cpfEnt = new JTextField(11);
	JTextField cidadeEnt = new JTextField(30);
	JTextField estadoEnt = new JTextField(2);
	String[][] Clientes = new String[100][4];
	String[][] ClientesReserva = new String[100][4];
	ImageIcon imgDeFundo = new ImageIcon(getClass().getResource("background.jpg"));
	JLabel Background = new JLabel(imgDeFundo);
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
		}
		if(e.getSource() == button6){
			atualizaDados(codConsulta);
		}
	}

	public Exercicio51() { // CLASSE CONSTRUTOR
		setUndecorated(true);
		Background.setBounds(0, 0, 900, 420);
		setResizable(false);
		getContentPane().setLayout(null);

		// Botoes
		getContentPane().add(button1);
		button1.setToolTipText("Cadastrar um novo cliente");

		getContentPane().add(button2);
		button2.setToolTipText("Atualizar ou editar os dados de um cliente");

		getContentPane().add(button3);

		button3.setToolTipText("Excluir cadastros");
		getContentPane().add(button4);

		button4.setToolTipText("Consultar cadastros");
		getContentPane().add(button5);

		button5.setToolTipText("Encerrar aplicativo");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

		button1.setBounds(150, 66, 100, 30);
		button2.setBounds(310, 66, 100, 30);
		button3.setBounds(470, 66, 100, 30);
		button4.setBounds(630, 66, 100, 30);
		button5.setBounds(760, 322, 100, 35);

		button1.setToolTipText("Opcao de cadastro.");
		// Dados da Janela
		JLabel lblSccSistema = new JLabel("SCC - Sistema de Cadastro De Clientes");
		lblSccSistema.setBounds(260, 12, 500, 24);

		getContentPane().add(lblSccSistema);
		lblSccSistema.setFont(fonteLabel);
		lblSccSistema.setForeground(Color.white);

		progresso.setToolTipText("Cadastros ja utilizados");
		progresso.setStringPainted(true);
		progresso.setBounds(220, 337, 382, 19);
		getContentPane().add(progresso);

		setTitle("Cadastro de Clientes");
		setVisible(true);
		setSize(900, 420);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(Background);
	}

	public static void main(String[] args) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		new Exercicio51();

	}

	// Funcoes
	public void Cadastrar() {
		
		painelAtualizar.repaint();
		getContentPane().add(painelCadastro);
		painelCadastro.setBounds(159, 103, 549, 215);
		painelCadastro.add(nome);
		nome.setBounds(2, 13, 55, 10);
		painelCadastro.add(cpf);
		cpf.setBounds(2, 63, 30, 10);
		painelCadastro.add(cidade);
		cidade.setBounds(2, 113, 60, 10);
		painelCadastro.add(estado);
		estado.setBounds(2, 163, 50, 10);
		// textfields
		painelCadastro.add(nomeEnt);
		nomeEnt.setBounds(48, 5, 400, 28);
		nomeEnt.setText(null);
		painelCadastro.add(cpfEnt);
		cpfEnt.setBounds(48, 55, 200, 28);
		cpfEnt.setText(null);
		painelCadastro.add(cidadeEnt);
		cidadeEnt.setBounds(48, 105, 250, 28);
		cidadeEnt.setText(null);
		painelCadastro.add(estadoEnt);
		estadoEnt.setBounds(48, 155, 60, 28);
		estadoEnt.setText(null);
		painelCadastro.add(buttonSalvar);
		buttonSalvar.setBounds(430, 180, 80, 30);
		buttonSalvar.addActionListener(this);
		//int atualCod = codCliente;
		JLabel codigo = new JLabel("Codigo: " + codCliente);
		painelCadastro.add(codigo);
		codigo.setBounds(2, 190, 140, 20);
		codigo.repaint();
	}

	public void Salvar() {
	
		progresso.setValue(codCliente + 1);
		
			if (codCliente >= 100) {
				JOptionPane.showMessageDialog(null, "Limite atingido!");
			} else {

				Clientes[codCliente][0] = nomeEnt.getText();
				Clientes[codCliente][1] = cpfEnt.getText();
				Clientes[codCliente][2] = cidadeEnt.getText();
				Clientes[codCliente][3] = estadoEnt.getText();
				System.out.println("Codigo: " + codCliente + "\nNome " + Clientes[codCliente][0] + "\nCpf "
						+ Clientes[codCliente][1] + "\nCidade " + Clientes[codCliente][2] + "\n Estado: "
						+ Clientes[codCliente][3]);
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!\nCodigo: " + codCliente);
				codCliente++;
			}		
		nomeEnt.setText(null);
		cpfEnt.setText(null);
		cidadeEnt.setText(null);
		estadoEnt.setText(null);
		painelAtualizar.repaint();
	}

	public void Atualizar() {

		painelAtualizar.repaint();
		getContentPane().add(painelAtualizar);
		painelAtualizar.setBounds(159, 103, 549, 215);
		
		codConsulta = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do cliente a ser atualizado."));
		painelAtualizar.add(nome);
		nome.setBounds(2, 8, 55, 10);
		painelAtualizar.add(cpf);
		cpf.setBounds(2, 58, 30, 10);
		painelAtualizar.add(cidade);
		cidade.setBounds(2, 108, 60, 10);
		painelAtualizar.add(estado);
		estado.setBounds(2, 158, 50, 10);
		// textfields
		painelAtualizar.add(nomeEnt);
		nomeEnt.setBounds(48, 5, 400, 28);
		nomeEnt.setText(Clientes[codConsulta][0]);
		painelAtualizar.add(cpfEnt);
		cpfEnt.setBounds(48, 55, 200, 28);
		cpfEnt.setText(Clientes[codConsulta][1]);
		painelAtualizar.add(cidadeEnt);
		cidadeEnt.setBounds(48, 105, 250, 28);
		cidadeEnt.setText(Clientes[codConsulta][2]);
		painelAtualizar.add(estadoEnt);
		estadoEnt.setBounds(48, 155, 60, 28);
		estadoEnt.setText(Clientes[codConsulta][3]);

		painelAtualizar.add(button6);
		button6.setBounds(430, 180, 80, 30);
		button6.addActionListener(this);
		JLabel codigo = new JLabel("Codigo: " + codConsulta);
		painelAtualizar.add(codigo);
		codigo.setBounds(2, 190, 140, 20);
	}

	public void atualizaDados(int codigoC){
		
		ClientesReserva[codigoC][0] = nomeEnt.getText();
		ClientesReserva[codigoC][1] = cpfEnt.getText();
		ClientesReserva[codigoC][2] = cidadeEnt.getText();
		ClientesReserva[codigoC][3] = estadoEnt.getText();
		String.format(ClientesReserva[codigoC][0],Clientes[codigoC][0]);
		String.format(ClientesReserva[codigoC][0],Clientes[codigoC][1]);
		String.format(ClientesReserva[codigoC][0],Clientes[codigoC][2]);
		String.format(ClientesReserva[codigoC][0],Clientes[codigoC][3]);
		
		JOptionPane.showMessageDialog(null, "Atualizado com sucesso!\nCodigo: " + codigoC);
		System.out.println("Codigo: " + codCliente + "\nNome " + Clientes[codCliente][0] + "\nCpf "
				+ Clientes[codCliente][1] + "\nCidade " + Clientes[codCliente][2] + "\n Estado: "
				+ Clientes[codCliente][3]);
	} 
	

	public void Excluir() {
		JOptionPane.showMessageDialog(null, "Voce selecionou o botao para exclusao");
	}

	public void Consultar() {

		getContentPane().add(painelConsulta);

		painelConsulta.setBounds(159, 103, 549, 215);
		JOptionPane.showMessageDialog(null, "Painel de Consulta");

	}

	public void Sair() {
		//JOptionPane.showMessageDialog(null, "Saindo");
		System.exit(0);
	}
	

}
