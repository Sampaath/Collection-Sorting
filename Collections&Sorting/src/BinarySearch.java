import java.util.Scanner;
// testing changes
// 01/05/2018, 11.39 am
public class BinarySearch {

	 int[] a= {1,3,5,6,8,9,10,12};
	 static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) 
	{
		 System.out.println(" enter the number you want check ");
		 
		 BinarySearch b = new BinarySearch();	 
		 b.show();
		

	}
	
	int l = 0, k = a.length;
	
	// int[] a= {1,3,5,6,8,9,10,12};
	
	int x = 12;
	
 public String show() 
 	{
	 System.out.println(a.length);
	while(l<=k)
		{
		 int m = (k+l)/2;
		 
		 	if(x==a[m])
		 	{
		 		System.out.println("  true");
		 		return "true";
		 	}
		 
			else
			{
			if(x>a[m])
			{
			l= m+1;
			/*System.out.println("  1");*/
			}
			if(x<a[m])
			 {
				k= m-1;
//				System.out.println("  2");
			 }
			
		}
			 
		}
		
			return "Sampath";


}
}

