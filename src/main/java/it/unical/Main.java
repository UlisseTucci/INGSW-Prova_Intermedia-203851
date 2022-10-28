package it.unical;

public class Main 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        FunnyAlgorithms funny = new FunnyAlgorithms();
        
        String stringa = "15";
        System.out.println( "Prima della conversione: " + stringa);
        
        Integer x = funny.stringToIntConverter(stringa);
        System.out.println( "Dopo la conversione: " + x);
    }
}
