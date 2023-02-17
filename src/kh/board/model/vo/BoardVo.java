package kh.board.model.vo;

public class BoardVo {
	
	private int boardNum;
	private String boardTitle;
	private String boardWriter;
	private String boardContent;
	private String boardOriginalFilename;
	public void setBoardNum(String boardNum) {
		this.boardNum = boardNum;
	}
	private String boardRenameFinename;
	private String boardDate;
	private String boardLevel;
	private String boardRef;
	private String boardReplySeq;
	private String boardReadCount;
	@Override
	public String toString() {
		return "BoardVo [boardNum=" + boardNum + ", boardTitle=" + boardTitle + ", boardWriter=" + boardWriter
				+ ", boardContent=" + boardContent + ", boardOriginalFilename=" + boardOriginalFilename
				+ ", boardRenameFinename=" + boardRenameFinename + ", boardDate=" + boardDate + ", boardLevel="
				+ boardLevel + ", boardRef=" + boardRef + ", boardReplySeq=" + boardReplySeq + ", boardReadCount="
				+ boardReadCount + "]";
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardOriginalFilename() {
		return boardOriginalFilename;
	}
	public void setBoardOriginalFilename(String boardOriginalFilename) {
		this.boardOriginalFilename = boardOriginalFilename;
	}
	public String getBoardRenameFinename() {
		return boardRenameFinename;
	}
	public void setBoardRenameFinename(String boardRenameFinename) {
		this.boardRenameFinename = boardRenameFinename;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardLevel() {
		return boardLevel;
	}
	public void setBoardLevel(String boardLevel) {
		this.boardLevel = boardLevel;
	}
	public String getBoardRef() {
		return boardRef;
	}
	public void setBoardRef(String boardRef) {
		this.boardRef = boardRef;
	}
	public String getBoardReplySeq() {
		return boardReplySeq;
	}
	public void setBoardReplySeq(String boardReplySeq) {
		this.boardReplySeq = boardReplySeq;
	}
	public String getBoardReadCount() {
		return boardReadCount;
	}
	public void setBoardReadCount(String boardReadCount) {
		this.boardReadCount = boardReadCount;
	}
	
	
}
