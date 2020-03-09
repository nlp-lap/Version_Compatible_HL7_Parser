package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0505 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0505();
		return table;
	}

	public static final String SHARP = "#";
	public static final String STAR = "*";

	private Table0505(){
		setTableName("Cyclic Entry/Exit Indicator");
		setOID("2.16.840.1.113883.12.505");

		putMap("#", "The last service request in a cyclic group.");
		putMap("*", "The first service request in a cyclic group");

	}

}
