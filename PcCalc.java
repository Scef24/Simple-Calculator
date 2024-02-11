import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PcCalc extends JFrame implements ActionListener {
	private JFrame mainf;
	private JPanel panel;
	private JTextField input;
	private JLabel displayInput1;
	private JLabele displayOps;
	private JLabel displayInput2;
	private JButton operations[] = new JButton[9];
	private JButton memories[] = new JButton[6];
	private JButton numbers[] = new JButton[9];

	public PcCalc() {

	mainf = new JFrame();
	mainf.setSize(300,400);

	panel = new JPanel;
	panel.setLayout(null);

	input = new JTextField();
	input.setBounds();
	displayInput1 = new JLabel();
	displayInput1.setBounds();
	displayInput2 = new JLabel();
	displayInput2.setBounds();

	operations[1] = new JButton["%"];
	operations[2] = new JButton["SQR"];
	operations[3] = new JButon["x2"];
	operations[


}





public static void main(String[] args) {

PcCalc c = new PcCalc();
}

public void actionPerformed(ActionEvent e) {
}
}