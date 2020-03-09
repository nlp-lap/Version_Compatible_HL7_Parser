package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0173 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0173();
		return table;
	}

	public static final String CO = "CO";
	public static final String IN = "IN";

	private Table0173(){
		setTableName("Coordination of Benefits");
		setOID("2.16.840.1.113883.12.173");

		putMap("CO", "Coordination");
		putMap("IN", "Independent");

	}

}
