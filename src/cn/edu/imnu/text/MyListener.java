package cn.edu.imnu.text;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MyListener extends MouseAdapter {
    number nu=new number();
	private int x1, y1, x2, y2,x3,y3;// 定义四个属性，用来存储按下和释放的坐标值
	private Graphics g;// 声明画笔对象属性
	
        // 构造方法，将画笔传给窗体，在窗体中得到才可以画图
	public void setG(Graphics gr) {
		g = gr;
	}
	
	/**
	 * 当你在事件源对象上发生鼠标按下动作时执行的方法。
	 */
	public void mousePressed(MouseEvent e) {
//		x1 = e.getX();
//		y1 = e.getY();
//	}
//	
//	/**
//	 * 当你在事件源对象上发生鼠标释放动作时执行的方法。
//	 */
//	public void mouseReleased(MouseEvent e) {
//		x2 = e.getX();
//		y2 = e.getY();
	x1=100;
	y1=100;
	x2=200;
	y2=200;
	x3=200;
	y3=200;
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
	}
	
	/**
	 * 当你在事件源对象上发生鼠标点击(按下和释放必须在同一个位置上)动作时执行的方法。
	 */
	public void mouseClicked(MouseEvent e) {
		
	}

}