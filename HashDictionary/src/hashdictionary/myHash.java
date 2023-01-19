
package hashdictionary;



public class myHash {
    private final BsTree[] keys;
    
    public myHash(int tableSize){
        this.keys = new BsTree[tableSize];
        for(int i = 0; i< tableSize; i++){
            this.keys[i] = new BsTree();
        }
    }
    public void add(String newValue){
        int indx = hash(newValue);
        this.keys[indx].insertIteratively(newValue);
    }
    public int hash(String newValue){
        char a = newValue.charAt(0);
       return ((int)a) % 32;
    }
    public void printMap(){
        for(int i = 1; i< this.keys.length; i++){
            System.out.print("[" + (char)(i+64) + "]" + "-----------");
            this.keys[i].printInOrder(this.keys[i].getRoot());
            System.out.println("");
            
        }
    }
    public void search(String word){
        int hash = hash(word);
        if(keys[hash].searchBst(keys[hash].getRoot(), word) == true){
            System.out.println(word + ": " + keys[hash].getNodeSearch().getMeaning());
        }else{
            System.out.println("Word not found !!!!");
        }
    }
    
    
}
