public class Time{
 
  public static void main (String[]args){
    int hours = 14;
    int minutes = 30;
    int seconds = 20;
    int passed = (hours * 3600 + minutes * 60 + seconds);
    int remain = (24 * 3600 - passed);
    double percentage = passed /(24.0 * 3600);
    
    System.out.println ( hours + ":" + minutes + ":" + seconds);
    System.out.println (" number of seconds since midnight");
    System.out.println ( passed + " "+ "seconds");
    System.out.println ("number of seconds remainning " +  " " + remain);
    System.out.println ( "percentage" + " " + percentage);
    
    
  }
}