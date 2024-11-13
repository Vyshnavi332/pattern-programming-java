class pattern9
{
	public static void main(String []args)
	{
	int i;
	int j;
	int n=5;

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				for(k=1;k<=(n-i);k++)
				{
					System.out.print("*");
			}
			System.out.println();
				
		}	
	}
}