import java.util.*;
class Kadens {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();                               /*Input the size of array*/
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){                              /*Input elements of array*/
	            a[i]=sc.nextInt();
	        }
	    int max = Integer.MIN_VALUE;
	    int sum=0;
	    for(int i=0;i<n;i++){
	        sum+=a[i];                                        /*Finding sum upto particular index*/
	        if(sum>max)
	         max=sum;
	        if(sum<0)                                         /*Making sum 0 when it becomes negative*/                        
	         sum=0;
	    }
	    System.out.println(max);
	}
}
