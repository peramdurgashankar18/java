//write a java program for multilevel inheritanceon numbers
class guest {
	void read(){
		System.out.println("read only:");
	}

}
class developer extends guest{
	void develope() {
		System.out.println("write only:");	
	}
}
class manager extends developer{
	void manage(){
		System.out.println("manager only:");
	}
}
public class inheritance{
	public static void main(String[] args){
		manager m= new manager();
		m.read();
		m.develope();
		m.manage();
	}
}
	
