package task04;

import java.util.Scanner;

public class Task04 {
	
    public static String binConvert(int n) {
        if (n>0) {
            String str="";
            if (n%2==0) {
                str="0";
            } else {
                str="1";
            }
            n/=2;
            return binConvert(n)+str;
        }
        return "";
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        System.out.println(binConvert(num));
    }

}
