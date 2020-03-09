package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0274 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0274();
		return table;
	}

	public static final String IN = "IN";
	public static final String RP = "RP";

	private Table0274(){
		setTableName("Document Modification Status");
		setOID("2.16.840.1.113883.12.274");

		putMap("IN", "Incremental");
		putMap("RP", "Replacement");

	}

}
