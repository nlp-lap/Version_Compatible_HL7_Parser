package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0207 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0207();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";
	public static final String Not_present = "Not present";
	public static final String R = "R";
	public static final String T = "T";

	private Table0207(){
		setTableName("Processing mode");
		setOID("2.16.840.1.113883.12.207");

		putMap("A", "Archive");
		putMap("I", "Initial load");
		putMap("Not present", "Not present (the default, meaning current  processing)");
		putMap("R", "Restore from archive");
		putMap("T", "Current processing, transmitted at intervals (scheduled or on demand)");

	}

}
