import java.util.Scanner;

public class chuoisobinhphuong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap n: ");
        int n =sc.nextInt();
        System.out.print(" { ");
        for (int i=1; i<=n; i++){
            System.out.print((i) + " : " + (i*i));
            if (i==n){
                break;
            }
            System.out.print(" ; ");
        }
        System.out.println(" } ");
    }
}
