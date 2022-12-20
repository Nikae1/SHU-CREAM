package Bean;

import java.util.ArrayList;

public class NoteBean {
	
	
	private String goodsCode;
	private String goodsName;
	private String goodsQuantity;
	private int goodsPrice;
	private String Conntents;
	private String noteDate;
	private String tranPlace;
	private String tranMethod;
	private String noteState;
	private String noteIng;
	private ArrayList<JJimBean> jjim;
	
	
	public ArrayList<JJimBean> getJjim() {
		return jjim;
	}
	public void setJjim(ArrayList<JJimBean> jjim) {
		this.jjim = jjim;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(String goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getConntents() {
		return Conntents;
	}
	public void setConntents(String conntents) {
		Conntents = conntents;
	}
	public String getNoteDate() {
		return noteDate;
	}
	public void setNoteDate(String noteDate) {
		this.noteDate = noteDate;
	}
	public String getTranPlace() {
		return tranPlace;
	}
	public void setTranPlace(String tranPlace) {
		this.tranPlace = tranPlace;
	}
	public String getTranMethod() {
		return tranMethod;
	}
	public void setTranMethod(String tranMethod) {
		this.tranMethod = tranMethod;
	}
	public String getNoteState() {
		return noteState;
	}
	public void setNoteState(String noteState) {
		this.noteState = noteState;
	}
	public String getNoteIng() {
		return noteIng;
	}
	public void setNoteIng(String noteIng) {
		this.noteIng = noteIng;
	}
	public String getGoodsState() {
		return goodsState;
	}
	public void setGoodsState(String goodsState) {
		this.goodsState = goodsState;
	}
	public String getNoteImage() {
		return noteImage;
	}
	public void setNoteImage(String noteImage) {
		this.noteImage = noteImage;
	}
	private String goodsState;
	private String noteImage;
	

}
