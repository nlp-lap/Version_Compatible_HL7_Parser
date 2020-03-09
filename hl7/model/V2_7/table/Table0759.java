package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0759 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0759();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0759(){
		setTableName("Status Admission");
		setOID("");

		putMap("0", "Admission status is valid; used for grouping");
		putMap("1", "Admission status is valid; not used for grouping");
		putMap("2", "Admission status is invalid; not used for grouping");
		putMap("3", "Admission status is invalid; default value used for grouping");

	}

}
