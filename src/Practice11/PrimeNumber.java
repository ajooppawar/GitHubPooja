package Practice11;

public class PrimeNumber 
{
   public static void main(String[] args) 
   {
	   //if number >1 then tha no should have only 2 factors
	   //only 2 factors=prime no.
	   
	 int num=19;
	 int count=0;   //how many factors are there-only 2 factors-1 & itself
	 
	 if(num>1);    //chk 1st condition
	 {
		 for(int i=1;i<=num;i++)     //1
		 {
			 if(num%i==0)
			 count++;
		 }
		 if(count==2)
		 {
			 System.out.println("prime no.");
		 }
		 else
		 {
			 System.out.println("not a prime no.");
		 }
	      
	 }
}
}
