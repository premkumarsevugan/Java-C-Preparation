import java.util.Scanner;

public class Elecount {
    public static void main(String args[]){
        int n,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int count=0;
        int l=sc.nextInt();
        int r=sc.nextInt();
        
        for(int i=l;i<=r;i++){
            for(k=l;k<i;k++){
                if(arr[i]==arr[k]){
                    break;
                }
            }
            if(i==k){
                count=count+1;
            }

    }
    System.out.println(count);
    sc.close();
}
}
