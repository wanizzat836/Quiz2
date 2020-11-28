package quizz2;

public class quizz2 {

	public static void main(String[] args) {
		
		//1
		System.out.println("1.");
		int max = 5;
		for(int n = 1; n<=max; n++) {
			System.out.println(n);
		}
		System.out.println();
		
		//while
		int maxi=5;
		int m=1;
		while(m<=maxi) {
			System.out.println(m);
			m++;
		}
		System.out.println();
		
		//2
		System.out.println("2.");
		int total = 25;
		for (int number = 1; number <=(total / 2 ); number++) {
			total = total - number;
			System.out.println(total + " " + number);
		}
		System.out.println();
		
		//while
		int sum=25;
		int num=1;
		while(num<=(total/2)) {
			sum=sum-sum;
			System.out.println(sum + " " + num);
			num=num+1;
		}
		System.out.println();
		
		//3
		System.out.println("3.");
		for(int i =1; i <=2; i++) {
			for(int j=1; j<=4; j++) {
				for(int k=1; k<=4; k++) {
				System.out.print("*");
			}
			System.out.print("!");
		}
		System.out.println();
	}
	System.out.println();
		
		//while
	    int a=1;
	    while(a<=2) {
	    	int b=1;
	    	while(b<=3) {
	    		int c=1;
	    		while(c<=4) {
	    			System.out.print("*");
	    			c++;
	    		}
	    		System.out.print("!");
	    		b++;
	    	}
	    	System.out.println();
	    	a++;
	    }
	    System.out.println();
	    
	    //4
	    System.out.println("4.");
	    int number = 4;
	    for(int count=1; count<=number; count++) {
	    	System.out.println(number);
	    	number=number / 2;
	    	
	    	//while
	    	int num2=4;
	    	int bil=1;
	    	while(bil<=num2) {
	    		System.out.println(num2);
	    		num2=num2 / 2;
	    		bil=bil+1;
	    	}
	    }
	}
		
	}



