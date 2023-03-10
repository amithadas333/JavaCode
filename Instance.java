class Instance
{
String color="Red";//instance variable
static char det='a';//static variable
public void division(int a,int b)
{
System.out.println("Divison of two numbers is: " +a/b);
System.out.println(a);//static method
}
public String bookdetails(String book,int cost)
{
System.out.println("my book cost is: " +cost);
return book;
}
public static void details()//static method calling
{
System.out.println("my name is amitha");
}
public static void main(String args[])
{
Instance obj=new Instance();
obj.division(15,4);

System.out.println("my dress color: " +obj.color);
System.out.println("my book name is: " +obj.bookdetails("java",200));
System.out.println(Instance.det;
Instance.details();//static method

}
}