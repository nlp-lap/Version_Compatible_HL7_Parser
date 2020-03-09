package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0178 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0178();
		return table;
	}

	public static final String REP = "REP";
	public static final String UPD = "UPD";

	private Table0178(){
		setTableName("FILE-LEVEL EVENT CODE");
		setOID("2.16.840.1.113883.12.178");

		putMap("REP", "Replace current version of this master file with the version contained in this message");
		putMap("UPD", "Change file records as defined in the record level event codes for each record that follows");

	}

}
