class py7{
	public static void main(String args[]){
		
		
		for (int i=9; i>=1; i--)
		{
			for (int j=0; j<=9-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j<=i-1; j++)
			
			{
				System.out.print(i+" ");  
				 
			}                                               
			System.out.println();
			
		}
	}
}