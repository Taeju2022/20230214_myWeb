package kh.home.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet({"/", "/main", "/index", "/home"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//2. DB
		
		//dto, dao, service, controller,view
		//paging 처리
		//1. 총 글 개수 DB에서 알아오기
		int cnt = 0; //TODO
		//2. 한 페이지에 나타낼 글 수 정하기
		int pageSize = 3; //보통 10개
		//3. 페이지 수 정하기 이전<< >> 이후
		int pageBlock = 2; // 보통 5개
		//4.현재페이지
		int currentPage = 1;
		
		try {
			currentPage = Integer.parseInt(aaa);
		}
		
		//5.row num 범위 정하기
		int startRnum =0;
		int endRnum = 0;
		startRnum = ((currentPage-1) * pageSize)+1;
		endRnum = (startRnum + pageSize -1 > cnt) ? startRnum+pageSize-1 : cnt;
		
		 // default 1, 페이지 클릭시 변경
		request.setAttribute("boardlist", service.getBoardList(startRnum, endRnum));
		//6.페이지 범위 정하기
		int startPageNum = 0;
		int endPageNum = 0;
		startPageNum = (currentPage % pageBlock == 0)
				? ((currentPage/pageBlock - 1)*pageBlock+1) 
						: ((currentPage/pageBlock)*pageBlock+1);
		int pageCnt = (cnt/pageSize) + (cnt%pageSize == 0?0:1);
		endPageNum = startPageNum + pageBlock -1;
		
		request.setAttribute("startPageNum", startPageNum);
		request.setAttribute("endPageNum", endPageNum);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("pageCnt", pageCnt);
		
		//request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
