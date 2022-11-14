// Java Program to Check Whether Which One is Executed First, Static Block or the Static Method

class Problem25{
	
	static {
		System.out.println("Static Block");
		// myFun(); //Allowed
	}
	
	static void myFun(){
		System.out.println("static myFun method");
	}
	
	public static void main(String[] args){
		
		// myFun();
	}
	
}
