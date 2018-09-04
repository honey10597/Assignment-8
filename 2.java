
public class substr
{
	public static void main(String[] xo)
	{
    String s1="xyz";
    for(int i=0;i<s1.length();i++)
    {
      for(int j=i+1;j<=s1.length();j++)
      {
        System.out.println(s1.substring(i, j));
      }
    }
}

}