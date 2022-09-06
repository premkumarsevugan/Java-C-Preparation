import java.util.Scanner;

public class AinersectionB {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b=new int[n];
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }
        sc.close();
    }
}
