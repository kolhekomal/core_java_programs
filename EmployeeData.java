class EmployeeData
{
    int id;
	String name;
	String c_name;
	static String Employee_name;
	
}
 
 class UsesEmployeeData 
 {
	 static public void main(String[] args)
	 {
		 EmployeeData d=new EmployeeData();
		 int a;
		 a=10;
		 System.out.println(a);
		 System.out.println(d.id);
		 System.out.println(d.name);
		 System.out.println(d);
		 System.out.println(d.c_name);
	 }
 }