package application;

public class Responsibilities  implements Container{

	String[] responsibilities = {"Finish Object Oriented Development Book", 
			"Participate in Web Workshop meetup","Do assignmnets for OOP class", 
			"Update and modify the project","Start planning birthday party",
			"Look for the Halloween Costume", "Buy tickets to Classic Music Concert"};

	@Override
	public Iterator getIterator() {
		
		return new ResponsibilityIterator();
	}
	
}

