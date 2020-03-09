package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0147 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0147();
		return table;
	}

	public static final String _2ANC = "2ANC";
	public static final String _2MMD = "2MMD";
	public static final String _3MMD = "3MMD";
	public static final String ANC = "ANC";
	public static final String MMD = "MMD";

	private Table0147(){
		setTableName("POLICY TYPE");
		setOID("2.16.840.1.113883.12.147");

		putMap("2ANC", "Second Ancillary");
		putMap("2MMD", "Second Major Medical");
		putMap("3MMD", "Third Major Medical");
		putMap("ANC", "Ancillary");
		putMap("MMD", "Major Medical");

	}

}
