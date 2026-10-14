class chaiShop{
    String branch;
    int cups;
    int ppc;
    public chaiShop(String branch,int cups,int ppc){
        this.branch=branch;
        this.cups=cups;
        this.ppc=ppc;
    }
     public void revenue(){
        System.out.println("revenue="+(cups*ppc));
    }
    public void display(){
        System.out.println(branch);
        System.out.println(cups);
        System.out.println(ppc);
        revenue();
    }
    public void annaTea(int count){
        cups +=count;
    }
    public void kulad(int p){
        ppc+=p;
    }
    
}
class classObj {
    public static void main(String[] args) {
        chaiShop obj1=new chaiShop("mouni",0,0);
        //System.out.println(obj.branch);
        //System.out.println(obj.cups);
        obj1.annaTea(4);
         obj1.kulad(2);
        obj1.display();
        //obj1.kulad(2);
        //obj1.revenue();
        chaiShop obj2=new chaiShop("sai",87,2);
        obj2.display();
       // obj2.revenue();
        
        
    }
}