package in.co.capgemini;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Parked_CarOwnerList {
	Set<Parked_CarOwner_Details> car = new TreeSet<>();
	
	
	public void add(Parked_CarOwner_Details owner) {
		car.add(owner);
	}
	
	public int add_new_car(Parked_CarOwner_Details phno) {
		car.add(phno);
		return phno.getOwnerMobileNo();
	}
	
	public void remove_car(String owner) {
		Predicate<Parked_CarOwner_Details> rmcar = Parked_CarOwner_Details -> Parked_CarOwner_Details.getOwnerName().equals(owner);
		car.removeIf(rmcar);
	}
	
	public void get_parked_car_location(int token) {
		
		
	}
}
