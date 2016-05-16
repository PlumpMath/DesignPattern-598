package pattern.strategy;

public class HtmlExport implements Export {

	@Override
	public void export() {
		System.out.println("Exporting HTML.");
	}

}
