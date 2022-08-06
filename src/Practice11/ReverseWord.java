package Practice11;

public class ReverseWord 
{
   public static void main(String[] args) 
   {
	 String a ="My name is pooja";
	 
	    String[] words = a.split(" "); //splitting string into words
//	    
//	 //a.split=built in method
//	 //inide this we need to split this particular sentence into multiple parts
//	 //wherever the space is occured
//	 
//	 //string[]=to store the diffrent words=string array method
//	    
	    String reverseString="";
	    for(String b : words)   //my//name
//	    	
//	    	//one for each loop-words is name of array
//	    	//to extract each and every word which is there inside this for so
//	    	//bcoz this snd this thing is alrdy split into multiple parts and 1st 
//	    	//part is my likewise.........
//	    	//now i m reading each and every part my name is poojA
//	    	//store that into some other variable lets take string b
//	    	//now this word we want to reverse means b
//	    	
	    {
	    	String reverseword="";
	    	for(int i=b.length()-1 ; i>=0 ;i--)  //my//name
	    	{
	    		reverseword=reverseword+b.charAt(i);
	    	}
//	    		//1St it will read each and every character frm this string
//	    	// for every iteratin add that character into particular this reverse for 
//	    	//intially it is empty so each and every character will be added at the 
//	    	//end in the backward direction so once it is added all the character
//	    	//then function in the condtion become false & the reverse word will be 
//	    	//present
//	    
//	    
	    reverseString=reverseString+reverseword+" ";   //ym  //eman
//	    
//  // again it will go up this time it will get another 3rd word is "is"
//  //store that into b and now reverse what is empty again so again thhis will
//  //repeat or this will reverse is  and now the revrse word of is agin add into the main
//  //string so here is means si will be added 
//	 
	    }
	   System.out.println(reverseString);
	    
	    System.out.println();
	    System.out.println("**Ex.2***");
	    System.out.println();
	    
	  String ab="I can win";
	  String [] cd = ab.split(" ");
	  String reverseString1 = " ";
	  for(String w :cd)
	  {
		  String reverseword1="";
		  for(int j=w.length()-1;j>=0;j--)
		  {
			  reverseword1=reverseword1+w.charAt(j);
		  }
		  reverseString1=reverseString1+reverseword1+" ";
		 
	  }
	  
	  System.out.println(reverseString1);
	   
	  System.out.println();
	    System.out.println("**Ex.3***");
	    System.out.println();
	   
	  String h= "Definately placed";
	  String[] g = h.split(" ");  //splitting string into words
	  String reverseString2 ="";
	  for(String s :g)    //store the value of g into string s//def.//placed
	  {
		  String reverseword2="";    //
		  for(int k = s.length()-1 ; k>=0 ;k-- )  //definitely-//placed
		  {
			  reverseword2=reverseword2+s.charAt(k);
		  }
		  reverseString2=reverseString2+reverseword2+" ";//reverse word into main string
		                                     //yletinifed //
	  }
	  System.out.println(reverseString2);
	    }	 
   }	

   
