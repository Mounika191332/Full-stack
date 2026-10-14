import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               //System.out.println(i+" "+j);
               int temp=0;
                for(int k=i;k<=j;k++){
                    temp += arr[k];
                    
                    
                }
                ans=Math.max(ans,temp);
               
            }
        }
         System.out.println(ans);
         sc.close();
    }
}