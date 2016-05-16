package pattern.adaptor;


public class AdaptorTest {
	public static void main(String[] args) {
		
//		// Class adaptor 
//		Targetable target = new Adaptor();
//		target.method1();
//		target.method2();
		
//		// Object adaptor
//		Source source = new Source();
//		Targetable target = new Wrapper(source);
//		target.method1();
//		target.method2();
		
		// Interface adaptor
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		
		
        source1.method1();  
        source1.method2();  
        source2.method1();  
        source2.method2();  
		
	}

}
