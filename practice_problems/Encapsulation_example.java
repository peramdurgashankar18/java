class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}




// there is an very good example that we are all well know is Linked List Node creation.
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
