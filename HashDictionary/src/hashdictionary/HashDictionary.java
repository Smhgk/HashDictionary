/*
NAME-SURNAME: SEMIH CEMAL GOK
NUMBER: 200316063
*/
package hashdictionary;

import java.io.FileNotFoundException;

public class HashDictionary {

    public static void main(String[] args) throws FileNotFoundException  {
      Text txt = new Text();
       myHash hTable = new myHash(27);
       
       for(int i = 0; i<34; i++){
           hTable.add(txt.list.get(i));
       }
       hTable.printMap();
        System.out.println("-------Word Searching Examples-------");
      hTable.search("colosseum");
      hTable.search("up");
    }
    
}
