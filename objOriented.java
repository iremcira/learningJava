class Computer {
    public static void main(String a[]){

    }
    
    public String getMeAPen(int cost){
        
        if(cost >= 10)
           return "Pen";
        else
           return "Nothing";

    }

    public void playMusic(){
        System.out.println("Playing Music...");
    }

    
}



public class objOriented {
    public static void main(String a[]) {
            Computer obj = new Computer();
            String str = obj.getMeAPen(5);
            System.out.println(str);
            obj.playMusic();
            
    }
    
}
