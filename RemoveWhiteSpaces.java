package code;
class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
  
//        char[] chars = str1.toCharArray();
//  
//        StringBuffer sb = new StringBuffer();
//  
//        for (int i = 0; i &lt; chars.length; i++)
//        {
//            if( (chars[i] != ' ') &amp;&amp; (chars[i] != '\t') )
//            {
//                sb.append(chars[i]);
//            }
//        } 
        System.out.println(str1);
                 //Output : CoreJavajspservletsjdbcstrutshibernatespring
        
        String str3 = str1.replaceAll("\\\\s+", " ");
        System.out.println(str3);
    }
}