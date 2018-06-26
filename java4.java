import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class java4 extends JFrame implements ActionListener {
    private JLabel label;

    public java4(){
	this.setSize(300,200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton b = new JButton("GOOD LUCK!");
	this.add(b,BorderLayout.SOUTH);
	this.add(new JLabel("<html><span style='font-size: 20pt; color: white;"+"background-color:black;'>おみくじ　１回１００円</span></html>",JLabel.CENTER),BorderLayout.NORTH);
	label = new JLabel(" ",JLabel.CENTER);
	this.add(label,BorderLayout.CENTER);
	b.addActionListener(this);
	this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ev) {
	double r = Math.random();
	if(r>0.7)
	    label.setText("good");
	else if(0.2<r && r<=0.7)
	    label.setText("so so");
	else
	    label.setText("bad");
    }
    public static void main(String argv[]) {
	new java4();
    }
}
	