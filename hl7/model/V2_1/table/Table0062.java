package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0062 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0062();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";

	private Table0062(){
		setTableName("EVENT REASON");
		setOID("2.16.840.1.113883.12.62");

		putMap("01", "Patient Request");
		putMap("02", "Physician Order");

	}

}
