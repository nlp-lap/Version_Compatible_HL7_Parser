package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0355 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0355();
		return table;
	}

	public static final String CE = "CE";
	public static final String CWE = "CWE";
	public static final String PL = "PL";

	private Table0355(){
		setTableName("Primary key value type");
		setOID("2.16.840.1.113883.12.355");

		putMap("CE", "Coded element");
		putMap("CWE", "Coded with Exceptions");
		putMap("PL", "Person location");

	}

}
