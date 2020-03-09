package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0141 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0141();
		return table;
	}

	public static final String E1____E9 = "E1... E9";
	public static final String O1_____O9 = "O1 ... O9";
	public static final String W1_____W4 = "W1 ... W4";

	private Table0141(){
		setTableName("Military Rank/Grade");
		setOID("");

		putMap("E1... E9", "Enlisted");
		putMap("O1 ... O9", "Officers");
		putMap("W1 ... W4", "Warrant Officers");

	}

}
