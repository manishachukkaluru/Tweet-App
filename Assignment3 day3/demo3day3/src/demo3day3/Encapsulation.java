package demo3day3;

public class Encapsulation {
	
	private Long id;
	private  String Fname;
	private String Lname;
	private String city;
	public Long getId() {
		return id;
	}
	public void setId(long i) {
		this.id = i;
	}
	public Encapsulation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Encapsulation(Long id, String fname, String lname, String city) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.city = city;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
