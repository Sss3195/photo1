package cn.edu.imnu.www;

import java.awt.Graphics;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;

import cn.edu.imnu.text.MyPaint;

/**
 * Servlet implementation class paintServlet
 */
@WebServlet("/paintServlet")
public class paintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public paintServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyPaint mp = new MyPaint();
		mp.initUI();
		int a=readServlet.x1;
		System.out.println(a);
		class MyPaint extends JFrame {
			private Graphics g;
			public void paint(Graphics g) {
				
				g.drawLine(88, 55, 50, 58);
				g.drawLine(readServlet.x1, readServlet.y1,readServlet.x2,readServlet.y2);
				g.drawLine( readServlet.x2, readServlet.y2,readServlet.x3,readServlet.y3);
				
				
			}

			private readServlet readServlet() {
				// TODO Auto-generated method stub
				return null;
			}


			public void initUI(){
				this.setTitle("轨迹图");
				this.setSize(800,800);
//				this.setDefaultCloseOperation(3);
				this.setLocation(300,300);
				this.setVisible(true);
//				MyListener ml = new MyListener();
//				Graphics g = this.getGraphics();
//				ml.setG(g);
//				this.addMouseListener(ml);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
