package Practical;
public class InheritanceActivity{
public static void main(String[]args)
{
Manager m=new Manager(1243,"peter","Chennai","india",14345,65000);
m.CalculateSalary();
Trainee t=new Trainee(29846,"Jack","Mumbai Inida",442085,45000);
t.CalculateSalary();
}
}
