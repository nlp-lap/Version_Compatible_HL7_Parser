package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0053 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0053();
		return table;
	}

	public static final String I9 = "I9";

	private Table0053(){
		setTableName("DIAGNOSIS CODING METHOD");
		setOID("2.16.840.1.113883.12.53");

		putMap("I9", "ICD9");

	}

}
