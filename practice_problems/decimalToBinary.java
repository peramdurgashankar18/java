import java.util.*;
public class decimalToBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(decimalToBinary(n));
    }
    public static String decimalToBinary(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        return sb.reverse().toString();
    }
}
