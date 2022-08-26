//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   a = a.replaceAll("#", "");
	   if ((a.indexOf("a") == 0 ) || (a.indexOf("e") == 0 ) || (a.indexOf("i") == 0 ) || (a.indexOf("o") == 0 ) || (a.indexOf("u") == 0 )){
		   return "yes";
	   }
	   else if ((a.indexOf("A") == 0 ) || (a.indexOf("E") == 0 ) || (a.indexOf("I") == 0 ) || (a.indexOf("O") == 0 ) || (a.indexOf("U") == 0 )){
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}