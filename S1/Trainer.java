public class Trainer
{
String dept="Java",institute = "Payilagam";
private int salary = 10000;

public void training()
{
System.out.println("I am training");
}

public void test()
{
Trainer trainerKumar = new Trainer("CSE","payilagam");
}
	
public Trainer(String dept, String institute)
{
	
}
public Trainer()
{

}
public int getSalary()
{
return salary;
}

}