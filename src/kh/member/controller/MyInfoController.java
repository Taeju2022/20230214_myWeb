package kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.member.model.service.MemberService;
import kh.member.model.vo.MemberVo;

/**
 * Servlet implementation class MyInfoController
 */
@WebServlet("/myinfo")
public class MyInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyInfoController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1

		String id = null;
		if(request.getSession().getAttribute("lgnss") != null) {
			id = ((MemberVo)(request.getSession().getAttribute("lgnss"))).getId();
		}
		if(id != null) {
			request.setAttribute("myinfo", new MemberService().myInfo(id));
		} else {
		//방법 1 : 로그인 정보가 없을 때, 많은 jsp페이지에서 같은 코드를 작성해야 하는 불편함이 있	
		//request.getDispatcher("/WEB-INF/view/member/myinfo.jsp").forward(request, response);
			
			//방법 2 : 로그인 정보가 없을 때, 하나의 error page를 만들어줌
			request.setAttribute("errorMsg", "로그인되지 않아 내 정보를 확인 할 수 없습니다.");
			request.getRequestDispatcher("/WEB-INF/view/member/myinfo.jsp").forward(request, response);
		}
		
		
		//2 나의 id에 해당하는 정보를 db에서 읽어오기
		request.getRequestDispatcher("/WEB-INF/view/member/myinfo.jsp").forward(request, response);
		
	
	}



}
