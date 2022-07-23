abstract class MyDemo{
	public void display1() {
		System.out.println("non-abst meth");
	}
	abstract public void display2();{
		
	}
}
public class Demo extends MyDemo {
	public void display2() {
		System.out.println("abst meth");
	}
	public static void main(String []args) {
		Demo d = new Demo();
		d.display1();
		d.display2();
	}
}
