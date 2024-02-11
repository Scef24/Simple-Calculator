import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
	private JFrame mainf;
	private JPanel panel;
	private JLabel inputNum1;
	private JLabel inputNum2;
	private JLabel result;
	private JLabel res;
	private JTextField num1;
	private JTextField num2;
	private JButton[] arrbtn = new JButton[5];

	public Calculator() {
		mainf = new JFrame();
		mainf.setSize(400,400);
		mainf.setTitle("Simple Calculator");

		panel = new JPanel();
		panel.setLayout(null);

		inputNum1 = new JLabel("Input Number: ");
		inputNum1.setBounds(40,10,100,100);
		inputNum2 = new JLabel("Input Number: ");
		inputNum2.setBounds(40,60,100,100);
		result = new JLabel("Result");
		result.setBounds(40,110,100,100);

		num1 = new JTextField(20);
		num1.setBounds(150,45,100,30);
		num2 = new JTextField(20);
		num2.setBounds(150,95,100,30);
		res = new JLabel();
		res.setBounds(150,135,100,30);

		arrbtn[0] = new JButton("Add");
		arrbtn[0].setBounds(40,185,100,30);
		arrbtn[1] = new JButton("Subtract");
		arrbtn[1].setBounds(40,225,100,30);
		arrbtn[2] = new JButton("Multiply");
		arrbtn[2].setBounds(200,185,100,30);
		arrbtn[3] = new JButton("Division");
		arrbtn[3].setBounds(200,225,100,30);
		arrbtn[4] = new JButton ("Modulo");
		arrbtn[4].setBounds(125,270,100,30);

		panel.add(inputNum1);
		panel.add(inputNum2);
		panel.add(result);
		panel.add(num1);
		panel.add(num2);
		panel.add(res);
		panel.add(arrbtn[0]);
		panel.add(arrbtn[1]);
		panel.add(arrbtn[2]);
		panel.add(arrbtn[3]);
		panel.add(arrbtn[4]);
		mainf.add(panel);
		mainf.setVisible(true);
		mainf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		arrbtn[0].addActionListener(this);
		arrbtn[1].addActionListener(this);
		arrbtn[2].addActionListener(this);
		arrbtn[3].addActionListener(this);
		arrbtn[4].addActionListener(this);

	}

public static void main(String[] args) {

	Calculator c = new Calculator();
}

public void actionPerformed(ActionEvent e) {

	Controller c = new Controller();

	Object source  = e.getSource();

	if(source == arrbtn[0]) {

		try {

		int x = c.addition(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
				res.setText("Sum is: " + x);
			//JOptionPane.showMessageDialog(null,"Sum is "+ x);
		}

		catch (Exception ex) {
			JOptionPane.showMessageDialog(null,"Invalid Input");
		}
	}
	else if(source == arrbtn[1]) {

			try {
				int x = c.subtraction(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
				res.setText("Difference is: " + x);
				//JOptionPane.showMessageDialog(null,"Difference is "+ x);
		}
		catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"Invalid Input");
		}
}
else if(source == arrbtn[2]) {

			try {
				int x = c.multiplication(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
				res.setText("Product is: " + x);
				//JOptionPane.showMessageDialog(null,"Product is "+ x);
		}
		catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"Invalid Input");
		}
}
else if(source == arrbtn[3]) {

			try {
				int x = c.division(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
				res.setText("Qoutient is: " + x);
				//JOptionPane.showMessageDialog(null,"Qoutient is "+ x);
		}
		catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"Invalid Input");
		}
}
else if(source == arrbtn[4]) {

			try {
				int x = c.modulo(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
				res.setText("Remainder is: " + x);

				//JOptionPane.showMessageDialog(null,"Remainder is "+ x);
		}
		catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"Invalid Input");
		}
}

}
}
