package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0657 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0657();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0657(){
		setTableName("Device Type");
		setOID("");

		putMap("1", "EO Gas Sterilizer");
		putMap("2", "Steam Sterilizer");
		putMap("3", "Peracetic Acid");

	}

}
