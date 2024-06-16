class Human {

    private int age;
    private String name;

    //public Human() {    //Default Constructor
    //    age = 12;
    //    name = "Mami"; 
    //}

    //public Human(int a, String n) {   //Parametrized Constructor
    //    age = a;
    //    name = n;
    //}

    public Human() {
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {  
        return age;
    }

    public void setAge(int age){ 
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class thisKeyword {
    public static void main(String[] args) {
        
        Human obj = new Human();
        Human obj1 = new Human(18, "John");
        //obj.setAge(22);
        //obj.setName("Irem");
        
        System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj1.getName() + ":" + obj1.getAge());

    }        
    
}

 
