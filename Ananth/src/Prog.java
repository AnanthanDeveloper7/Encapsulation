class Emp{
	float salary = 40000f;
}
public class Prog extends Emp {
	float bonus = 4000f;
	public static void main(String[] args) {
		Prog p = new Prog();
		System.out.println("salary = " + p.salary);
		System.out.println("salary = " + p.bonus);
	}

}
