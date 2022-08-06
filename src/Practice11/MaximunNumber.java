package Practice11;

public class MaximunNumber 
{
   public static void main(String[] args) 
   {
	 int a[] = {5,6,9,7,8,3};
	 int max = a[0];
	 for(int i = 1 ; i<a.length ; i++)
	 {
		 if(a[i]>max)
		 {
			max= a[i];
		 }
	 } 

	 System.out.println(max);		

   
   int b[] = {5,6,9,7,8,3};
	 int min = b[0];//9
	 for(int i = 1 ; i<=b.length ; i++)
	 {
		 if(b[i]<min)
		 {
			min= b[i];
		 }
	 } 
   System.out.println(min);
   
   
   
   
}  
}