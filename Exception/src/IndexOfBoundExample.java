// demo
// how to handle ArrayIndexOutOfBoundsException exception

public class IndexOfBoundExample{
  public static void main( String args []){
   int value;
   try
  {
  int array[] = { 6, 16, 26,36,46,56,66,76 };
  int index = 8;
  value = array[ index ];
  System.out.println("Execution does not reach here if there is a invalid index.");  
  }
   
   catch( ArrayIndexOutOfBoundsException e ) 
  { 
   System.out.println( "Valid indexes are 0,1,2,3,4,5,6 or 7" );
  }
   
   System.out.println( "End of program" );
  }
 }