import java.util.*;
public class largest_ele{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        largestElement(arr);
        System.out.println(largestElement(arr));
    }
    public static int largestElement(int[] arr){
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
