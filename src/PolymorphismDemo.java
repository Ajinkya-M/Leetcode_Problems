import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {
	
	private void print() {
		System.out.println("demo");
	}
	
//	public static void main(String[] args) {
//		A a = new B();
//		((B)(a)).print();
//	}

}
class A{
//	private void print() {
//		System.out.println("A");
//	}
}
class B extends A{
	public void print() {
		System.out.println("B");
	}
	
	public void doSomething() {
		System.out.println("doSomething");
	}
	
	public static void main(String[] args) {
		A a = new B();
		((B)(a)).print();
		List<Integer> al = new ArrayList<Integer>();
		al.add(19);
		al.add(20);
		((B)(a)).doSomething();
		
	}
}