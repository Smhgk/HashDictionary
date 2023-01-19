
package hashdictionary;


public class Node {
    
    private String[] data;
    private Node left;
    private Node right;
    
    public Node(String x){
        data = x.split(":");
        left= null;
        right = null;
    }

    public String getData() {
        return data[0];
    }
    public String getMeaning(){
        return data[1];
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setData(String data) {
        this.data[0] = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
