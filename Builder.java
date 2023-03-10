class Builder
{
public static void main(String args[])
{
StringBuilder srm=new StringBuilder("Amitha");
srm.append("Das");//append
System.out.println(srm);

srm.insert(1,"ami");//insert
System.out.println(srm);

srm.delete(2,5);//delete
System.out.println(srm);

srm.reverse();//reverse
System.out.println(srm);

srm.replace(1,3,"Java");  
System.out.println(srm);
}
} 
