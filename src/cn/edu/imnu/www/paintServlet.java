package cn.edu.imnu.www;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.imnu.text.Mypaint;

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
		Mypaint mp = new Mypaint();
		mp.initUI(readServlet.x1,readServlet.y1,
				readServlet.x2,readServlet.y2,
				readServlet.x3,readServlet.y3,
				readServlet.x4,readServlet.y4);
//        System.out.println(readServlet.x1);
//        System.out.println(readServlet.y1);
		  response.sendRedirect("message.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
