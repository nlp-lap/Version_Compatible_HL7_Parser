package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0280 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0280();
		return table;
	}

	public static final String A = "A";
	public static final String R = "R";
	public static final String S = "S";

	private Table0280(){
		setTableName("Referral priority");
		setOID("2.16.840.1.113883.12.280");

		putMap("A", "ASAP");
		putMap("R", "Routine");
		putMap("S", "STAT");

	}

}
