//import java.util.ArrayList;
//import java.util.function.Function;
//import java.util.function.Predicate;


/*class Employee
{
	int salary;
	int id;
	String name;
	public Employee(int salary,String name) {
		// TODO Auto-generated constructor stub
		this.salary=salary;
		this.name=name;
	}
}*/
public class Functions_Functional_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Function<Integer, Integer> cube=(Integer num)->{return num*num*num;};
		 * System.out.println(cube.apply(10));
		 */
		
		/*
		 * Function<Employee, Integer> emp=(e)->{ if(e.salary<10000) return
		 * e.salary*10/100; else if(e.salary>10000 && e.salary<=40000) return
		 * e.salary*20/100; else return (e.salary)*50/100; };
		 * 
		 * Predicate<Integer> pre=(bonus)->(bonus>10000);
		 * 
		 * ArrayList<Employee> employee_list=new ArrayList<Employee>();
		 * employee_list.add(new Employee(20000,"John"));
		 * employee_list.add(new * Employee(50000, "Ajay")); employee_list.add(new Employee(40000, "Peter"));
		 * employee_list.add(new Employee(10000, "Scoot")); employee_list.add(new
		 * Employee(70000, "Pragya"));
		 * 
		 * for(Employee e: employee_list) { if(pre.test(emp.apply(e))) {
		 * System.out.println(e.name+"  "+e.salary+"  expected bonus: "+emp.apply(e)); }
		 * }
		 */
		/*
		 * Function<Integer, Integer> p1=(num)->{return (num*2);}; Function<Integer,
		 * Integer> p2=(num)->{return (num*num);};
		 * 
		 * System.out.println(p1.compose(p2).apply(10));
		 */
		
}

}
