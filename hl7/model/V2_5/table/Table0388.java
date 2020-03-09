package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0388 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0388();
		return table;
	}

	public static final String E = "E";
	public static final String P = "P";

	private Table0388(){
		setTableName("Processing type");
		setOID("2.16.840.1.113883.12.388");

		putMap("E", "Evaluation");
		putMap("P", "Regular Production");

	}

}
