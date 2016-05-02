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

public class Exercicio51_2 extends JFrame implements ActionListener {

	JFrame janela = new JFrame();
	JButton button1 = new JButton("Cadastrar");
	JButton button2 = new JButton("Atualizar");
	JButton button3 = new JButton("Excluir");
	JButton button4 = new JButton("Consultar");
	JButton button5 = new JButton("Sair");
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button1){
			Cadastrar();
		}
		if(e.getSource()==button2){
			Atualizar();
			}
		if(e.getSource()==button3){
			Excluir();
			}
		if(e.getSource()==button4){
			Consultar();
			}
		if(e.getSource()==button5){
			Sair();
			}
	}
	//CLASSE CONSTRUTOR
	public Exercicio51_2(){ 
		setLayout(null);
		
		//Botoes
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		
		button1.setBounds(0,0,100,35);
		button1.setToolTipText("Opcao de cadastro.");
		button2.setBounds(0,80, 100, 35);
		button3.setBounds(0,160,100,35);
		button4.setBounds(0,240,100,35);
		getBackground();
		button5.setBackground(Color.GRAY);
		getForeground();
		button5.setForeground(Color.WHITE);
		button5.setBounds(0,320,100,35);
		
		//Dados da Janela
		
		setTitle("Cadastro de clientes");
		setVisible(true);
		setResizable(false);
		setSize(900,420);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
	
		new Exercicio51();

	}
	//Funcoes
	public void Cadastrar(){
		JOptionPane.showInputDialog("Informe o nome a ser Cadastrado");
	}
	public void Atualizar(){
		JOptionPane.showMessageDialog(null, "Voce selecionou o botao para atualizacao");
	}
	public void Excluir(){
		JOptionPane.showMessageDialog(null, "Voce selecionou o botao para exclusao");
	}
	public void Consultar(){
		JOptionPane.showInputDialog("Informe o nome a ser consultado");
		
	}
	public void Sair(){
		JOptionPane.showMessageDialog(null, "Saindo");
		System.exit(0);
	}

}

