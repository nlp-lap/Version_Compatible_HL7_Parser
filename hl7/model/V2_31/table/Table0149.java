package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0149 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0149();
		return table;
	}

	public static final String AP = "AP";
	public static final String DE = "DE";
	public static final String PE = "PE";

	private Table0149(){
		setTableName("Day type");
		setOID("2.16.840.1.113883.12.149");

		putMap("AP", "Approved");
		putMap("DE", "Denied");
		putMap("PE", "Pending");

	}

}
