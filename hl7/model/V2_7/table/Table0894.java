package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0894 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0894();
		return table;
	}

	public static final String L = "L";
	public static final String R = "R";

	private Table0894(){
		setTableName("Side of body");
		setOID("");

		putMap("L", "Left");
		putMap("R", "Right");

	}

}
