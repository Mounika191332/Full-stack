 class cal {
    public void music(){
        System.out.println("music");
    }
    public String pen(int cost){
       // return "song";
       if(cost>=10){
        return "pen";
       }
       return "not a pen";
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    
}
public class method{
    public static void main(String args[]){
        cal c=new cal();
        c.music();
        String result=c.pen(5);
        System.out.println(result);
    }
}