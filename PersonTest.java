public class PersonTest
 {
 public static void main( String args[] )
   {
     Person person = new Person( "John", "Smith", 19 );

     System.out.printf( "Created %s %s, age %d\n", person.getFirstName(), person.getLastName(), person.getAge() );

   
     } // end main
 } // end class PersonTest