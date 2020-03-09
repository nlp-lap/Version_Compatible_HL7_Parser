package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0347 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0347();
		return table;
	}

	public static final String AB = "AB";
	public static final String MI = "MI";

	private Table0347(){
		setTableName("State/province");
		setOID("2.16.840.1.113883.12.347");

		putMap("AB", "Alberta  (US and Canada)");
		putMap("MI", "Michigan  (US)");

	}

}
