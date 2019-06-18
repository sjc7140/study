package StringBase;

import org.junit.Test;

/**
 * 判断一个字符串是否是回文，所谓回文就是正着读和反着读都是相同的拼写。
 */
public class Demo {
    /*
    思路：将字符串折半，头尾依次对比，有不一样就退出
     */
    public boolean judgeStr(String str){
        if(str.length()<2){
            return false;
        }

        int half = str.length()/2;
        int start = 0;
        int end = str.length()-1;

        while(start < half){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }

    /*
    将一个字符串中的所有阿拉伯数字替换成中文‘数字’;
     */
    public String replaceNum(String str){
        String str1 = str.replaceAll("\\d","数字");
        return str1;
    }
    @Test
    public void test(){
        String str = "123haha123nihao 567sun";
        System.out.println(replaceNum(str));
    }
}
