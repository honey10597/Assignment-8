public class reverse_string
{
	public static void main(String x[])
	{
		String s="honey kumar";
    int i=0;
    String rev="";
    for(i=s.length()-1;i>=0;i--)
    {
      rev=rev+s.charAt(i);
    }
    System.out.println(rev);
  }
}