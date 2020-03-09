package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0116 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0116();
		return table;
	}

	public static final String C = "C";
	public static final String H = "H";
	public static final String O = "O";

	private Table0116(){
		setTableName("BED STATUS");
		setOID("2.16.840.1.113883.12.116");

		putMap("C", "Closed");
		putMap("H", "Housekeeping");
		putMap("O", "Occupied");

	}

}
