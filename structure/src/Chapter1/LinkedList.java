package Chapter1;

public class LinkedList<E> {
    private Node first;         //首节点
    private int length = 0;     //代表链表长度


    /**
     * 初始化创建一个空的首节点
     */
    public LinkedList(){
        first = new Node(null,null);
    }


    /**
     * 添加一个新的元素
     * @param e
     */
    public void add(E e){
        Node node = new Node(e,null);
        if(length == 0){                    //如果是空链表，把新节点添加到首节点后面
            first.setNext(node);
            length++;
        }else{
            Node current = getLastNode();   //非空链表，找到链表最后一个元素，然后添加到最后
            current.setNext(node);
            length++;
        }
    }


    /**
     * 取得指定位置上的元素
     * @param index
     * @return
     */
    public E get(int index){
        Node node = this.getNode(index);
        return (E) node.getDate();
    }


    /**
     * 删除最后一个元素
     * @return
     */
    public E delete(){
        if(length == 0){
            throw new RuntimeException("链表为空,无法删除元素");
        }
        Node node = first.getNext();
        if(length == 1){                //把倒数第二个节点的指针设为null
            Node last = node;
            first.setNext(null);
            length--;
            return (E) last.getDate();
        }
        node = this.getNode(length-2);   //获得倒数第二个节点
        Node last = node.getNext();
        node.setNext(null);                    //把倒数第二个节点的指针设为null
        length--;
        return (E) last.getDate();
    }


    /**
     * 获取链表的最后一个节点
     * @return
     */
    public Node getLastNode(){
        if(length == 0){
            throw new RuntimeException("链表为空");
        }
        Node node = first.getNext();
        int n = 0;
        while(n != length-1){
            node = node.getNext();
            n++;
        }
        return node;
    }


    /**
     * 获取链表的长度
     * @return
     */
    public int length(){
        return length;
    }


    /**
     * 判断链表是否为空
     * 为空返回true，不为空返回false
     * @return
     */
    public boolean isEmpty(){
        if(length == 0){
            return true;
        }else {
            return false;
        }

    }

    /**
     * 获得指定位置的节点
     * @param index
     * @return
     */
    private Node getNode(int index){
        if(index < 0){
            throw new RuntimeException("索引不能小于0");
        }
        if(index>length-1){
            throw new RuntimeException("索引超过链表最大长度");
        }
        index++;
        Node node = first.getNext();
        int n = 0;
        while(n != index-1){
            node = node.getNext();
            n++;
        }
        return node;
    }

    /**
     * 指定位置插入链表
     * 1.如果链表为空或者插入位置超过链表最大长度，直接在末尾添加元素。
     * 2.如果链表存在元素，要插入到首位置，先让新节点指向第二个节点
     *      再让first指向新节点
     * 3.插入位置在中间，用getNode(index-1) 找到指定位置节点上一个节点，
     *      新节点指向index位置节点，index-1位置节点指向新节点
     * 4.插入数据后，length++ ;
     * @param index
     * @param e
     */
    public void insert(int index,E e){
        if (index<0){
            throw new RuntimeException("插入位置不能小于0");
        }
        if(length == 0 || index>length-1){
            this.add(e);
        }else if(index == 0 && length > 0){//插入第一个，先指向第二个，然后让first指向新节点
            Node node = new Node(e,first.getNext());
            first.setNext(node);
            length++;
        }else{
            Node target = this.getNode(index-1);
            Node node = new Node(e,target.getNext());
            target.setNext(node);
            length++;
        }
    }

    /**
     * 移除指定位置的元素
     * @param index
     */
    public void remove(int index){
        if(index<0){
            throw new RuntimeException("索引不能小于0");
        }else if(length == 0){
            throw new RuntimeException("链表为空");
        }else if(index > length-1){
            throw new RuntimeException("索引超出链表长度");
        }else if(index == length-1){      //要删除的索引是最后一个，直接调用delete()方法。
            this.delete();
            length--;
        }else if(index == 0){              //删除first后面一个节点
            Node node = first.getNext();
            first.setNext(first.getNext().getNext());
            node.setNext(null);
            length--;
        }else{                              //删除中间节点
            Node node = this.getNode(index-1);
            Node target = this.getNode(index);
            node.setNext(target.getNext());
            target.setNext(null);
            length--;
        }
    }

    @Override
    public String toString() {
        Node current = first.getNext();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int n = 0;n<=length-1;n++){    //打印元素
            sb.append(current+",");
            current = current.getNext();
        }
        sb.deleteCharAt(sb.length()-1);     //删除最后多余的一个逗号
        sb.append("]");
        if(sb.length()<2){                  //字符串小于2，说明没有元素，打印" [] ";
            return "[]";
        }
        return sb.toString();
    }

}
