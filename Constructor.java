class Constructor
 {
String name;//instance variable
int mark;//instance variable
Constructor()//default Constructor
{
System.out.println("My Qualification is: BCA");
}
public Constructor(String name,int mark)//non-static variable name cannot be referenced from a static context
 {
this.name=name;
this.mark=mark;
 }
public void displaydetails()
 {
System.out.println("Student name is: " +name);
System.out.println("Student first sem english mark is: " +mark);
 }
public static void main(String args[])
  {
Constructor obj1=new Constructor();//default constructor
Constructor obj=new Constructor("Amitha",89);
obj.displaydetails();
  }
 }



