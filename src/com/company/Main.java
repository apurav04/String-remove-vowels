package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();

        System.out.print(removevowel(str));

    }
    public static String removevowel(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                str=str.substring(0,i)+str.substring(i+1);
            }
        }
        return str;
    }
}
