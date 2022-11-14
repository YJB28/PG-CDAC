// Java Program to Demonstrate Usage of a Static Variable in the Test Class

class Problem23{
	
	String name;
	int age;
	
	Problem23(){
		name = "";
		age = 0;
	}
	
	Problem23(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void printDetail(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args){
		
		Problem23 obj1 = new Problem23("Timy", 25);
		Problem23 obj2 = new Problem23("Dany", 22);
		Problem23 obj3 = new Problem23("Ayub", 16);	
		
		obj1.printDetail();
		obj2.printDetail();
		obj3.printDetail();
	}
	
}

// each object will have its own instance variables
// can be used to assign unique values to the object
// these data constitute the state of the object