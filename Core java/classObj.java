class calculator{
    int a;
    public int add(int a,int b){
        //System.out.println("addition");
        int r=a+b;
        return r;
    }
}

public class classObj {
    public static void main(String args[]){
        int num1=3;
        int num2=2;
        calculator cl=new calculator();
        int result=cl.add(num1,num2);
            System.out.println(result);
        
    }
    
}
