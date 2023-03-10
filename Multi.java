class Multi
{
public static void main(String args[])
{
int arr[][]={{1,4,5},{2,3,6},{8,9,3}};//multi-dimensional
{
for(int i=0;i<arr.length;i++)//row
{
for(int j=0;j<arr.length;j++)//column
{
System.out.print(" ");//for spacing

System.out.print(arr[i][j]);
}

System.out.print("\n");//next  line
}
}
}
}