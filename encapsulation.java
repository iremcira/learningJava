class Human {

    private int age;
    private String name;

    public int getAge() {  //Getters
        return age;
    }

    public void setAge(int a){ //Setters
        age = a;

    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Irem");
        
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
    
}
