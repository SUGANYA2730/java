package threadss;
public class SyncExample{
public static void main(String[] args){
Sample s= new Sample();
Thread t= new Thread1(s);
Thread t1= new Thread2(s);
t.start();
t1.start();
}
}
