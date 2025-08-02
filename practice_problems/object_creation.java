class object1 {
    String name;
    int RollNO;
    String Grade;
    void displaydetails(){
        System.out.println("My name is: "+ name);
        System.out.println("My RollNo is: "+ RollNO);
        System.out.println("My grade is:" + Grade);
    }
}
public class creation{
    public static void main(String[] args){
        object1 create=new object1();
        create.name="Shankar";
        create.RollNO=21;
        create.Grade="A";
        create.displaydetails();
    }
}
