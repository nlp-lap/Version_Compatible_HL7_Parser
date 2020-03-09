package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0561 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0561();
		return table;
	}

	public static final String CLCTR = "CLCTR";
	public static final String DGAPP = "DGAPP";
	public static final String DTCTR = "DTCTR";
	public static final String ENC = "ENC";
	public static final String GFTH = "GFTH";
	public static final String OOP = "OOP";
	public static final String SEQ = "SEQ";

	private Table0561(){
		setTableName("Product/Services Clarification Codes");
		setOID("");

		putMap("CLCTR", "Claim Center");
		putMap("DGAPP", "Diagnostic Approval Number");
		putMap("DTCTR", "Data Center Number");
		putMap("ENC", "Encounter Number");
		putMap("GFTH", "Good Faith Indicator");
		putMap("OOP", "Out of Province Indicator");
		putMap("SEQ", "Sequence Number");

	}

}
