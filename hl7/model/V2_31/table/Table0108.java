package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0108 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0108();
		return table;
	}

	public static final String O = "O";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";

	private Table0108(){
		setTableName("Query results level");
		setOID("2.16.840.1.113883.12.108");

		putMap("O", "Order plus order status");
		putMap("R", "Results without bulk text");
		putMap("S", "Status only");
		putMap("T", "Full results");

	}

}
