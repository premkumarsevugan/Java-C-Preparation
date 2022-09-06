
import java.util.*;

public class RemoveDuplicates{
    public static int RemoveDupe(int n,int arr[]){
        if(n==0||n==1){
            return n;
        }
        else{
            int j=0;
            for(int i=0;i<n-1;i++){
                if(arr[i]!=arr[i+1]){
                    arr[j++]=arr[i];
                }
                
            }
            arr[j++]=arr[n-1];
            return j;
        }
    }
    public static void main(String args[]){
        int n,i=0;
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enetr array Values:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        sc.close();
        int res=RemoveDupe(n,arr);
        System.out.println("The duplicates removed array:");

        for(i=0;i<res;i++){
            System.out.println(arr[i]);
        }
    
    }
}
