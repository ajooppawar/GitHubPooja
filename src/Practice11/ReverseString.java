package Practice11;

public class ReverseString {

	public static void main(String[] args) 
	{
	
	     //1.String Concatenation 
	    	String a = "Pooja ";
	    	
	       String rev=""; // to store the reverse no.
	       
	       int length = a.length(); //length of a string-4
	       
	       for(int i=length-1; i>=0; i--)
	       {
	    	   rev = rev + a.charAt(i);
	       }
	       System.out.println("Reverse string is :" +rev);
	       
	   	//2.stringbuffer is a class
			//by using object of this class we can reverse
	       
	       
		
//			StringBuffer b = new StringBuffer(a);   
//		       System.out.println(b.reverse());	
	       
	       String c= "pawar";
	        String rev1="";
	        
	        int str = c.length();
	        
	        for(int i = str-1 ; i>=0 ; i--)
	        {
	        	rev1 = rev1 + c.charAt(i);
	        }
	       
	       System.out.println(rev1);
	       
	       
	}

}
