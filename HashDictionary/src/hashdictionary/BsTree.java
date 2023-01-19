
package hashdictionary;

public class BsTree {
    private Node root;
    private Node nodeSearch;
    
    public BsTree(){
        root = null;
    }
    
    public void insertIteratively(String newData){
        Node current = this.getRoot();
        if(root == null){
            this.setRoot(new Node(newData));
        }
        else{
            while(true){
                if(((int)current.getData().charAt(1)) > ((int)newData.charAt(1))){
                    if(current.getLeft()== null){
                        current.setLeft(new Node(newData));
                        break;
                    }
                    current = current.getLeft();
                }else{
                    if(current.getRight()== null){
                        current.setRight(new Node(newData));
                        break;
                    }
                    current = current.getRight();
                }
            }
        }
    }
    public void printInOrder(Node current){
        if(current == null)
            return;
        printInOrder(current.getLeft());
        System.out.println("");
        System.out.print(" || " + current.getData() +":" + current.getMeaning() + " || ");
        printInOrder(current.getRight());
        
    }
    public boolean searchBst(Node root, String word){
        this.nodeSearch = null;
        if(root == null){
            return false;
        }
        if(root.getData().equals(word)){
            nodeSearch = root;
            return true;
        }
        if(root.getData().charAt(1) > word.charAt(1)){
            return searchBst(root.getLeft(), word);
        }else if(root.getData().charAt(1) < word.charAt(1)){
            return searchBst(root.getRight(), word);
        }
        return false;
    }
    public Node getRoot(){
        return root;
    }
    public void setRoot(Node r){ 
        this.root = r;
    }
    public Node getNodeSearch(){
        return nodeSearch;
    }
}

