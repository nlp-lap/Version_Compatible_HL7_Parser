package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0397 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0397();
		return table;
	}

	public static final String A = "A";
	public static final String AN = "AN";
	public static final String D = "D";
	public static final String DN = "DN";
	public static final String N = "N";

	private Table0397(){
		setTableName("Sequencing");
		setOID("2.16.840.1.113883.12.397");

		putMap("A", "Ascending");
		putMap("AN", "Ascending, case insensitive");
		putMap("D", "Descending");
		putMap("DN", "Descending, case insensitive");
		putMap("N", "None");

	}

}
