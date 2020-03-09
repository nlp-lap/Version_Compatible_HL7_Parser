package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0105 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0105();
		return table;
	}

	public static final String L = "L";
	public static final String O = "O";
	public static final String P = "P";

	private Table0105(){
		setTableName("Source of Comment");
		setOID("2.16.840.1.113883.12.105");

		putMap("L", "Ancillary (filler) department is source of comment");
		putMap("O", "Other system is source of comment");
		putMap("P", "Orderer (placer) is source of comment");

	}

}
