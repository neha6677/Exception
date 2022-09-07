package com.studentresult;

public class StudentResult_exp {
	
	 int rollno;
	 String sname;
	String saddress;
	StudentResult srobj;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentResult getSrobj() {
		return srobj;
	}
	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}
	public StudentResult_exp(int rollno, String sname, String saddress, StudentResult srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj = srobj;
	}
	public StudentResult_exp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentResult_exp [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj="
				+ srobj + "]";
	}
	
	public static void main(String[] args) {
		
		StudentResult sr = new StudentResult(-33,29,30);
		double per=sr.displayResult();
		try {
			
			if(per>40) {
				System.out.println("You have pass");
			}
			else {
				throw new ResultException("failed");
			}
			
		} catch (Exception e) {
			System.out.println("You have not pass");
		}
		
		//StudentResult sr1 = new StudentResult(30,31,22);
		try {
			if(sr.getEng_marks()<0) {
				throw new ResultException("input error");
			}
			
			
		} catch (Exception e) {
			System.out.println("you have input negative marks");
		}
		
		
	}
	

}
