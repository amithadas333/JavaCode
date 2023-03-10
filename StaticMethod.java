class StaticMethod
{
static int Carnumber=234;
public static void add()//static method
{
int a=5,b=2;
System.out.print("addition of two numbers is: ");

System.out.println(a+b);
}

public static void details()//static method
{
String name="Ami";
int rollno=3;
System.out.println("student name is: " +name);
System.out.println("student roll is: " +rollno);
}
public static void main(String args[])//main method
{
StaticMethod.add();
StaticMethod.details();
System.out.print("My car number is : "+StaticMethod.Carnumber);

}
}




