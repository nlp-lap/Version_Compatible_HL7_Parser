package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0027 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0027();
		return table;
	}

	public static final String A = "A";
	public static final String S = "S";
	public static final String T = "T";

	private Table0027(){
		setTableName("PRIORITY (COMPONENT 6 QTY/TIMING[735])");
		setOID("2.16.840.1.113883.12.27");

		putMap("A", "ASAP. Fill after STAT orders.");
		putMap("S", "Stat. Required immediately.");
		putMap("T", "Timed collection");

	}

}
