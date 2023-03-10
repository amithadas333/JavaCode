class EmployeeDetails
{
static String name="Amitha";//static variable
int phone=987;//instance variable
public void details(String address,int id,String companyname)//instance method
{
System.out.println("Employee address is: " +address);
System.out.println("Employee id is: " +id);
System.out.println("Employee companyname is: " +companyname);
System.out.println(phone);//static variable

}
public String personaldetails(char a,String qualification)//parameterized instance method
{
 System.out.println("Employee blood group is: " +a);

 return qualification;
}
public static void secondnum(int num)//static method
{
System.out.println("Employees second contact number is: " +num);
}
public static void main(String args[])
{
EmployeeDetails obj=new EmployeeDetails();
obj.details("Happy home",3345,"ABC company");//instance method
System.out.println("Employee qualification is: " +obj.personaldetails('B',"BCA"));//instance method parameterized
EmployeeDetails.secondnum(45454);//static method calling
/instance variable
System.out.println(EmployeeDetails.name);//static variable
}
}



