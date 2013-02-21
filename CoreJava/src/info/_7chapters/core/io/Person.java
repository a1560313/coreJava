package info._7chapters.core.io;

import java.io.Serializable;

class Person implements Serializable {
	private String name;
	private String place;
	private String profession;
	
	private transient String one;
	private transient String two;
	
	Person(String n, String p, String pr) {
		name = n; place = p; profession = pr;
	}
	public String toString() {
		return name + " " + place + " " + profession + "\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
}