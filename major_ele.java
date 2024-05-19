package project_alpha;
import java.util.*;
public class major_ele {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] cnt=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++)
			b[i]=a[i]; 
		int count=1,k=0,max=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j&&a[i]==b[j])
					count+=1;
			}
			cnt[k]=count;
			k+=1;
			count=1;
		}
		for(int i=0;i<n;i++) {
			if(cnt[i]>max)
				max=cnt[i];
		}
		boolean[] seen = new boolean[n];

		for (int i=0;i<n;i++){
		    if(seen[i])
		    	continue;
		    boolean duplicate=false;
		    for(int j=i+1;j<n;j++)
		        if (a[i]==a[j])
		            duplicate=seen[j]=true;
		    if(cnt[i]==max&&duplicate) 
		        System.out.print(a[i]+"\t");
		    else if(max==1)
		    	System.out.print(a[i]+"\t");
		}
	}
}
