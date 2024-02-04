import java.util.*;
public class Array_2 {
    public static int  linear(int numbers[], int k) {
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
public static void main(String[] args) {
    int numbers[]={2,3,4,6,7,8,3,32,5};
    System.out.println(largest(numbers));
}
}