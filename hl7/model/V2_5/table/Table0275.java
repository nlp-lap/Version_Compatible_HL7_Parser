package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0275 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0275();
		return table;
	}

	public static final String AA = "AA";
	public static final String AC = "AC";
	public static final String AR = "AR";
	public static final String PU = "PU";

	private Table0275(){
		setTableName("Document Storage Status");
		setOID("2.16.840.1.113883.12.275");

		putMap("AA", "Active and archived");
		putMap("AC", "Active");
		putMap("AR", "Archived (not active)");
		putMap("PU", "Purged");

	}

}
