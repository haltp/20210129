package co.micol.board.vo;

import java.sql.Date;

public class ReplyVo {
	private int bId;
	private int rNum;
	private String subJect;
	private Date rDate;
	
	
	public int getbId() {
		return bId;
	}
	
	public void setbId(int bId) {
		this.bId = bId;
	}
	
	public int getrNum() {
		return rNum;
	}
	
	public void setrNum(int rNum) {
		this.rNum = rNum;
	}
	
	public String getSubJect() {
		return subJect;
	}
	
	public void setSubJect(String subJect) {
		this.subJect = subJect;
	}
	
	public Date getrDate() {
		return rDate;
	}
	
	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}
	
	
}
