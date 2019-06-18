package Chapter1;

import java.util.Arrays;

public class Stack <E> {
    private Object[] value = null;         //存放数据
    private int length;             //栈的长度
    private int top = -1;           //栈顶:为-1时，没有元素

    public Stack(){                 //默认初始化一个长度为10的栈
        this(10);
    }

    public Stack(int initSize){     //自定义初始化长度
        if(initSize > 0){
            value = new Object[initSize];
            length = initSize;
        }else {
            throw new RuntimeException("初始化长度必须大于0");
        }
    }

    /**
     * 将一个元素压栈
     */
    public void push(E e){
        ensureCapity();
        top++;
        value[top] = e;
    }

    /**
     * 将一个元素出栈
     * @return
     */
    public E pop(){
        if(top<0){
            return null;
        }else{
            return (E) value[top--];
        }
    }

    /**
     * 栈空间不足时，进行扩容
     */
    private void ensureCapity() {
        if(top >= length-1){
            length *= 2;
            value = Arrays.copyOf(value,length);
        }
    }

    /**
     * 查询栈内的元素个数
     * @return
     */
    public int length(){
        return top+1;
    }

    /**
     * 判断是否是空栈
     * 是空栈：返回true
     * 不是空栈：返回false
     * @return
     */
    public boolean isEmpty(){
        if(top<0){
            return true;
        }else{
            return false;
        }
    }
}
