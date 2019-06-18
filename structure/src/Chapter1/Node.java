package Chapter1;

/**
 * 链表的节点类
 * @param <E>
 */
public class Node<E> {
    private Object data = null;         //数据域
    private Node next;                  //指针域

    //初始化
    public Node(E e,Node next){
        this.data = e;
        this.next = next;
    }

    //得到数据
    public Object getData() {
        return data;
    }

    //得到下一个节点
    public Node getNext() {
        return next;
    }

    //设置节点数据
    public void setData(Object date) {
        this.data = date;
    }

    //设置下一个节点
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  "" + data;
    }
}
