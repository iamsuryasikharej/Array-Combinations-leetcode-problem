
public class Combination {
	public void find(int a[],int position,String ans,String toAdd)
	{
		ans=ans+String.valueOf(toAdd);
		
		if(position==a.length-1)
		{
			System.out.println(ans);
			return;
		}
		find(a,position+1,ans,String.valueOf(a[position+1]));
		find(a,position+1,ans," ");
		
	}
}
