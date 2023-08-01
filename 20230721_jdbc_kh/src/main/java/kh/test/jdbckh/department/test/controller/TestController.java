package kh.test.jdbckh.department.test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.jdbckh.department.test.service.TestService;
import kh.test.jdbckh.department.test.vo.TestVo;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/test/get")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String departmentNo = request.getParameter("departmentNo");
		TestService service = new TestService();
		TestVo vo = service.selectOne(departmentNo);
		if(vo==null) {
			request.getRequestDispatcher("/WEB-INF/view/test/get.jsp").forward(request, response);
		}
		else {
			request.setAttribute("dvo", vo);
			request.getRequestDispatcher("/WEB-INF/view/test/get.jsp").forward(request, response);
		}
		
		
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
