import java.util.Scanner;

public class wibro {
    public static void main(String args[]){
        int n,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=sc.nextInt();
        int ia[][]=new int[n][];
        for(int i=0;i<n;i++){
            int size=sc.nextInt();
            ia[i]=new int[size];
            for(int j=0;j<size;j++){
                ia[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<t;i++){
            int p=sc.nextInt();
            int m=sc.nextInt();
            System.out.println(ia[p][m]);

        }
        
        }
        
    }

