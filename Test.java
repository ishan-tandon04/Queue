public class Test { //driver class to test out all methods
    public static void main(String[] args) {
        Queue<String> QueueTest = new Queue();
        QueueTest.enqueue("What is up");
        System.out.println("print 1");
        System.out.println(QueueTest.size());
        QueueTest.enqueue("hey how u doing");
        QueueTest.enqueue("ya like jazz?");
        System.out.println("should print what is up");
        System.out.println(QueueTest.dequeue());
        System.out.println("should print 2");
        System.out.println(QueueTest.size());
        System.out.println(QueueTest.peek());
        System.out.println("should print false");
        System.out.println(QueueTest.isEmpty());
    }
}
