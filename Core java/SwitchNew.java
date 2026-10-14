public class SwitchNew {
    public static void main(String args[]){
        String n="wednesday";
        switch(n){
            case "monday", "tuesday" ->System.out.println("6am");
               // break;
            case "wednesday" -> System.out.println("5am");
                //break;
            default->System.out.println("wednesday");
        }
    }
    
}
