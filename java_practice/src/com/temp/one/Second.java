package com.temp.one;

public class Second {
	
	
	public static void main(String args[]){
		
		First.i = 10;
		
		System.out.println("**1** : "+First.i);
		First f= new First();
		f.i = 20;
		
		System.out.println("**2** : "+First.i);
		System.out.println("**3** : "+f.i);

		
		
		First f1 = new First();
		f1.i = 30;
		System.out.println("**4** : "+First.i);
		System.out.println("**5** : "+f.i);
		System.out.println("**6** : "+f1.i);
		
		

		
	}

}
