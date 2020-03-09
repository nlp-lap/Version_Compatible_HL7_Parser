package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0435 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0435();
		return table;
	}

	public static final String DNR = "DNR";

	private Table0435(){
		setTableName("Advance directive code");
		setOID("2.16.840.1.113883.12.435");

		putMap("DNR", "Do not resuscitate");

	}

}
