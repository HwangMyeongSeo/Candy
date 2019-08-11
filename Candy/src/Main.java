import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		int testCaseCnt;
		long k,c,start,end;
		int i;

		 
		testCaseCnt = sc.nextInt();
		start = System.currentTimeMillis();
		for (i = 0; i < testCaseCnt; i++) {
			k =  sc.nextLong();
			c = sc.nextLong();
			
			System.out.println(candyPackCount(k,c));			
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	private static String candyPackCount(long k, long c) {
		
		long candyPackCount = 0;
		long i;

		if(k%c == 0 || c%k == 0)
		{
			return "IMPOSSIBLE";
		}
		
//		for (i = 1;;i++)
//		{
//			candyPackCount = (k*i+1)/c;
//			if(candyPackCount > Math.pow(10,9))
//			{
//				return "IMPOSSIBLE";
//			}
//			
//			if(((k*i+1)%c)==0)
//			{
//				
//				return String.valueOf(candyPackCount);
//			}
//
//		}
		i=1;
		while(true) 
		{
			candyPackCount = (k*i+1)/c;
			if(candyPackCount > Math.pow(10,9))
			{
				return "IMPOSSIBLE";
			}
			
			if(((k*i+1)%c)==0)
			{
				
				return String.valueOf(candyPackCount);
			}
			i++;
		}
		
	}


}
