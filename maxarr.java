import java.util.*;
public class maxarr {
    public static void main(String args[]){
        int max;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            max=0;
            
            int l=sc.nextInt();
            int r=sc.nextInt();
            for(int j=l;j<=r;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
                
            }
            System.out.println(max);
        }
        sc.close();
    }
    
}
