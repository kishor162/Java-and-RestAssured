package Practice;

public class BubbleshotofDecimalNumber {
	public static void main(String[] args) {
		
	
	
	double d[]= {22.5,5,13.65,13.6,56,78,3};
	
	for(int i=0;i<d.length;i++)
	{
		for(int j=i+1;j<d.length;j++)
		{
			if(d[i]>d[j])
			{
				
				double temp= d[i];
				d[i]=d[j];
				d[j]=temp;
			}
		}
	}
	
	for(double dd:d)
	{
		System.out.print(dd+",");
		
	}
	}
}
