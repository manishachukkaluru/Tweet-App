package demo3day3;
 class Worker{
	
	float   salary=80000;
	public void sal() {
		
		System.out.println("My sal is");
		
	}
	
}






public class Employee  extends Worker{

	public static void main(String[] args) {
		Employee e=new Employee();
		e.sal();
		System.out.println(e.salary);
	}
	

}
