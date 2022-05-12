package CollectionEg;
public class ArrayListusingUserdefineCl{
public static void main(String[]args){
//auto-generated method stub
//creating user define class object
Bank b= new Bank(12345,"sugar",5000.87,20);
Bank b1= new Bank(12342,"nithi",6000.87,90);
Bank b2= new Bank(12342,"viks",8000.87,60);
Bank b3= new Bank(12348,"manda",9000.87,10);
Bank b4= new Bank(12395,"shalu",4000.87,70);
Bank b5= new Bank(12545,"shwe",3000.87,30);

//creating array list
ArrayList<Bank> al = new ArrayList<>();
al.add(b);
al.add(b2);
al.add(b4);
al.add(b1);
al.add(b5);
al.add(b3);

Iterator itr=al.iterator();
while(itr.hasNext()){
Bank obj=(Bank)itr.next();
System.out.println(obj.accountNo + " " +obj.customerName+ " " +obj.balance+ " " +obj.custormerAge);
     }
   }
}