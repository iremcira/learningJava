 class Student{
    int rollno;
    String name;
    int marks;

    
}


public class stringArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Irem";
        s1.marks = 98;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Muhammed";
        s2.marks = 89;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Berrin";
        s3.marks = 65;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Kemal";
        s4.marks = 76;

        Student students[] = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        // for(int i=0; i<students.length; i++){
        //   System.out.println(students[i].name + ":" + students[i].marks );
        // }

        for(Student stud : students){ 
            System.out.println(stud.name + ":" + stud.marks); //Enhanced For Loop
        } 

      
    }
    
}
