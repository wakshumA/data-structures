import com.oracle.tools.packager.JreUtils;

public class MyTree {
    public Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }
public void insert(int value){
        Node newNode=new Node(value);
        if(root==null) {
            root=newNode;
            return;
        }
}
}
