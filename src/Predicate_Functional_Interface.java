//import java.util.ArrayList;

public class Predicate_Functional_Interface {

	/*
	 * interface Cab { public void bookCab(); }
	 * 
	 * class Ola implements Cab {
	 * 
	 * @Override public void bookCab() { // TODO Auto-generated method stub
	 * System.out.println("Cab booked"); }
	 * 
	 * }
	 */

	/*
	 * class Employee { int salary, exp; String name;
	 * 
	 * public Employee(int salary, int exp, String name) { // TODO Auto-generated
	 * constructor stub this.salary = salary; this.exp = exp; this.name = name; } }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		/* System.out.println("Hello"); */

		/*
		 * Cab cab = () -> { System.out.println("Cab booked"); }; cab.bookCab(); Cab ola
		 * = new Predicate().new Ola(); ola.bookCab();
		 */
//		
		/*
		 * java.util.function.Predicate<String> pre = (i) -> { return (i.length() < 4);
		 */
//		};

//		System.out.println(pre.test("JAVA PROGRAMMING"));
		/*
		 * String name[]= {"John","Ram","Scott","Naveen","Raghav","Mukesh"};
		 * 
		 * for(String names:name) { if(pre.test(names)) { System.out.println(names); } }
		 */

		/*
		 * ArrayList<Employee> employee = new ArrayList<Employee>(); employee.add(new
		 * Predicate().new Employee(30000, 3, "Peter")); employee.add(new
		 * Predicate().new Employee(40000, 2, "John")); employee.add(new Predicate().new
		 * Employee(50000, 6, "Scoot")); employee.add(new Predicate().new
		 * Employee(20000, 3, "Sandra")); employee.add(new Predicate().new
		 * Employee(80000, 10, "Rajesh"));
		 * 
		 * java.util.function.Predicate<Employee> emp = (e) -> { if (e.exp > 2 &&
		 * e.salary > 20000) return true; else return false; }; for (Employee e :
		 * employee) { if (emp.test(e)) { System.out.println(e.name); } }
		 */
		/*
		 * int even[] = { 2, 4, 11, 23, 48, 58, 63, 99, 234, 54, 79 }; int
		 * greater_than_50[] = { 1, 3, 50, 64, 4, 11, 23, 48, 58, 63, 99, 234, 54, 79 };
		 * 
		 * java.util.function.Predicate<Integer> even_number = (num) -> (num % 2 == 0);
		 * java.util.function.Predicate<Integer> bigger_than_50 = (num) -> (num > 50);
		 * 
		 * 
		 * for (int num: greater_than_50) { if
		 * (bigger_than_50.and(even_number).test(num)) System.out.println(num);
		 * 
		 * if(bigger_than_50.negate().test(num)) System.out.println(num);
		 * 
		 * }
		 */

	}

}
