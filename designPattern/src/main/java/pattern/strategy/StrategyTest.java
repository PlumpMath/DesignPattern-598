package pattern.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Export export = new PdfExport();
		Exporter exporter = new Exporter();
		exporter.setExport(export);
		
		exporter.doExport();
	}
}
