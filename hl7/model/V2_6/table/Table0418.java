package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0418 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0418();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0418(){
		setTableName("Procedure Priority");
		setOID("2.16.840.1.113883.12.418");

		putMap("0", "the admitting procedure");
		putMap("1", "the primary procedure");
		putMap("2", "for ranked secondary procedures");

	}

}
