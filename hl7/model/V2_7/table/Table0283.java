package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0283 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0283();
		return table;
	}

	public static final String A = "A";
	public static final String E = "E";
	public static final String P = "P";
	public static final String R = "R";

	private Table0283(){
		setTableName("Referral Status");
		setOID("");

		putMap("A", "Accepted");
		putMap("E", "Expired");
		putMap("P", "Pending");
		putMap("R", "Rejected");

	}

}
