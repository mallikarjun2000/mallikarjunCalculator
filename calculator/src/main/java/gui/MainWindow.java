package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import backend.Addition;
import backend.Calculator;
import backend.Division;
import backend.Multiplication;
import backend.Subtraction;

public class MainWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainWindow()
	{
		this.setBounds(0, 0, 300, 1000);
		final CustomTextFeild cf1=new CustomTextFeild(10,20,200,60,"12");
		final CustomTextFeild cf2=new CustomTextFeild(10,80,200,60,"2");
		final CustomTextFeild cf3=new CustomTextFeild(10,140,200,60,"");
		this.add(cf1);
		this.add(cf2);
		this.add(cf3);
		int n=4;
		CustomButton[] b = new CustomButton[n+1];
		for(int i=0;i<=n;i++)
		{
			b[i]=new CustomButton();
			this.add(b[i]);
			b[i].setVisible(true);
		}
		b[0].setLabel("ADD");
		b[0].setBounds(10, 210, 40, 30);
		b[1].setLabel("SUB");
		b[1].setBounds(100,210, 40, 30);
		b[2].setLabel("DIV");
		b[2].setBounds(10,280,40,30);
		b[3].setLabel("MUL");
		b[3].setBounds(100,280,40,30);
		b[4].setLabel("Clear");
		b[4].setBounds(50,350,40,30);
		
		
		b[0].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = 0,b = 0;
				try {
				 a = Integer.parseInt(cf1.getText());
				b = Integer.parseInt(cf2.getText());
				}
				catch(NumberFormatException e1)
				{
					cf3.setText("Enter NUmbers");
				}
				Calculator c = new Addition();
				c.getNumbers(a, b);
				cf3.setText(String.valueOf(c.operation()));
			}
		});
		
		b[1].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = 0,b = 0;
				try {
				 a = Integer.parseInt(cf1.getText());
				b = Integer.parseInt(cf2.getText());
				}
				catch(NumberFormatException e1)
				{
					cf3.setText("Enter NUmbers");
				}
				Calculator c = new Subtraction();
				c.getNumbers(a, b);
				cf3.setText(String.valueOf(c.operation()));
			}
		});
		b[2].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = 0,b = 0;
				try {
				 a = Integer.parseInt(cf1.getText());
				b = Integer.parseInt(cf2.getText());
				}
				catch(NumberFormatException e1)
				{
					cf3.setText("Enter NUmbers");
				}
				catch(ArithmeticException e1)
				{
					cf3.setText("Number Format Exception");
				}
				
				Calculator c = new Division();
				c.getNumbers(a, b);
				cf3.setText(String.valueOf(c.operation()));
			}
		});
		b[3].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = 0,b = 0;
				try {
				 a = Integer.parseInt(cf1.getText());
				b = Integer.parseInt(cf2.getText());
				}
				catch(NumberFormatException e1)
				{
					cf3.setText("Enter NUmbers");
				}
				Calculator c = new Multiplication();
				c.getNumbers(a, b);
				cf3.setText(String.valueOf(c.operation()));
			}
		});
		b[4].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = 0,b = 0;
				try {
					cf1.setText("");
					cf2.setText("");
					cf3.setText("");
				}
				catch(NumberFormatException e1)
				{
					cf3.setText("Enter NUmbers");
				}
			}
		});
	}
}
