package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0904 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0904();
		return table;
	}

	public static final String BCV = "BCV";
	public static final String CCS = "CCS";
	public static final String VID = "VID";

	private Table0904(){
		setTableName("Security Check Scheme");
		setOID("");

		putMap("BCV", "Bank Card Validation Number");
		putMap("CCS", "Credit Card Security code");
		putMap("VID", "Version ID");

	}

}
