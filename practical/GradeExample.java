import java.util.*;
class GradeExample{
public void show()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Marks:");
int marks=sc.nextInt();
if(marks>=25&&marks<35)
System.out.println("D Grade");
else if(marks>=35&&marks<50)
System.out.println("C Grade");
else if(marks>=50&&marks<70)
System.out.println("B Grade");
else if(marks>=70&&marks<80)
System.out.println("A Grade");
else if(marks>=80&&marks<100)
System.out.println("O Grade");
else
System.out.println("Fail Or Absent");
}
public static void main(String[]args)
{
GradeExample o=new GradeExample();
o.show();
}
}


