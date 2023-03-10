class staticPara
{
public static void add(float a,float b)//local
{
System.out.println("The addition of two numbers is: " +(a+b));
}
public static String name(String a,char b)
{
System.out.println(b);
return a;

}
public static void main(String args[])
{

staticPara.add(10.5f,15.2f);

String n=staticPara.name("amitha",'A');
System.out.println(n);

}
}