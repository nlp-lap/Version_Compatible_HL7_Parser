package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0083 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0083();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";

	private Table0083(){
		setTableName("Outlier Type");
		setOID("2.16.840.1.113883.12.83");

		putMap("C", "Outlier cost");
		putMap("D", "Outlier days");

	}

}
