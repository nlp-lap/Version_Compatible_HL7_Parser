package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0435 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0435();
		return table;
	}

	public static final String DNR = "DNR";
	public static final String N = "N";

	private Table0435(){
		setTableName("Advance Directive Code");
		setOID("");

		putMap("DNR", "Do not resuscitate");
		putMap("N", "No directive");

	}

}
