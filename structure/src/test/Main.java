package test;


import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0;i<str.length();i++){
            hs.add(str.charAt(i));
        }
        if(hs.size()>2){
            System.out.println(0);
        }
        if(hs.size() == 1){
            System.out.println(1);
            return;
        }
        if(hs.size() == 2){
            System.out.println(2);
            return;
        }
    }

}
