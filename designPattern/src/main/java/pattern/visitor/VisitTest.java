package pattern.visitor;

public class VisitTest {
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}
