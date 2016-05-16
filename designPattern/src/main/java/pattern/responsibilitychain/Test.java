package pattern.responsibilitychain;

public class Test {
	public static void main(String[] args) {
		MyHandler myhandler1= new MyHandler("h1");
		MyHandler myhandler2= new MyHandler("h2");
		MyHandler myhandler3= new MyHandler("h3");
		
		myhandler1.setHandler(myhandler2);
		myhandler2.setHandler(myhandler3);
		
		myhandler1.process();
	}
}
