package basiccomparestrings;

import static java.lang.System.in;
import prog.io.*;
import static java.lang.System.out;
/**
 *
 * @author utente
 */
public class BasicCompareStrings {
    public static void main(String[] args) {
    //prova del metodo equals
    String n = "n";
    String p = "p";
    String m = "n";
   
    // i o
   
    ConsoleOutputManager out = new ConsoleOutputManager();
    ConsoleInputManager in = new ConsoleInputManager();
    
   /* boolean bob = n.equals(m); 
    out.println(bob); */
   //introduzione per l'utente
   out.println("Benvenuto/a. In questo programma potrai inserire due testi e ti diremo se sono uguali.");
    
    //approfondimento
    out.println("Bene, adesso proviamo.");
        boolean SiNo;
    
    do {
            out.println("Inserisci una stringa/un testo qualsiasi:");
    String ones;
        ones = in.readLine();
        out.println("Bene, ora inseriscine un'altro:");
    String twos;
    twos = in.readLine();
    
    if (ones.equals(twos)) { out.println("Le due stringhe sono uguali");}
    else {out.println("Le due stringhe sono diverse tra loro");}
   out.println("Vuoi provare di nuovo? Scrivi si o no");
        SiNo = in.readSiNo();
    } while (SiNo);    
        
     }
}
