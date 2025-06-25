package Generics;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenericClass<String> s=new MyGenericClass<>("mani");
		s.DisplayObjectDetails();
		System.out.println(s.getObject());
		
		MyGenericClass<Integer> i=new MyGenericClass<>(1234);
		i.DisplayObjectDetails();
		System.out.println(i.getObject());
		
		MyGenericClass<Double> d=new MyGenericClass<>(11.0);
		d.DisplayObjectDetails();
		System.out.println(d.getObject());

	}

}
