package application;

public class IteratorAppTest {

	public static void main(String[] args) {
		
		 int counter = 1;
		 
		 Responsibilities todo = new Responsibilities(); 
		 Iterator iterator = todo.getIterator();
		 
		  while (iterator.hasNext()) {
			  
			  System.out.println(counter + " " + (String)iterator.next());
			  counter++;
		  }
	}

}
