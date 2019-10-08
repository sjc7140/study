package demo;

/**
 * 单链表的实现
 * 这里链表的索引是从0开始，在一些方法中进行判断很复杂？如insert
 * @param <E>
 */
@SuppressWarnings("unchecked")
public class LinkedList<E> {
    private Node first;         //首节点指针
    private Node last;          //加入一个尾结点指针，可以使尾部插入从O(n)变成O(1)
    private int length ;        //代表链表长度

    /**
     * 初始化创建一个空的首节点
     * 头指针，尾指针都指向它
     */
    public LinkedList(){
        first = new Node(null,null);
        last = first;
    }

    /**
     * 在尾部添加一个新的元素
     * @param e
     */
    public void add(E e){
        Node node = new Node(e,null);
        if(length == 0){
            //如果是空链表，把新节点添加到首节点后面,尾指针指向新指针
            last = node;
            first.setNext(node);
            length++;
        }else{
            //非空链表，添加到尾指针后面，尾指针再指向它
            last.setNext(node);
            last=node;
            length++;
        }
    }

    /**
     * 取得指定位置上的元素
     * @param index
     * @return
     */
    public E get(int index){
        return (E) getNode(index).getData();
    }

    /**
     * 删除最后一个元素
     * @return
     */
    public E delete(){
        if(length == 0){
            throw new RuntimeException("链表为空，无法删除元素");
        }
        //如果链表长度是1，删除尾结点，返回尾结点的数据
        if(length == 1){
            Node node = last;
            first.setNext(null);
            last = first;
            length--;
            return (E) node.getData();
        }
        //取得倒数第二的节点，将其next设置为空，将尾结点指针指向倒数第二节点，返回尾结点的值
        Node node = getNode(length-2);
        E e = (E)last.getData();
        node.setNext(null);
        last = node;
        length--;
        return e;
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
        return length == 0;
    }

    /**
     * 查询链表是否存在指定元素
     * 存在指定元素，返回true；反之返回false
     * @param e
     * @return
     */
    public boolean isContain(E e){
        if(length>0){
            for(int i = 0;i<=length-1;i++){
                if(get(i)== e){
                    return true;
                }
            }
            //遍历完毕，没有找到元素，返回false
            return false;
        }else{
            return false;
        }
    }

    /**
     * 查询指定元素第一次出现的位置
     * 没有指定元素返回-1
     * @param e
     * @return
     */
    public int indexOfElement(E e){
        if(length == 0){
            return -1;
        }
        for(int i = 0;i<length;i++){
            if(e == get(i)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 获得指定位置的节点
     * @param index
     * @return
     */
    private Node getNode(int index){
        if(length == 0){
            throw new IndexOutOfBoundsException("链表为空");
        }
        if(index < 0 || index > length-1){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        if(index == length){
            //如果是要取最后一个节点，不需要迭代，直接用尾指针
            return last;
        }
        Node node = first.getNext();
        int n = 0;
        //从0位置依次
        while(n != index){
            node = node.getNext();
            n++;
        }
        return node;
    }

    /**
     * 指定位置插入链表
     * @param index
     * @param e
     */
    public void insert(int index,E e){
        if(index < 0){
            throw new IndexOutOfBoundsException("索引不能为负数");
        }else if(length == 0 && index>0){
            /*
            插入式index和length有特殊关系，一般时候index=length-1
            但是当链表为空的时候，index == length，此时用 index>length-1来判断索引越界就错了
            所以此情况需要单独考虑
             */
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }else if(length != 0 && index > length -1){
            //链表不为空，index = length-1
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }

        if(index == 0){
            if(length == 0){
                //插入第一个位置，当链表为空时，其实是尾部插入
                add(e);
            }else{
                //链表不为空，插入第一个位置
                Node node = new Node(e,first.getNext());
                first.setNext(node);
                length++;
            }
        }else{
            //中间插入
            Node prev = getNode(index-1);
            Node node = new Node(e,prev.getNext());
            prev.setNext(node);
            length++;
        }
    }

    /**
     * 移除指定位置的元素
     * @param index
     */
    public void remove(int index){
        if(length == 0){
            throw new RuntimeException("链表为空");
        }
        if(index<0 || index>length-1){
            throw new RuntimeException("超出链表节点范围");
        }else if(length == 0 ){
            throw new RuntimeException("链表为空");
        }else if(index == length-1){
            //删除尾结点
            delete();
        }else if(index == 0){
            //删除头结点
            Node node = first.getNext();
            first.setNext(node.getNext());
            node.setNext(null);
            length--;
        }else{
            //删除中间节点
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
