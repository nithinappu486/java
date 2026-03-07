package algo.Bainary;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {// SILENT LISTEN
        String s1 = "silent";
        String s2 = "listen";
        char[] a = s1.toCharArray();//s,i,l,e,n,t
        char[] b = s2.toCharArray();//l,i,s,t,e,n
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(Arrays.equals(a,b)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}

