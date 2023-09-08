package sri.assignment;

public class Address 
{
	String Area;
	String city;
	String state;
	public Address() {}
	public Address(String area, String city, String state) 
	{
		super();
		Area = area;
		this.city = city;
		this.state = state;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
