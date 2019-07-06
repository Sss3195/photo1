package cn.edu.imnu.text;
import java.awt.Graphics;

import javax.swing.JFrame;

import cn.edu.imnu.www.readServlet;
public class Mypaint extends JFrame {
	    public static int x1,y1;
	    public static int x2,y2;
	    public static int x3,y3;
	    public static int x4,y4;
	    public static int x5,y5;
	private Graphics g;
	public void paint(Graphics g) {
//		g.drawLine(100, 100, 300, 300);
		g.drawLine(x1,y1, x2,y2);
		g.drawLine(x2,y2, x3,y3);
		g.drawLine(x3,y3, x4,y4);
		
		
		
	}

	private readServlet readServlet() {
		// TODO Auto-generated method stub
		return null;
	}
	public void initUI(int a1,int b1,int a2,int b2,int a3,int b3,int a4,int b4){
		
		this.setTitle("轨迹图");
		this.setSize(800,600);
//		this.setDefaultCloseOperation(3);
		this.setLocation(300,300);
		this.setVisible(true);
		x1=a1;
		y1=b1;
		x2=a2;
		y2=b2;
		x3=a3;
		y3=b3;
		x4=a4;
		y4=b4;
//		MyListener ml = new MyListener();
//		Graphics g = this.getGraphics();
//		ml.setG(g);
//		this.addMouseListener(ml);
	}
}