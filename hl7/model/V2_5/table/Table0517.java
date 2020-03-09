package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0517 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0517();
		return table;
	}

	public static final String HD = "HD";
	public static final String NPAT = "NPAT";
	public static final String PAT = "PAT";
	public static final String USR = "USR";

	private Table0517(){
		setTableName("Inform person code");
		setOID("2.16.840.1.113883.12.517");

		putMap("HD", "Inform help desk");
		putMap("NPAT", "Do NOT inform patient");
		putMap("PAT", "Inform patient");
		putMap("USR", "Inform User");

	}

}
