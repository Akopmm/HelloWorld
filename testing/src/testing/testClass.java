package testing;
import java.util.Date;
public class testClass {
public static void main(String[] args){
	Integer i=2;
	int j=1;
	j=i;
	i=j;
	System.out.println(i+" "+j);
	String s=String.format("%tc",new Date());
	System.out.println(s);
}
}
