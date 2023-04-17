package Aula7F;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class ArvoreComponentes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArvoreComponentes frame = new ArvoreComponentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArvoreComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelNome = new JLabel("New label");
		lblNewLabelNome.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabelNome);
		
		JLabel lblNewLabelSenha = new JLabel("New label");
		lblNewLabelSenha.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabelSenha);
		
		textField = new JTextField();
		textField.setBounds(66, 30, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 58, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 100, 414, 150);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(315, 116, 89, 23);
		panel.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 11, 394, 94);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}
}
