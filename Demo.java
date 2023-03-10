class Demo
{
int rollno=3;
public void add(int a,int b)
{
System.out.println("addition of two numbers is: " +(a+b));
}
public void number(int a)
{
System.out.println("roll number is: " +a);

}
public static void main(String args[])
{
Demo obj=new Demo();
obj.add(10,20);
obj.number(12345);
System.out.println("my roll number is: " +obj.rollno);
}
}