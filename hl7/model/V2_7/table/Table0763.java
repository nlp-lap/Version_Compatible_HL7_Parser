package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0763 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0763();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0763(){
		setTableName("DRG Procedure Relevance");
		setOID("");

		putMap("0", "Neither operation relevant nor non-operation relevant procedure");
		putMap("1", "Operation relevant procedure");
		putMap("2", "Non-operation relevant procedure");

	}

}
