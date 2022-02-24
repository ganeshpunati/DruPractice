package javatraining;

public class Dog {
	private String color;
	private int size;
  /*Dog(String color,int size){
		System.out.println("Dog color is : "+ color);
		System.out.println("Dog size is : "+ size);
	}*/
	public void setDog(String color,int size) {
		this.color = color;
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
	//	new Dog("red",5);	
		Dog object =new Dog();
		String color="red";
		int size=7;
		object.setDog(color,size);
		System.out.println("New Dog color is : "+object.getColor());
		System.out.println("New Dog Size is : "+object.getSize());
	}

}
