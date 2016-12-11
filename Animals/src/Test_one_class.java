
public class Test_one_class {
	
	public static Test_one_class T;
	private static int n=0;
    
	public Test_one_class(){
    	
		if (n==0){
			n=1;
			T=new Test_one_class();
    	}
    }
}
