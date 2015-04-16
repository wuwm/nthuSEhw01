


public class Grades implements Comparable<Grades>{
	private String ID;
	private String Name;
	private int lab1;
	private int lab2;
	private int lab3;
	private int midTerm;
	private int finalExam;
	private int totalGrade;
	Grades(String ID,String Name,int lab1,int lab2,int lab3,int midTerm,int finalExam)
	{
		this.ID=ID;
		this.Name=Name;
		this.lab1=lab1;
		this.lab2=lab2;
		this.lab3=lab3;
		this.midTerm=midTerm;
		this.finalExam=finalExam;
		  
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLab1() {
		return lab1;
	}
	public void setLab1(int lab1) {
		this.lab1 = lab1;
	}
	public int getLab2() {
		return lab2;
	}
	public void setLab2(int lab2) {
		this.lab2 = lab2;
	}
	public int getLab3() {
		return lab3;
	}
	public void setLab3(int lab3) {
		this.lab3 = lab3;
	}
	public int getMidTerm() {
		return midTerm;
	}
	public void setMidTerm(int midTerm) {
		this.midTerm = midTerm;
	}
	public int getFinalExam() {
		return finalExam;
	}
	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}
	public int getTotalGrade() {
		return totalGrade;
	}
	public void setTotalGrade(int totalGrade) {
		this.totalGrade = totalGrade;
	}
	public void calculateTotalGrade(float weight[])
	{
		totalGrade=(int) (lab1*weight[0]+lab2*weight[1]+lab3*weight[2]+midTerm*weight[3]+finalExam*weight[4]);
		
	}
	@Override
	public int compareTo(Grades arg0) {
		if(this.finalExam>arg0.finalExam){
			return 1;
		}else{
			return 0;
		}
	}
}
