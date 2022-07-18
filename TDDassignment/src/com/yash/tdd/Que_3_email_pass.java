package com.yash.tdd;

import java.util.ArrayList;
import java.util.List;

class user{
    String email;
    String password;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public user() {
        super();
        // TODO Auto-generated constructor stub
    }
    public user(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
public class Que_3_email_pass {
	static List<user> a=new ArrayList<>();
    public static void main(String[] args) {
    	System.out.println();
    }
	 public static boolean checkEmailandPassword(String email,String password) {

	        a.add(new user("neha@gmail.com","neha123"));
	        a.add(new user("mansi@gmail.com","mansi123"));
	        a.add(new user("renuka@gmail.com","renuka123"));


	        for(int i=0;i<=a.size()-1;i++) {
	            if(a.get(i).email.contains(email)&&a.get(i).password.contains(password)) {
	                return true;
	            }break;
	        }
	        return false;
	}
  }
