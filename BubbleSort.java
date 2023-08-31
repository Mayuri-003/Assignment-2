
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a= {78,90,35,21,43,76,10,20};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
		
		for(int el:a)
		{
			System.out.print(el+" ");
		}
	}
}

