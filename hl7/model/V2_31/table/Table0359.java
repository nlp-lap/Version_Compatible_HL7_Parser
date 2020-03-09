package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0359 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0359();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2_and_higher = "2 and higher";

	private Table0359(){
		setTableName("Diagnosis priority");
		setOID("2.16.840.1.113883.12.359");

		putMap("0", "not included in diagnosis ranking");
		putMap("1", "the primary diagnosis");
		putMap("2 and higher", "for ranked secondary diagnoses");

	}

}
