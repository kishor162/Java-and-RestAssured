package Practice;

public class BubbleShotDescendingOrder {
	
	public static void main(String[] args) {
		
		int a[] = {2,8,4,9,3};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int data:a)
		{
			System.out.print(data+",");
		}
		
	}

}
