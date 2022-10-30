import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumer_Functional_Interface {
	
	class Employee
	{
		int salary, experience;
		String name;
		public Employee(int salary, int experience,String name) {
			// TODO Auto-generated constructor stub
			this.salary=salary;
			this.experience=experience;
			this.name=name;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Employee> consume=(Employee emp_detail)->{
			System.out.println(emp_detail.name+" "
					+ "working with salary "+emp_detail.salary+
					" having "+emp_detail.experience+
					" years of experience");};
//		consume.accept("Welcome");
					
		Predicate<Integer> bonus=(Integer i)->(i>=4000);
		Function<Employee, Integer> calc_bonus=(Employee emp)->{
			return (emp.salary)*10/100;
		};
	
		
		ArrayList<Employee> Employee_list=new ArrayList<Employee>();
		Employee_list.add(new Consumer_Functional_Interface().new Employee(30000, 6, "MohanRaj"));
		Employee_list.add(new Consumer_Functional_Interface().new Employee(40000, 4, "Ajay"));
		Employee_list.add(new Consumer_Functional_Interface().new Employee(50000, 1, "Subha"));
		Employee_list.add(new Consumer_Functional_Interface().new Employee(10000, 10, "Satish"));
		Employee_list.add(new Consumer_Functional_Interface().new Employee(80000, 14, "Manirul"));

		
		for(Employee e:Employee_list)
		{
			if(bonus.test(calc_bonus.apply(e)))
			{
				consume.accept(e);
				System.out.println();
			}
			
		}
	}

}
