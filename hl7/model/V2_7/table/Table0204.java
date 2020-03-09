package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0204 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0204();
		return table;
	}

	public static final String A = "A";
	public static final String D = "D";
	public static final String L = "L";
	public static final String SL = "SL";

	private Table0204(){
		setTableName("Organizational Name Type");
		setOID("");

		putMap("A", "Alias name");
		putMap("D", "Display name");
		putMap("L", "Legal name");
		putMap("SL", "Stock exchange listing name");

	}

}
