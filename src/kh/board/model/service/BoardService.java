package kh.board.model.service;
import java.sql.Connection;
import java.util.List;

import kh.board.model.dao.BoardDao;
import kh.board.model.vo.BoardVo;
import kh.common.jdbc.JdbcTemplate;

public class BoardService {

	public List<BoardDao> getBoardList(Connection conn){
		List<BoardVo> result = null;
		Connection conn = JdbcTemplate.getConnection();
		String sql = "SELECT BOARD_NUM,BOARD_TITLE, BOARD_WRITER, BOARD_CONTENT "
				+", BOARD_ORIGINAL_FILENAME, BOARD_RENAME_FILENAME";
		result = new BoardDao.
		
		
	}
}
