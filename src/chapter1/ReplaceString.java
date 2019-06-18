package chapter1;

import java.util.LinkedList;
import java.util.Stack;

public class ReplaceString {
    public static String Main(String str){
        char[] subStr = new char[20];
        for(int i = 0;i<str.length()-1;i++){
            int head = i-1;
            int tail = i+2;
            if(str.charAt(i) != str.charAt(i+1)){
                continue;
            }else{
                while( (head>0) || (tail<str.length())){
                    if(str.charAt(i-1) == str.charAt(i+2)){
                        head--;
                        tail++;
                    }
                }
                if(subStr.length<head-tail){
                    int temp = 0;
                    for(int j = head;j<=tail;j++){
                        subStr[temp] = str.charAt(j);
                        temp++;
                    }
                }
            }
        }
        return subStr.toString();
    }

    public static void main(String[] args) {
        String str = "abbaad";
        System.out.println(Main(str));
    }
}
