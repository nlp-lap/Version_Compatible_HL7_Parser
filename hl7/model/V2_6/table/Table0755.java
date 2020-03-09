package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0755 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0755();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0755(){
		setTableName("Status Weight At Birth");
		setOID("2.16.840.1.113883.12.755");

		putMap("0", "No weight reported at admission used for grouping");
		putMap("1", "Weight reported at admission used for grouping");
		putMap("2", "Default weight (>2499g) used for grouping");

	}

}
