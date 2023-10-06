package ss11_stack_queue.queueu;

public class Solution {
    public Queue queue;
    public void enQueue(int value) {
        Node tmp = new Node();
        tmp.data = value;
        if(queue.font == null) {
            queue.font = queue.rear = tmp;
        }else {
            queue.rear.link = tmp;
            queue.rear = tmp;
            queue.rear.link = queue.font;
        }
        queue.size++;
    }
    public Node deQueue() {
        if(queue.font == null) {
            return null;
        }else if(queue.font == queue.rear) {
            Node tmp = queue.font;
            queue.font = queue.rear = null;
            queue.size--;
            return tmp;
        }else {
            Node tmp = queue.font;
            queue.font = queue.font.link;
            queue.rear.link = queue.font;
            queue.size--;
            return tmp;
        }
    }
    public void showQueue() {
        Node itr = new Node();
        itr = queue.font;
        for(int i = 0; i < queue.size; i++) {
            System.out.println(itr.data);
            itr = itr.link;
        }
    }

}
