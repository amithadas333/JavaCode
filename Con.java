class Con
{
Con()
{
System.out.println("This is default constructor");
}
public Con(String name)//local
{
System.out.println("My name is: " +name);
}
public static void main(String args[])
{
Con obj=new Con("Amitha");
Con obj1=new Con();

}
}