package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0763 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0763();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0763(){
		setTableName("DRG Procedure Relevance");
		setOID("2.16.840.1.113883.12.763");

		putMap("0", "Neither operation relevant nor non-operation relevant procedure");
		putMap("1", "Operation relevant procedure");
		putMap("2", "Non-operation relevant procedure");

	}

}
