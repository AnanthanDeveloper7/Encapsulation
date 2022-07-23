class Addition{
	int add(int x,int y) {
		return x+y;
	}
	int add(int x, int y, int z) {
		return x+y+z;
	}
}
public class TestAddition {
	public static void main() {
		Addition A = new Addition();
		System.out.println(A.add(10,20,30));
		System.out.println(A.add(10,20));
	}

}
