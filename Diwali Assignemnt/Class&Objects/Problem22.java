// Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

class Problem22{
	
	double balance;
	int AccNo;
	static double roi;
	
	Problem22(){
		balance = 0.0;
		AccNo = 0;
		roi = 2.5;
	}
	
	Problem22(double balance, int AccNo){
		this();
		this.balance = balance;
		this.AccNo = AccNo;
	}
	
	static void roiDetails(){
		System.out.println("Rate of Interest : " + roi + "%");
		
	}
	
	void printDetail(){
		System.out.println("Account Number: " + AccNo);
		System.out.println("Balance: " + balance);
		roiDetails(); 
	}
	
	public static void main(String[] args){
		
		Problem22 obj1 = new Problem22(15000.56, 1);
		Problem22 obj2 = new Problem22(42050.468, 2);
		Problem22 obj3 = new Problem22(35120.058, 3);	
		
		obj1.printDetail();
		obj2.printDetail();
		obj3.printDetail();
	}
	
}

// each object will have its own instance variables
// can be used to assign unique values to the object
// these data constitute the state of the object