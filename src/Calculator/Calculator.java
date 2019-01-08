package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 253, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 217, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Row2
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn7.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 132, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn8.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(66, 132, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn9.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(122, 132, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn4.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 188, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn5.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(66, 188, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn6.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(122, 188, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn1.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 244, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn2.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(66, 244, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn3.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(122, 244, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText()+btn0.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 300, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnp = new JButton(".");
		btnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btnp.getText());
		          }
			}
		});
		btnp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnp.setBounds(66, 300, 50, 50);
		frame.getContentPane().add(btnp);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnB.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		btnB.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnB.setBounds(10, 76, 50, 50);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null); 
				
			}
		});
		btnC.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(66, 76, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "%";
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnM.setBounds(122, 76, 50, 50);
		frame.getContentPane().add(btnM);
		
		JButton btna = new JButton("+");
		btna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "+";
			}
		});
		btna.setFont(new Font("Tahoma", Font.BOLD, 18));
		btna.setBounds(178, 76, 50, 50);
		frame.getContentPane().add(btna);
		
		JButton btns = new JButton("-");
		btns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "-";
			}
		});
		btns.setFont(new Font("Tahoma", Font.BOLD, 18));
		btns.setBounds(178, 132, 50, 50);
		frame.getContentPane().add(btns);
		
		JButton btnm = new JButton("*");
		btnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "*";
			}
		});
		btnm.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnm.setBounds(178, 188, 50, 50);
		frame.getContentPane().add(btnm);
		
		JButton btnd = new JButton("/");
		btnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations= "/";
			}
		});
		btnd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnd.setBounds(178, 244, 50, 50);
		frame.getContentPane().add(btnd);
		
		JButton btnn = new JButton("\u00AC");
		btnn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops= Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnn.setBounds(122, 300, 50, 50);
		frame.getContentPane().add(btnn);
		
		JLabel lblBackspace = new JLabel("   BKS");
		lblBackspace.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBackspace.setBounds(14, 62, 46, 14);
		frame.getContentPane().add(lblBackspace);
		
		JLabel label = new JLabel("        %");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(122, 62, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btne = new JButton("=");
		btne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations == "+") {
					result =firstnum + secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "-") {
					result =firstnum - secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "*") {
					result =firstnum * secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result =firstnum / secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "%") {
					result =firstnum % secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btne.setFont(new Font("Tahoma", Font.BOLD, 18));
		btne.setBounds(178, 300, 50, 50);
		frame.getContentPane().add(btne);
	}
}
