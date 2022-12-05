package demo3day3;


interface car{
	void add();
	
	static void run() {
		System.out.println("hi");
	}
}





public class Func {

	public static void main(String[] args) {
		car c=()-> {System.out.println("hey i am lambda expression");};
c.add();
car.run();
	}

}
