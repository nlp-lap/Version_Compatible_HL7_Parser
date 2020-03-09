package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0728 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0728();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";

	private Table0728(){
		setTableName("CCL Value");
		setOID("2.16.840.1.113883.12.728");

		putMap("0", "Nothing obvious");
		putMap("1", "Low");
		putMap("2", "Moderate");
		putMap("3", "High");
		putMap("4", "Very high");

	}

}
