import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Color;

public class MathFrame {

	private JFrame frame;
	JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathFrame window = new MathFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MathFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 739);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 lblNewLabel = new JLabel("Enter two numbers!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(286, 10, 140, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADD");
	
		btnNewButton.setBounds(21, 32, 125, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEdit = new JButton("Subtract");
		btnEdit.setBounds(21, 83, 125, 21);
		frame.getContentPane().add(btnEdit);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.setBounds(156, 32, 125, 21);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.setBounds(166, 83, 125, 21);
		frame.getContentPane().add(btnDivide);
		
		textField = new JTextField();
		textField.setBounds(314, 44, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 84, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Answer:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(40, 130, 54, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("answer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(122, 137, 159, 13);
		frame.getContentPane().add(lblNewLabel_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double a,b,ans;
					a= Double.parseDouble(textField.getText());
					b= Double.parseDouble(textField_1.getText());
					ans=a+b;
					lblNewLabel_2.setText(Double.toString(ans));
					
				}
				catch(Exception e){
					
				}
			}
		});
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double a,b,ans;
					a= Double.parseDouble(textField.getText());
					b= Double.parseDouble(textField_1.getText());
					ans=a-b;
					lblNewLabel_2.setText(Double.toString(ans));
					
				}
				catch(Exception e){
					
				}
			}
		});
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double a,b,ans;
					a= Double.parseDouble(textField.getText());
					System.out.println(a);
					b= Double.parseDouble(textField_1.getText());
					ans=a*b;
					System.out.println(ans);
					System.out.println(b);
					lblNewLabel_2.setText(Double.toString(ans));
					
				}
				catch(Exception e){
					
				}
			}
		});
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double a,b,ans;
					a= Double.parseDouble(textField.getText());
					b= Double.parseDouble(textField_1.getText());
					ans=a/b;
					lblNewLabel_2.setText(Double.toString(ans));
					
				}
				catch(Exception e){
					
					
				}
			}
		});
	}
}

