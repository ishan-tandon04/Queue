public class Queue <T> {
    private QueueNode<T> beginning; //instance data
    private QueueNode<T> end;
    private QueueNode<T> oldNode;
    private int length;

    public Queue(){//default constructor
        length = 0;
        beginning = null;
        end = null;
        oldNode = new QueueNode<T>();
    }
    public void enqueue(T data){ //creates a queueNode with data stored insdie of it
        QueueNode<T> newNode = new QueueNode<T>(data);
        if(beginning == null){
            this.beginning = newNode;
        }
        else if (end == null){
            this.end = newNode;
            newNode.setParent(this.beginning);
        }
        else{
            newNode.setParent(this.end);
            this.end = newNode;
        }
        length++; //adds 1 to size, so there is space to add more
    }
    public T dequeue() { //moves to last node to find last entered value
        QueueNode<T> returnable = beginning;
        QueueNode<T> currNode = end;
        for (int i = length - 2; i > 0; i--) {
            currNode = currNode.getParent();
        }
        end = currNode;
        currNode.setParent(null);
        length--; //subtracts one when last entry is removed

        return returnable.getData();
    }

    public boolean isEmpty(){ //to check if the queueNode is empty or not
            return !(length>0);
    }
    public int size(){//finds size of queueNode
        return length;
    }

    public QueueNode peek(){//peek method to go back to begginning of Node
        return beginning;
    }


}
