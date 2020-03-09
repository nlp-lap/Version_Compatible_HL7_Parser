package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0388 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0388();
		return table;
	}

	public static final String E = "E";
	public static final String P = "P";

	private Table0388(){
		setTableName("Processing Type");
		setOID("");

		putMap("E", "Evaluation");
		putMap("P", "Regular Production");

	}

}
