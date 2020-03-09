package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0409 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0409();
		return table;
	}

	public static final String M = "M";
	public static final String SD = "SD";
	public static final String SU = "SU";

	private Table0409(){
		setTableName("Application change type");
		setOID("2.16.840.1.113883.12.409");

		putMap("M", "Migrates to different CPU");
		putMap("SD", "Shut down");
		putMap("SU", "Start up");

	}

}
