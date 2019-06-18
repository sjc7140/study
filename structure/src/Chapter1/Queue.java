package Chapter1;

import java.util.Arrays;

/**
 * c++数据结构书上的方式。
 * 队首是value[0]，且队首不会移动，这就需要每次出队后移动数组：出队时间复杂度O(1)
 * @param <E>
 */
public class Queue<E> {
    private Object[] value = null;      //存放数据
    private int length;                 //队列长度
    private int head = 0;                   //队首
    private int rear = 0;                   //队尾

    public Queue(){                     //默认初始化
        this(10);
    }

    public Queue(int initSize){         //初始化指定大小的队列
        if(initSize <= 0){
            throw new RuntimeException("初始化长度必须大于0");
        }else{
            value = new Object[initSize];
            length = initSize;
        }
    }

    /**
     * 入队操作
     * 特殊情况，队列为空，一个元素入队后，队尾不会增长。
     * @param e
     */
    public void enQueue(E e){
        ensureCapity();
        if(rear == 0 && value[0] == null){
            value[rear] = e;
        }else if(rear == 0 && value[0] != null){
            value[++rear] = e;
        }else{
            value[++rear] = e;
        }

    }

    /**
     * 进行出队操作
     * @return
     */
    public E reQueue(){
        return null;
    }

    /**
     * 获取队列中的元素个数
     * @return
     */
    public int length(){
        if(rear > 0 ){
            return rear-head;
        }else if (rear == 0 && value[rear] != null){
            return 1;
        }else if(rear == 0 && value[rear] == null){
            return 0;
        }else{
            throw new RuntimeException("队列长度异常");
        }
    }

    /**
     * 判断队列是否为空
     * 空返回ture
     * 非空返回false
     * @return
     */
    public boolean isEmpty(){
        if(rear > 0 ){
            return false;
        }else if (rear == 0 && value[rear] != null){
            return false;
        }else if(rear == 0 && value[rear] == null){
            return true;
        }else{
            throw new RuntimeException("队列长度异常");
        }
    }

    /**
     * 队列满了，还有元素要入队，进行扩容
     */
    private void ensureCapity(){
        if(rear >= length){
            length *= 2;
            value = Arrays.copyOf(value,length);
        }
    }

    /**
     *
     */
    public void adjust(){
        for (int i = 0;i<rear-1;i++){
            value[i] = value[i+1];
        }
        value[rear] = null;
    }
}
