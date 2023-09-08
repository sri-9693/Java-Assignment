package sri.assignment;

import java.util.ArrayList;

public class Airport 
{
	Address address;
	//int index=0;
	ArrayList<Flight> flights = new ArrayList<>();
	ArrayList<Traveller> travellers = new ArrayList<>();
	public Airport() {}
	public Airport(Address address,ArrayList<Flight>flights,ArrayList<Traveller>travellers)
	{
		super();
		this.address=address;
		this.flights=flights;
		this.travellers=travellers;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public ArrayList<Flight>getFlights()
	{
		return flights;
	}
	public void setFlights(ArrayList<Flight>flights)
	{
		this.flights=flights;
	}
	public ArrayList<Traveller>getTravellers()
	{
		return travellers;
	}
	public void setTravellers(ArrayList<Traveller>travellers)
	{
		this.travellers=travellers;
	}

	public boolean addFlight(Flight flight)
	{
			if(flights==null)
			{
			   flights.add(flight);
			   return true;
			}
			return false;
	}
	public ArrayList<Flight> searchFlight(String source,String destination)
	{
		ArrayList<Flight>abc - new ArrayList<>();
		for(Flight f : flights)
		{
			if(f.getSource()==source && f.getDestination()==destination)
			{
				abc.add(f);
			}
		}
	}
	public void bookTicket(String flightid,Traveller traveller)
	{
		for(Flight f : flights)
		{
			if(f.getId()==flightid && f.getAvailableseats()>0)
			{
				f.setAvailableseats(f.getAvailableseats()-1);
				travellers.add(traveller);
			}
		}
	}
}
