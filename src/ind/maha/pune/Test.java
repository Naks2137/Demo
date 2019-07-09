package ind.maha.pune;
import ind.maha.satara.Test1;
import ind.maha.solapur.Employee;

import ind.maha.solapur.Employee;

public class Test 
{
public static void main(String args[])
{
Test1 t=new Test1();
Employee e=new Employee();

e.setId(Integer.parseInt(args[0]));
e.setName(args[1]);
e.setMobileno(Long.parseLong(args[2]));
e.setSalary(Float.parseFloat(args[3]));
t.display(e);

System.out.println("CJC");
System.out.println("gt hub changes");

}
}
