package demo3day3;


abstract class Bike{
	
	abstract void run();
	
}


class Honda extends Bike{
	
	@Override
	void run() {
		System.out.println("My bike is fine");
		
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Bike b=new Honda();
		b.run();
	}

}

