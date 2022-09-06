import java.util.Scanner;

public class RemoveDuplicatesii {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                a[i]= sc.nextInt();
            }
            else{
                
                int key=sc.nextInt();
                int arr_size=a.length;
                for(int j=0;j<arr_size;j++){
                    if(key==a[j]){
                        break;
                    }
                    a[i]=key;
                }
            }
            for(int k=0;k<n;k++){
                System.out.println(k);
            }
        }
    }
}
