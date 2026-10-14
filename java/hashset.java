import java.util.*;
class hashset{
public static void main(String[] args){
int arr[]={1,2,2,3};
HashSet<Integer> hs=new HashSet<>();
int d=0;
for(int i=0;i<arr.length;i++){

int val=arr[i];
if(!hs.contains(val)){
hs.add(val);
}
else{
d=val;
}

}
//System.out.println(d);
int missing=0;
int n=arr.length;
for(int i=1;i<=n;i++){
if(!hs.contains(i))
missing=i;
}
System.out.println(d +"  "+missing);
}
}
