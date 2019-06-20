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
    private int cacheMax = 5;

    public LinkedList1(){
        list = new LinkedList<E>();
    }

    /**
     * 查询缓存
     * @param e
     */
    public void serach(E e){
        if(list.isContain(e)){
            //数据存在缓存中，将数据更新到头部
            list.remove(list.indexOfElement(e));
            list.insert(0,e);
        }else{
            if(list.length() < cacheMax){
                //数据不在缓存中，缓存未满，将查询的数据添加到头部
                list.insert(0,e);
            }else{
                //数据不在缓存中，缓存已满，将查询的数据添加到头部，删除尾部数据
                list.insert(0,e);
                list.delete();
            }
        }
    }

    /**
     * 查看当前缓存中的数据
     */
    public void printCache(){
        System.out.println(list);
    }
}
