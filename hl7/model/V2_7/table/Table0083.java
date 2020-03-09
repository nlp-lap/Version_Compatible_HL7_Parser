package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0083 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0083();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";

	private Table0083(){
		setTableName("Outlier Type");
		setOID("");

		putMap("C", "Outlier cost");
		putMap("D", "Outlier days");

	}

}
