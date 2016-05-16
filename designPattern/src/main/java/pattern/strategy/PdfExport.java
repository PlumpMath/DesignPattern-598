package pattern.strategy;

public class PdfExport implements Export {

	@Override
	public void export() {
		System.out.println("Exporting PDF.");
	}

}
