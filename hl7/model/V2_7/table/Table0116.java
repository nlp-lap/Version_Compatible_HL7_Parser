package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0116 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0116();
		return table;
	}

	public static final String C = "C";
	public static final String H = "H";
	public static final String I = "I";
	public static final String K = "K";
	public static final String O = "O";
	public static final String U = "U";

	private Table0116(){
		setTableName("Bed Status");
		setOID("");

		putMap("C", "Closed");
		putMap("H", "Housekeeping");
		putMap("I", "Isolated");
		putMap("K", "Contaminated");
		putMap("O", "Occupied");
		putMap("U", "Unoccupied");

	}

}
