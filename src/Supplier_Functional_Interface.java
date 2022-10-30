import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Functional_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> supply=()->new Date();
		System.out.println(supply.get());
	}

}
