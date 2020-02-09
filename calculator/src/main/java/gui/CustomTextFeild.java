package gui;

import java.awt.TextField;

public class CustomTextFeild extends TextField {
	public CustomTextFeild(int x,int y,int w,int h,String t) {
		this.setBounds(x, y, w, h);
		this.setText(t);
		this.setVisible(true);
	}
}
