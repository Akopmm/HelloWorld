import java.util.*;
public class Test {
public static void main(String[] args){
	Wolf B=new Wolf();
	System.out.println(B.getName());
	ArrayList<Object> AL = new ArrayList<Object>();
	AL.add(B);
	AL.add(B);
	System.out.println(AL.size());
	ArrayList<String> Str = new ArrayList<String>();
	Str.add("1");
	Str.add("second");
	for (String s: Str){
		System.out.print(s+" ");
	}
	System.out.print("\n");
	ArrayList<Object> ob= new ArrayList<Object>();
	ob.add(B);
	if (ob.get(0) instanceof Wolf){
		Wolf c=(Wolf) ob.get(0);
		System.out.println(c.getSize());
	}
	Dog d = new Dog();
	d.beFriendly();
	System.out.println(Wolf.min(1,2));
		
	Test_one_class M= new Test_one_class();
	Test_one_class N= new Test_one_class();
	String a="231";
	int l=Integer.parseInt(a);
	System.out.println(l+2);
	}	
}
