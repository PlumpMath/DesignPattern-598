package pattern.strategy;

public class Exporter {
	private Export export = new HtmlExport();
	
	public void doExport() {
		export.export();
	}

	public Export getExport() {
		return export;
	}

	public void setExport(Export export) {
		this.export = export;
	}
}
