
package hashdictionary;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Text{
    Scanner s;
    ArrayList<String> list;
    public Text() throws FileNotFoundException{
     s = new Scanner(new File("C:\\Users\\gokse\\OneDrive\\Masaüstü\\key.txt"));
     list = new ArrayList<>();
     while(s.hasNextLine()){
         list.add(s.nextLine());
     }
     s.close();
    }
    
    
     
    
}
