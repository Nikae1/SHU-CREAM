package Note;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import Bean.ActionBean;
import Bean.NoteBean;
import Bean.UserBean;

public class Note {
	private HttpServletRequest request;
	
	
	public Note(){}
	
	
	public ActionBean backcontroller(int serviceCode) {
		ActionBean action = null;
		
		if(serviceCode == 21) {
			action = this.NoteRegCtl();
		}else if(serviceCode == 22) {
			action = this.NoteSelCtl();   
		}
		
		
		
		return action;
	}
	
	/* 게시물을 검색하여 가지고 오기위한 Ctl */
	private ActionBean NoteSelCtl() {
		ActionBean action = new ActionBean();
		UserBean user = null;
		
		
		
		
		
		return action;
	}
	
	
	
	
	
	private ActionBean NoteRegCtl() {
		ActionBean action = new ActionBean();
		UserBean user = new UserBean();
		NoteBean note = new NoteBean();
		ArrayList<UserBean> userbean = null; 
		String page, message = null;
		boolean tran = false, access = true;
		
		note.setConntents(this.request.getParameter("Conntents"));
		note.setGoodsCode(this.request.getParameter("GoodsCode"));
		note.setGoodsName(this.request.getParameter("GoodsName"));
		note.setGoodsPrice(Integer.parseInt(this.request.getParameter("GoodsPrice")));
		note.setGoodsQuantity(this.request.getParameter("GoodsQuantity"));
		note.setGoodsState(this.request.getParameter("GoodsState")); // 상품상태
		note.setNoteDate(this.request.getParameter("NoteDate"));
		note.setNoteIng(this.request.getParameter("NoteIng")); // 거래 중 , 거래 완료 등
		note.setNoteState(this.request.getParameter("NoteState")); // 삽니다, 팝니다
		note.setTranMethod(this.request.getParameter("TranMethod")); // 직거래, 택배거래
		note.setTranPlace(this.request.getParameter("TranPlace"));
		note.setNoteImage(this.request.getParameter("NoteImage"));
		
		ArrayList<NoteBean> noteList = new ArrayList<NoteBean>();
		noteList.add(note);
		user.setNoteBean(noteList);
		user.setUserId(this.request.getParameter("userId"));
		
		NoteDataAccessObject dao = new NoteDataAccessObject();
		Connection connection = dao.openConnection();
		dao.modifyTranStatus(connection, tran);
		
		
		if(this.convertToBoolean(dao.insNote(connection, user))) {
			userbean = new ArrayList<UserBean>();
			userbean = dao.selNote(connection, user);
			tran = true;
			access = false;
			page = "";
			
			request.setAttribute("NoteList", userbean);
			
			
		}else {
			page = "";
			message = "";
		}
		
		dao.setTransaction(tran, connection);
		dao.modifyTranStatus(connection, tran);
		dao.closeConnection(connection);
		
		
		action.setPage(page);
		action.setRedirect(access);
		
		return action;
	}
	
	
	private boolean convertToBoolean(int value) {
		return value>0? true:false;
	}
	
}
