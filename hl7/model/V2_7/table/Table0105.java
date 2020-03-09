package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0105 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0105();
		return table;
	}

	public static final String L = "L";
	public static final String O = "O";
	public static final String P = "P";

	private Table0105(){
		setTableName("Source of Comment");
		setOID("");

		putMap("L", "Ancillary (filler) department is source of comment");
		putMap("O", "Other system is source of comment");
		putMap("P", "Orderer (placer) is source of comment");

	}

}
