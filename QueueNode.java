import java.util.Queue;

public class QueueNode<T> { //QueueNode class
   //instance data
    private QueueNode parent;
    private QueueNode child;
    private T data;

    public QueueNode(){ //empty constructor
    }

    public QueueNode(T data){ //constuctor with 1 parameter
        this.data = data;
    }

    public QueueNode(T data, QueueNode parent, QueueNode child){ //constructor with 3 parameters
        this.data = data;
        this.parent = parent;
        this.child = child;
    }

    public void setData(T data){ //data to set a node to certain data
        this.data = data;
    }

    public void setParent(QueueNode parent){
        this.parent = parent;
    }

    public void setChild(QueueNode child){ //setting child using queuenode
        this.child = child;
        makeParent(child);
    }

    public void makeParent(QueueNode child){//making parent node
        child.parent = this;
    }

    public T getData(){ //getting data
        return data;
    }

    public QueueNode getParent(){ //getting parent
        return parent;
    }

    public QueueNode getChild(){ //getting child
        return child;
    }

    public String toString(){ //printing out node
        return "Node: "+data.toString();
    }

    public boolean equals(QueueNode n) { //equals method
        return this.data.equals(n.getData());
    }
}
