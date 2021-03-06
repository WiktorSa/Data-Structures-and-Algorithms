package tree;
public class Node 
{
    private Node left;
    private Node right;
    private int key;

    public Node(int key) 
    {
        this.key = key;
    }

    public Node(Node node) 
    {
        this.left = node.left;
        this.right = node.right;
        this.key = node.key;
    }

    public Node getLeft() 
    {
        return left;
    }

    public Node getRight() 
    {
        return right;
    }

    public int getKey() 
    {
        return key;
    }
    
    public void setLeft(Node left) 
    {
        this.left = left;
    }

    public void setRight(Node right) 
    {
        this.right = right;
    }

    public void setKey(int key)
    {
    	this.key = key;
    }
}