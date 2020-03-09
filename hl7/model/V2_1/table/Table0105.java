package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0105 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0105();
		return table;
	}

	public static final String L = "L";
	public static final String P = "P";

	private Table0105(){
		setTableName("SOURCE OF COMMENT");
		setOID("2.16.840.1.113883.12.105");

		putMap("L", "Ancillary department is source of comment");
		putMap("P", "Orderer is source of comment");

	}

}
