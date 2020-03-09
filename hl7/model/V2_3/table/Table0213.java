package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0213 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0213();
		return table;
	}

	public static final String D = "D";
	public static final String I = "I";
	public static final String P = "P";

	private Table0213(){
		setTableName("Purge Status");
		setOID("2.16.840.1.113883.12.213");

		putMap("D", "The visit is marked for deletion and the user cannot enter new data against it");
		putMap("I", "The visit is marked inactive and the user cannot enter new data against it");
		putMap("P", "Marked for purge.  User is no longer able to update the visit.");

	}

}
