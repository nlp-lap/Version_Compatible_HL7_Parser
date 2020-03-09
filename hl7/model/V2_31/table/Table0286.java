package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0286 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0286();
		return table;
	}

	public static final String CP = "CP";
	public static final String PP = "PP";
	public static final String RP = "RP";
	public static final String RT = "RT";

	private Table0286(){
		setTableName("Provider role");
		setOID("2.16.840.1.113883.12.286");

		putMap("CP", "Consulting Provider");
		putMap("PP", "Primary Care Provider");
		putMap("RP", "Referring Provider");
		putMap("RT", "Referred to Provider");

	}

}
