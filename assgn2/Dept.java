

public class Dept {
	private String name, hod;

	public Dept(String name, String hod) {
		this.name = name;
		this.hod = hod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}
	
	public String toString() {
		return name + " | " + hod;
	}

}
