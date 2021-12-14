interface Animal{
	default void print(){
		System.out.println("Animal: Dog");
	}
}

interface Bird{
	default void print(){
		System.out.println("Bird: Piegon");
	}
}
 
class Pet implements Animal,Bird{
	public void print(){
		Animal.super.print();
	    Bird.super.print();
	}
 
    public static void main(String args[]){
        Pet k = new Pet();
		System.out.println("Animal name is: \n");
		k.print();
    }
}