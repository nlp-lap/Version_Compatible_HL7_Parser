package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0142 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0142();
		return table;
	}

	public static final String ACT = "ACT";
	public static final String DEC = "DEC";
	public static final String RET = "RET";

	private Table0142(){
		setTableName("Military Status");
		setOID("2.16.840.1.113883.12.142");

		putMap("ACT", "Active duty");
		putMap("DEC", "Deceased");
		putMap("RET", "Retired");

	}

}
