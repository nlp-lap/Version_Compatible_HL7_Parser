package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0224 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0224();
		return table;
	}

	public static final String A = "A";
	public static final String N = "N";
	public static final String U = "U";

	private Table0224(){
		setTableName("Transport arranged");
		setOID("2.16.840.1.113883.12.224");

		putMap("A", "Arranged");
		putMap("N", "Not Arranged");
		putMap("U", "Unknown");

	}

}
