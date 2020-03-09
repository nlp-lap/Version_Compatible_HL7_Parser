package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0008 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0008();
		return table;
	}

	public static final String AA = "AA";
	public static final String AE = "AE";
	public static final String AR = "AR";

	private Table0008(){
		setTableName("ACKNOWLEDGMENT CODE");
		setOID("2.16.840.1.113883.12.8");

		putMap("AA", "Application Accept");
		putMap("AE", "Application Error");
		putMap("AR", "Application Reject");

	}

}
