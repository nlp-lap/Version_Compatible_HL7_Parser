package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0653 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0653();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _6 = "6";

	private Table0653(){
		setTableName("Date Format");
		setOID("2.16.840.1.113883.12.653");

		putMap("1", "mm/dd/yy");
		putMap("2", "yy.mm.dd");
		putMap("3", "dd/mm/yy");
		putMap("4", "dd.mm.yy");
		putMap("5", "yy/mm/dd");
		putMap("6", "Yymmdd");

	}

}
