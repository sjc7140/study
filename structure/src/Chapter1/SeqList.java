package Chapter1;

import java.util.Arrays;

/**
 * 顺序表：数据按照连续的内存地址存放。
 * 底层使用数组。（连续的内存地址存放是用数组实现的）
 */
public class SeqList<E> {
    private Object[] data = null;       //data数组存放数据
    private int length;                 //线性表长度
    private int current;                //实际表长

    /**
     * 默认初始化长度为10
     */
    public SeqList(){
        this(10);
    }

    /**
     * 带参构造函数，指定初始化大小
     * @param initSize
     */
    public SeqList(int initSize){
        if(initSize>0){
            this.length = initSize;
            this.data = new Object[initSize];
            this.current = 0;
        }else{
            throw new RuntimeException("初始化长度不能小于0："+initSize);     //异常报错
        }
    }

    /**
     * 获取顺序表的长度
     * @return
     */
    public int length(){
        return this.length;
    }

    /**
     * 返回顺序表的实际长度
     * @return
     */
    public int size(){
        return this.current;
    }

    /**
     * 添加元素
     * @param e
     * @return
     */
    public boolean add(E e){
        //判断线性表是否已满
        ensureCapacity();
        //将元素添加到表尾部
        data[current++] = e;
        return true;
    }

    /**
     * 从指定位置取元素
     * @param index
     * @return
     */
    public E get(int index){
        if(index>=0){
            return (E)data[index];
        }else {
            throw new RuntimeException("下标不能小于0");
        }
    }

    /**
     * 删除指定下标的元素
     * @param index
     * @return
     */
    public E delete(int index){
        if(index >= length){
            throw new RuntimeException("下标超出表长");
        }
        if (index>=0){                          //将index后的元素逐个往前移。返回被删除的元素。
            E e = (E)data[index];
            for (int i = index;i<length-1;i++){
                data[i] = data[i+1];
            }
            --current;                          //实际表长-1;
            return e;
        }else {
            throw new RuntimeException("下标不能小于0");
        }
    }

    /**
     * 查询线性表里是否存在指定元素
     * 存在指定元素，返回元素的位置；没有指定元素，返回-1。
     * @param e
     * @return
     */
    public int serach(E e){
        if(e != null){
            for(int i = 0;i<length;i++){
                if(data[i] == e){
                    return i;
                }
            }
        }
        return -1;
    }
    
    /**
     * 判断顺序表是否为空
     * 为空返回true，不为空返回false。
     * @return
     */
    public boolean isEmpty(){
        if(current == 0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 判断线性表是否已满
     * 如果线性表满了，进行自动扩容
     */
    private void ensureCapacity() {
        if(current >= length){
            length *= 2;                //每次扩容，空间翻倍。
            data = Arrays.copyOf(data,length);
        }
    }


}
