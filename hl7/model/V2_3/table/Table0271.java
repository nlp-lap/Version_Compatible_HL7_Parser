package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0271 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0271();
		return table;
	}

	public static final String AU = "AU";
	public static final String CA = "CA";
	public static final String DI = "DI";
	public static final String DO = "DO";
	public static final String IN = "IN";
	public static final String IP = "IP";
	public static final String LA = "LA";
	public static final String PA = "PA";
	public static final String PR = "PR";

	private Table0271(){
		setTableName("Document Completion Status");
		setOID("2.16.840.1.113883.12.271");

		putMap("AU", "Authenticated");
		putMap("CA", "Canceled");
		putMap("DI", "Dictated");
		putMap("DO", "Documented");
		putMap("IN", "Incomplete");
		putMap("IP", "In progress");
		putMap("LA", "Legally authenticated");
		putMap("PA", "Pre-authenticated");
		putMap("PR", "Preliminary");

	}

}
