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
		
		public int getCountBoard(Connection conn) {
			int result = 0;
			String sql = "select count(*) cnt from board";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					result = rs.get
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				close(rs);
				close(pstmt);
			}
			
			return result;
		}
		
		public List<BoardDao> getBoardList(Connection conn, int srnum, int ernum){
		
			List<BoardVo> result = null;
			String sql = "SELECT BOARD_NUM,BOARD_TITLE, BOARD_WRITER, BOARD_CONTENT "
				+", BOARD_ORIGINAL_FILENAME, BOARD_RENAME_FILENAME, BOARD_DATE"
				+ ", BOARD_LEVEL, BOARD_REF, BOARD_REPLY_SEQ, BOARD_READCOUNT"
				+ "FROM BOARD"
				+ "ORDER BY BOARD_REF DESC, BOARD_REPLY_SEQ ASC) tbl_1"
				+ ") tbl_2"
				+ "WHERE RN BETWEEN 3 AND 7";
		
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
			close(pstmt);
		}
	}
}
