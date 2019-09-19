package application;

public class ResponsibilityIterator extends Responsibilities implements Iterator {

	int index = 0;
	public boolean hasNext() {
		if(index<responsibilities.length) {
			return true;}
		else return false;
	}

	
	public Object next() {
		return responsibilities[index++];
	}
	
}
