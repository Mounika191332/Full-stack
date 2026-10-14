import java.util.*;
class stringHash {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        HashMap<String,Integer> mouni=new HashMap<>();
        String[] arr={"hello","hi","hello"};
        for(int i=0;i<arr.length;i++){
            String key=arr[i];
         mouni.put(key,mouni.getOrDefault(key,0)+1);  
        }
        
        
        for(String b:mouni.keySet())
        
        System.out.println(b +"-> "+mouni.get(b));
    }
}