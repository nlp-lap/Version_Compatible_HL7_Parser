package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0409 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0409();
		return table;
	}

	public static final String M = "M";
	public static final String SD = "SD";
	public static final String SU = "SU";

	private Table0409(){
		setTableName("Application Change Type");
		setOID("");

		putMap("M", "Migrates to different CPU");
		putMap("SD", "Shut down");
		putMap("SU", "Start up");

	}

}
