class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}
public class Queue {
    Node front;
    Node rear;

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
        } else {
            this.rear.link = temp;
            this.rear = temp;
        }
    }
    public Node deQueue() {
        Node temp = this.front;
        if (this.front == null) {
            return null;
        } else {
            if (this.front == this.rear) {
                this.front = this.rear = null;
            } else {
                this.front = this.front.link;
                this.rear.link = this.front;
            }
            return temp;
        }
    }
    public void displayQueue(){
        Node temp = front;
        while (temp.link != this.front){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}
