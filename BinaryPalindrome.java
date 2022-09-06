import java.util.*;
public class BinaryPalindrome{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.print("Enter a number: ");
            int n=sc.nextInt();
            int i=0,k=0;
            int bn[]=new int[20];
            int re[]=new int[20];
            while(n>0){
                bn[i]=n%2;
                n=n/2;
                i++;

            }
            for(int j=i-1;j>=0;j--){
                re[k++]=bn[j];
            }
            int flag=0;
            for(i=0;i<k;i++){
                if(bn[i]!=re[i]){
                    System.out.println("no");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("yes");
            }
            sc.close();
        }
    }
}