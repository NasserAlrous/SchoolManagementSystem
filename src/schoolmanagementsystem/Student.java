package schoolmanagementsystem;

public class Student {
	
	private int id;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	private String name;
	
	public Student(int id, String name, int grade) {
		feesPaid = 0;
		feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getFeesPaid() {
		return feesPaid;
	}


	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}


	public int getFeesTotal() {
		return feesTotal;
	}


	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name: " + name + " Total fees paid $" + feesPaid;
	}
}
