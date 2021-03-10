package schoolmanagementsystem;

public class Teacher {
	
	private int id;
	private int salary;
	private String name;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.salaryEarned = 0;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "Name of the Teacher: " + name + " Total salary earned: $"  + salaryEarned; 
	}
	
}
