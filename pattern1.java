class pattern1
{
	public static void main(String []args)
	{
	int i;
	int j;
	int n=5;
	int count=1;

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(count <10)
				{
				System.out.print("0"  +  count + " ");
				}
				else
				{
					System.out.print(count + " ");
				}
				count++;
			}
			System.out.println();
				
		}	
	}
}