class AllDetails
{
static int employeeID=4477,SalaryJan=15000,Bonussalary=2000;
static int total1=SalaryJan+Bonussalary;//static variable
long licencenumber=435464653,maintenancecost=5000;//instance variable
public static void main(String args[])
{
String name="Krishna";//local variable
int mark1=80,mark2=25,total,average;
total=mark1+mark2;
average=mark1+mark2/2;
System.out.println("Student name is: " +name);
System.out.println("maths mark is: " +mark1);
System.out.println("IT mark is: " +mark2);
System.out.println("The total mark is: " +total);
System.out.println("The average mark is: " +average);
System.out.println("The employeeid is: " +employeeID);
System.out.println("Jan salary is: " +SalaryJan);
System.out.println("Bouns salary is: " +Bonussalary);
System.out.println("Total salary is: " +total1);

}
}



