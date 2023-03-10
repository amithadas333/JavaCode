class StaticDetails
{
public static int sub(int a,int b)
 {
   return a-b;
 }
public static int carRegisteration(int carnumber,String carname)
 {
   System.out.println("My carname is: " +carname);
   return carnumber;
 }
public static int salary(int jan,int feb)
 {
  return jan+feb;
 }
public static void main(String args[])
  {
   System.out.println("Subtraction of this given two numbers is: " +StaticDetails.sub(10,5));
   System.out.println("My car number is: " +StaticDetails.carRegisteration(23456,"Benz"));
   System.out.println("My total salary is: " +StaticDetails.salary(10000,2000));
  }
}

