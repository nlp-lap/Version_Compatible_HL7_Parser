package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0062 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0062();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";

	private Table0062(){
		setTableName("EVENT REASON");
		setOID("2.16.840.1.113883.12.62");

		putMap("01", "Patient request");
		putMap("02", "Physician order");
		putMap("03", "Census management");

	}

}
