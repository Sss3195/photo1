package cn.edu.imnu.text;
import java.awt.Graphics;

import javax.swing.JFrame;

import cn.edu.imnu.www.readServlet;

public class MyPaint extends JFrame {
	private Graphics g;
	public void paint(Graphics g) {
		readServlet point=readServlet();
		g.drawLine(100, 100, 200, 200);
//		g.drawLine( point.x1, point.y1,point.x2,point.y2);
//		g.drawLine( point.x2, point.y1,point.x2,point.y2);
		
		
	}

	private readServlet readServlet() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		MyPaint mp = new MyPaint();
		mp.initUI();

	}

	public void initUI(){
		this.setTitle("轨迹图");
		this.setSize(800,600);
//		this.setDefaultCloseOperation(3);
		this.setLocation(300,300);
		this.setVisible(true);
//		MyListener ml = new MyListener();
//		Graphics g = this.getGraphics();
//		ml.setG(g);
//		this.addMouseListener(ml);
	}
}