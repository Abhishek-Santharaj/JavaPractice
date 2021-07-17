public class SQLTrainer extends Trainer
{
public static void main(String[] args)
{
	SQLTrainer ram = new SQLTrainer();
	
	
	ram.training();
	
	System.out.println("Dept is " + ram.dept);
	System.out.println("Institute is " + ram.institute);
		
	
	int SqlSalary = ram.getSalary();
	System.out.println("SQL Trainer Salary is " + SqlSalary);
	
}

}