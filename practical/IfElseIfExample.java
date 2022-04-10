import java.util.Scanner;
class IfElseIfExample
{
public void show()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter time");
int time=s.nextInt();

if(time<12){
System.out.println("Hii......Good Morning To All");
}
else if (time<17){
System.out.println("Hii.....Good Afternoon To All");
}
else if (time<21){
System.out.println("Hii.....Good Evening To All");
}
else{
System.out.println("Bye....Good Night To All");
}
}
public static void main(String args[]){;
IfElseIfExample e=new IfElseIfExample();
e.show();
}
}
