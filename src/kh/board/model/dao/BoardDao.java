package kh.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kh.board.model.vo.BoardVo;
import kh.common.jdbc.JdbcTemplate.*;

public class BoardDao {
	public List<BoardDao> getBoardList(Connection conn){
		List<BoardVo> result = null;
		String sql = "SELECT BOARD_NUM,BOARD_TITLE, BOARD_WRITER, BOARD_CONTENT "
				+", BOARD_ORIGINAL_FILENAME, BOARD_RENAME_FILENAME";
		
		
		//" "안에는 ; 없어야 함. \R\N도 없애기
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//다중행
			result = new ArrayList<BoardVo>();
			while(rs.next()) {
				BoardVo vo = new BoardVo();
				vo.setBoardContent(rs.getString("board_Content"));
				vo.setBoardDate(rs.getString("board_Date"));
				vo.setBoardLevel(rs.getString("board_Level"));
				vo.setBoardNum(rs.getString("board_Num"));
				vo.setBoardOriginalFilename(rs.getString("board_Content"));
				vo.setBoardReadCount(rs.getString("board_Index"));
				vo.setBoardRef(rs.getString("Board_Rename_Filename"));
				vo.setBoardSeq(rs.getString("board_Seq"));
				vo.setBoardTitle(rs.getString("board_Title"));
				vo.setBoardWriter(rs.getString("board_Writer"));
				result.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			cloas(pstmt);
		}
	}
}
