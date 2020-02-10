package Programs;

import java.nio.ShortBuffer;
import java.util.Scanner;
class ReverseNumberWhile
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");
      //This statement will capture the user input
      Scanner in = new Scanner(System.in);
      //Captured input would be stored in number num
      num = in.nextInt();
      //While Loop: Logic to find out the reverse number
      while( num != 0 )
      {
          reversenum = reversenum * 10;  
          reversenum = reversenum + num%10;
          num = num/10;
      }
      System.out.println("Reverse of input number is: "+reversenum);
      
      
      
      
      //Method 2 Stringbuffer reverse
      int num2=3456;
      
      StringBuffer sb=new StringBuffer(String.valueOf(num2));
      System.out.println("reverse of "+num2 +"is :"+sb.reverse());
      
      
      
      //Method 2 Stringbuffer reverse
      int num3=1300;
   
      StringBuilder sbld=new StringBuilder(String.valueOf(num3));
      System.out.println("reverse of "+num3 +"is :"+sbld.reverse());
   }
}