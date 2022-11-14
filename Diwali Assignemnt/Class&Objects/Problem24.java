// Java Program to Demonstrate Usage of a Static Variable in the Test Class

class Problem24{
	
	static int count; 
	
	Problem24(){
		count++;
	}
	
	public static void main(String[] args){
		
		new Problem24();
		new Problem24();
		new Problem24();	
		
		System.out.println("Number of objects created is: " + count);
	}
	
}

