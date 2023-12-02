import java.util.Scanner;

public class fibonacci {
    public static Scanner sc=new Scanner(System.in);
    public static int fibo(int n){
        if (n<0){
            return -1;
        } else if (n==0 || n==1) {
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.print("nhập vào số n: ");
        int n= sc.nextInt();
        System.out.print(n + " số đầu tiên của dãy fibonacci là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}