package Note;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import Bean.UserBean;

public class NoteDataAccessObject extends services.DataAccessObject {

	public NoteDataAccessObject() {}
	
	
	
	
	
	
	
	/* Note에 입력된 정보를 가지고오기 위한 메소드 */
	public ArrayList<UserBean> selNote(Connection connection, UserBean user){
		ArrayList<UserBean> userList = null;
		UserBean us = null;
		
		String query = "";
		
		try {
			this.ps = connection.prepareStatement(query);
			
			
			
			
			
			this.rs = this.ps.executeQuery();
			userList = new ArrayList<UserBean>();
			
			if(this.rs.isBeforeFirst()) {
				
			  while(this.rs.next()) {
				us = new UserBean();
				
				us.setUserId(this.rs.getNString("userId"));
				us.getNoteBean().get(0).setGoodsCode(this.rs.getNString("GoodsCode"));
				us.getNoteBean().get(0).setGoodsName(this.rs.getNString("GoodsName"));
				us.getNoteBean().get(0).setGoodsPrice(this.rs.getInt("GoodsPrice"));
				us.getNoteBean().get(0).setGoodsQuantity(this.rs.getNString("GoodsQuantity"));
				us.getNoteBean().get(0).setGoodsState(this.rs.getNString("GoodsState"));
				
				us.getNoteBean().get(0).setConntents(this.rs.getNString("Conntents"));
				us.getNoteBean().get(0).setNoteDate(this.rs.getNString("NoteDate"));
				us.getNoteBean().get(0).setNoteIng(this.rs.getNString("NoteIng"));
				us.getNoteBean().get(0).setNoteState(this.rs.getNString("NoteState"));
				us.getNoteBean().get(0).setNoteImage(this.rs.getNString("NoteImage"));
				
				us.getNoteBean().get(0).setTranMethod(this.rs.getNString("TranMethod"));
				us.getNoteBean().get(0).setTranPlace(this.rs.getNString("TranPlace"));
				
				userList.add(user);
			   }
			}
		} catch (SQLException e) {e.printStackTrace();}
		
		return userList;
	}
	
	/* Note에 입력을 하고 난 후 사용자의 선택에 의해
	 * JJim_Table에 Insert하기 위한 메소드 */
	public int jjIns(Connection connection, UserBean user) {
		int result = 0;
		String ins = "";
		
		
		try {
			this.ps = connection.prepareStatement(ins);
			
			
			
			
			
			result = this.ps.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();}
		
		
		
		return result;
	}
	
	
	
	
	/* Note_Table에 정보를 입력하기위한 메소드 */
	public int insNote(Connection connection, UserBean user) {
		int result = 0;
		String ins = "";
		
		try {
			this.ps = connection.prepareStatement(ins);
			
			
			
			result = this.ps.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();}
		
		return result;
	}
	
	
}
