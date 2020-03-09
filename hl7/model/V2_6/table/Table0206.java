package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0206 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0206();
		return table;
	}

	public static final String A = "A";
	public static final String D = "D";
	public static final String U = "U";
	public static final String X = "X";

	private Table0206(){
		setTableName("Segment action code");
		setOID("2.16.840.1.113883.12.206");

		putMap("A", "Add/Insert");
		putMap("D", "Delete");
		putMap("U", "Update");
		putMap("X", "No Change");

	}

}
