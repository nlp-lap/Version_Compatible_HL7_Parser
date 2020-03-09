package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0359 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0359();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0359(){
		setTableName("Diagnosis Priority");
		setOID("");

		putMap("0", "Not included in diagnosis ranking");
		putMap("1", "The primary diagnosis");
		putMap("2", "For ranked secondary diagnoses");

	}

}
