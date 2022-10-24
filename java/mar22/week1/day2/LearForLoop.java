package mar22.week1.day2practice;

public class LearForLoop {

	public static void main(String[] args) 
	{
		//for(datatype variablename=value; condition; increment or decrement operator) 
         for(int i=1; i<10; i++)
          {
        	 System.out.println(i); 
          }

          for(int i=10; i>1; i--)
          {
        	 System.out.println(i); 
          }
      // if you are using inside loop and outside loop, then we need to declare the data type above
      // data type declared is only for the one output of one loop
      // it will only work for inside loop not for outside loop
          int i;
          
          for (i=10; i>1; i--)
          {
        	 System.out.println("inside loop: "+i); 
          }
           System.out.println("outside loop: "+i);
	}
	

}
