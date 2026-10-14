import java.util.*;
class hash1{
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        HashMap<Integer,Integer> mouni=new HashMap<>();
        int[] arr={1,2,3,4,2,1};
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
          if(mouni.containsKey(n)){
           int prev=mouni.get(n);
        mouni.put(n,prev+100); 
        }else{
            mouni.put(n,1);
        }  
        }
        
        
        for(int b:mouni.keySet())
        
        System.out.println(b +"-> "+mouni.get(b));
    }
}