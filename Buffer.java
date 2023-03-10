class Buffer
{
public static void main(String args[])
{
StringBuffer a=new StringBuffer("Amitha");
a.append("Das");//append
a.insert(1,"ami");//insert
a.delete(2,5);//delete
a.reverse();//reverse
a.replace(1,3,"Java");  
System.out.println(a);
}
}