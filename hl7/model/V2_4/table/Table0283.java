package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0283 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0283();
		return table;
	}

	public static final String A = "A";
	public static final String E = "E";
	public static final String P = "P";
	public static final String R = "R";

	private Table0283(){
		setTableName("Referral status");
		setOID("2.16.840.1.113883.12.283");

		putMap("A", "Accepted");
		putMap("E", "Expired");
		putMap("P", "Pending");
		putMap("R", "Rejected");

	}

}
