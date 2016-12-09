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
}
}
