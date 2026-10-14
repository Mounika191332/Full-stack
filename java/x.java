import java.util.*;
class x{
public static void main(String[] args){
HashSet<Integer> hs=new HashSet<>();
hs.add(2);
hs.add(8);
hs.add(78);
if(hs.contains(9)){
System.out.println("yes");
}
else{
System.out.println("no");

}
System.out.println(hs);
}
}