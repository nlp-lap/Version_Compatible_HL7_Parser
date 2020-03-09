package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0338 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0338();
		return table;
	}

	public static final String CY = "CY";
	public static final String DEA = "DEA";
	public static final String GL = "GL";
	public static final String LandI = "L&I";
	public static final String LI = "LI";
	public static final String MCD = "MCD";
	public static final String MCR = "MCR";
	public static final String QA = "QA";
	public static final String SL = "SL";
	public static final String TAX = "TAX";
	public static final String TRL = "TRL";
	public static final String UPIN = "UPIN";

	private Table0338(){
		setTableName("Practitioner ID Number Type");
		setOID("");

		putMap("CY", "County number");
		putMap("DEA", "Drug Enforcement Agency no.");
		putMap("GL", "General ledger number");
		putMap("L&I", "Labor and industries number");
		putMap("LI", "Labor and industries number");
		putMap("MCD", "Medicaid number");
		putMap("MCR", "Medicare number");
		putMap("QA", "QA number");
		putMap("SL", "State license number");
		putMap("TAX", "Tax ID number");
		putMap("TRL", "Training license number");
		putMap("UPIN", "Unique physician ID no.");

	}

}
