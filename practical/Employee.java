package Praticals;
public class Employee
{
long employeeId;
String employeeName;
String employeeAddress;
long employeePhone;
double basicSalary;
final double specialAllowance =250.80;
double hra=1000.50;


Employee(long id,String Name, String Address, long Phone,double basicSalary)
{
	this.employeeId=id;
	this.employeeName=Name;
	this.employeeAddress=Address;
	this.employeePhone=Phone;
	this.basicSalary=basicSalary;
}


public void calculateSalary()
{
	double salary;
	salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
	System.out.println("salary:"+salary);
}
}