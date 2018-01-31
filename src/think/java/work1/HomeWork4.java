package think.java.work1;
class Dog{
	Dog(){
		System.out.println("I am a dog.");
	}
	Dog(String info){
		System.out.println("This is a "+info);
	}
	public void stuff(){
		System.out.println("hello");
	}
}
public class HomeWork4 {
	public static void main(String[] args){
		//work1:默认构建器
		Dog dog=new Dog(); 
		//work2:过载构建器
		Dog dog2=new Dog("baby dog");
		Dog[] dogs = new Dog[3];
		dogs[0]=new Dog("dog1");
		dogs[1]=new Dog();
	}
}
