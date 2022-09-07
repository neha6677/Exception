package com.studentresult;

public class StudentResult {
	
	int eng_marks=89;
	int hin_marks=44;
	int math_marks=67;
	
	
	public int getEng_marks() {
		return eng_marks;
	}
	public void setEng_marks(int eng_marks) {
		this.eng_marks = eng_marks;
	}
	public int getHin_marks() {
		return hin_marks;
	}
	public void setHin_marks(int hin_marks) {
		this.hin_marks = hin_marks;
	}
	public int getMath_marks() {
		return math_marks;
	}
	public void setMath_marks(int math_marks) {
		this.math_marks = math_marks;
	}
	public StudentResult(int eng_marks, int hin_marks, int math_marks) {
		super();
		this.eng_marks = eng_marks;
		this.hin_marks = hin_marks;
		this.math_marks = math_marks;
	}
	public StudentResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentResult [eng_marks=" + eng_marks + ", hin_marks=" + hin_marks + ", math_marks=" + math_marks
				+ "]";
	}
	
	
	public double displayResult() { 
		int eng=getEng_marks();
		int hin=getHin_marks();
		int math=getMath_marks();
		int total;
		double percent;
		total=eng+hin+math;
		percent=total/3;
		return percent;
	}
	
	
	

}
