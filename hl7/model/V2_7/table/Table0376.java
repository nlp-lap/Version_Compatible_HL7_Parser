package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0376 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0376();
		return table;
	}

	public static final String AMB = "AMB";
	public static final String C37 = "C37";
	public static final String CAMB = "CAMB";
	public static final String CATM = "CATM";
	public static final String CFRZ = "CFRZ";
	public static final String CREF = "CREF";
	public static final String DFRZ = "DFRZ";
	public static final String DRY = "DRY";
	public static final String FRZ = "FRZ";
	public static final String MTLF = "MTLF";
	public static final String NTR = "NTR";
	public static final String PRTL = "PRTL";
	public static final String PSA = "PSA";
	public static final String PSO = "PSO";
	public static final String REF = "REF";
	public static final String UFRZ = "UFRZ";
	public static final String UPR = "UPR";

	private Table0376(){
		setTableName("Special Handling Code");
		setOID("");

		putMap("AMB", "Ambient temperature");
		putMap("C37", "Body temperature");
		putMap("CAMB", "Critical ambient temperature");
		putMap("CATM", "Protect from air");
		putMap("CFRZ", "Critical frozen temperature");
		putMap("CREF", "Critical refrigerated temperature");
		putMap("DFRZ", "Deep frozen");
		putMap("DRY", "Dry");
		putMap("FRZ", "Frozen temperature");
		putMap("MTLF", "Metal Free");
		putMap("NTR", "Liquid nitrogen");
		putMap("PRTL", "Protect from light");
		putMap("PSA", "Do not shake");
		putMap("PSO", "No shock");
		putMap("REF", "Refrigerated temperature");
		putMap("UFRZ", "Ultra frozen");
		putMap("UPR", "Upright");

	}

}
