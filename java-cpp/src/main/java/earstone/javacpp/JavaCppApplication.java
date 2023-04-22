package earstone.javacpp;

import earstone.javacpp.animals.Cat;

import java.lang.reflect.Method;

public class JavaCppApplication {

	public static void main(String[] args) {
		Cat myCat = new Cat(10, "myCat");
		Cat yourCat = new Cat(10, "yourCat");

		Method[] methods1 = myCat.getClass().getMethods();
		Method[] methods2 = yourCat.getClass().getMethods();

		System.out.println(myCat.getMName().hashCode());
		System.out.println(yourCat.getMName().hashCode());
	}

}
