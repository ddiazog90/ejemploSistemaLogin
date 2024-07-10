package model;

import libreriaVersion3.generic;

public class user {

	private generic<String,Integer> dt_u;
	public user() {
		super();
		dt_u=new generic<>();
	}
	public user(int id,String email, String psw, int roll) {
		dt_u=new generic<>(email,psw,roll,id);
	}
	public String getEmail() {
		return dt_u.getAttribute1();
	}
	public String getPSW() {
		return dt_u.getAttribute2();
	}
	public int getRoll() {
		return dt_u.getAttribute3();
	}
	public int getId() {
		return dt_u.getAttribute4();
	}
	public void setEmail(String email_) {
		dt_u.setAttribute1(email_);
	}
	public void setPSW(String psw_) {
		dt_u.setAttribute2(psw_);
	}
	public void setRoll(int roll_) {
		dt_u.setAttribute3(roll_);
	}
	public void setId(int id_) {
		dt_u.setAttribute4(id_);
	}

}
