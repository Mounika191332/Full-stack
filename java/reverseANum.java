import java.util.*;
class reverseANum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp != 0){
         int ld=temp%10;
         rev=rev*10+ld;
        temp=temp/10;

}
if(rev==num){
    System.out.println("the number is palindrome");
}
else{
    System.out.println("the number is not palindrome");
}
//System.out.println(rev);

    }
}