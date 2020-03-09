package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0384 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0384();
		return table;
	}

	public static final String CO = "CO";
	public static final String DI = "DI";
	public static final String LI = "LI";
	public static final String LW = "LW";
	public static final String MR = "MR";
	public static final String OT = "OT";
	public static final String PT = "PT";
	public static final String PW = "PW";
	public static final String RC = "RC";
	public static final String SC = "SC";
	public static final String SR = "SR";
	public static final String SW = "SW";

	private Table0384(){
		setTableName("Substance type");
		setOID("2.16.840.1.113883.12.384");

		putMap("CO", "Control");
		putMap("DI", "Diluent");
		putMap("LI", "Measurable Liquid Item");
		putMap("LW", "Liquid Waste");
		putMap("MR", "Multiple Test Reagent (consumption cannot be tied to orders for single test)");
		putMap("OT", "Other");
		putMap("PT", "Pretreatment");
		putMap("PW", "Purified Water");
		putMap("RC", "Reagent Calibrator");
		putMap("SC", "Countable Solid Item (e.g., Tip, etc.)");
		putMap("SR", "Single Test Reagent");
		putMap("SW", "Solid Waste");

	}

}
