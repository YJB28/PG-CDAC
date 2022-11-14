// Java Program to Create a Method without Parameters and Return Type

class Addition{
	
	int x;
	int y;
	
	Addition(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void printSum(){
		System.out.println("Sum is : " + (x+y));
	}

}
class Problem13{

	public static void main(String[] args){
		
		Addition add = new Addition(5,10);
		add.printSum();

	}
}

