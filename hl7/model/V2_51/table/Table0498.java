package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0498 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0498();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String L = "L";
	public static final String P = "P";
	public static final String R = "R";
	public static final String X = "X";

	private Table0498(){
		setTableName("Consent Status");
		setOID("2.16.840.1.113883.12.498");

		putMap("A", "Active - Consent has been granted");
		putMap("B", "Bypassed (Consent not sought)");
		putMap("L", "Limited - Consent has been granted with limitations");
		putMap("P", "Pending - Consent has not yet been sought");
		putMap("R", "Refused - Consent has been refused");
		putMap("X", "Rescinded - Consent was initially granted, but was subsequently revoked or ended.");

	}

}
