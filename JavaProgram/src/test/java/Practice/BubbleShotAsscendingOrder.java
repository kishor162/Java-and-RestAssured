package Practice;

public class BubbleShotAsscendingOrder {
	
	public static void main(String[] args) {
		
		int a[]= {5,7,2,9,4};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
			{
				int tem=a[i];
				
				a[i]=a[j];
				a[j] = tem;
			}
					
			}
		}
		for(int aa :a)
		{
			System.out.print(aa+",");
		}
	}

}
