package Chapter1;

/**
 * 使用链表实现lru算法。
 * 指定一个长度固定的链表。
 * 在链表中查询数据。
 * 若存在该数据，将该数据从原来地方删除，添加到表头。
 * 若不存在该数据，将该数据添加到链表头（若链表长度满了，删除最后一个节点）
 */
public class LinkedList1<E> {

    private LinkedList<E> list;
    //指定链表长度，即缓存大小
    private int cacheMax = 10;

    /**
     * 查询缓存：没有，就添加到头部
     * @param e
     */
    private void serach(E e){

    }
}
