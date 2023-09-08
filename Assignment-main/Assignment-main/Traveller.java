package sri.assignment;

import java.time.LocalDate;

public class Traveller 
{
	String name;
	long mobileno;
	String email;
	String flightid;
	LocalDate date;
	public Traveller() {}
	public Traveller(String name, long mobileno, String email, String flightid, LocalDate date) 
	{
		this.name = name;
		this.mobileno = mobileno;
		this.email = email;
		this.flightid = flightid;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

}
