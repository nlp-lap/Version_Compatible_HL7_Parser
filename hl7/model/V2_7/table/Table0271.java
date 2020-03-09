package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0271 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0271();
		return table;
	}

	public static final String AU = "AU";
	public static final String DI = "DI";
	public static final String DO = "DO";
	public static final String IN = "IN";
	public static final String IP = "IP";
	public static final String LA = "LA";
	public static final String PA = "PA";

	private Table0271(){
		setTableName("Document Completion Status");
		setOID("");

		putMap("AU", "Authenticated");
		putMap("DI", "Dictated");
		putMap("DO", "Documented");
		putMap("IN", "Incomplete");
		putMap("IP", "In Progress");
		putMap("LA", "Legally authenticated");
		putMap("PA", "Pre-authenticated");

	}

}
