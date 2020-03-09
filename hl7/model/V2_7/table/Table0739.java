package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0739 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0739();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0739(){
		setTableName("Status Patient");
		setOID("");

		putMap("1", "Normal length of stay");
		putMap("2", "Short length of stay");
		putMap("3", "Long length of stay");

	}

}
