package kh.board.model.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import kh.board.model.dao.BoardDao;
import kh.board.model.vo.BoardVo;
import kh.common.jdbc.JdbcTemplate;

public class BoardService {

	public int getCountBoard(Connection conn) {
		int result = 0;
		

		return result;
	}
	
	public List<BoardDao> getBoardList(Connection conn){
		List<BoardVo> result = null;
		Connection conn = JdbcTemplate.getConnection();
		String sql = "SELECT BOARD_NUM,BOARD_TITLE, BOARD_WRITER, BOARD_CONTENT "
				+", BOARD_ORIGINAL_FILENAME, BOARD_RENAME_FILENAME";
		result = new BoardDao.
		
		
	}
	
	//오버로딩
	public List<BoardDao> getBoardList(int srnum, int ernum){
		List<BoardVo> result = null;
		Connection conn = JdbcTemplate.getConnection();
		String sql = "SELECT BOARD_NUM,BOARD_TITLE, BOARD_WRITER, BOARD_CONTENT "
				+", BOARD_ORIGINAL_FILENAME, BOARD_RENAME_FILENAME";
		result = new BoardDao.
		
		
	}
}
