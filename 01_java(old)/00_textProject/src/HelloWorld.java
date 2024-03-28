import java.util.Date;

public class HelloWorld{
   public static void main(String[] args){
      System.out.println("Welcome to Java");
      System.out.println("First Java program");
	   //char a = 'a';
	   //System.out.println((char)(a + 1));
      
      /*
      int a = 3;
      
      if(true) {
    	  int b = 5;
    	  System.out.println(a);
      }
      */
      Date today = new Date();
      Date when = new Date(19700101000000L);
      System.out.println(today);
      System.out.println(when);
   }
}