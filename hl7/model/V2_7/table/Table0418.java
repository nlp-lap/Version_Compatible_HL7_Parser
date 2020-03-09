package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0418 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0418();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0418(){
		setTableName("Procedure Priority");
		setOID("");

		putMap("0", "the admitting procedure");
		putMap("1", "the primary procedure");
		putMap("2", "for ranked secondary procedures");

	}

}
