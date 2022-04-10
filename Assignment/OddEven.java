class OddEven
{
public static void main(String[]args)
{
int Arr[]={1,3,5,7,11,2,4};
for(int i=0; i<Arr.length; i++)
{
if(Arr[i]%2==0)
System.out.println("Even:"+Arr[i]);
else
System.out.println("Odd:"+Arr[i]);
}
}
}