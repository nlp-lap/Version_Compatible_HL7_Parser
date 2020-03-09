package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0894 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0894();
		return table;
	}

	public static final String L = "L";
	public static final String R = "R";

	private Table0894(){
		setTableName("Side of body");
		setOID("2.16.840.1.113883.12.894");

		putMap("L", "Left");
		putMap("R", "Right");

	}

}
