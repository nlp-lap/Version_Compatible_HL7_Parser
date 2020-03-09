package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0538 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0538();
		return table;
	}

	public static final String CON = "CON";
	public static final String CST = "CST";
	public static final String EMP = "EMP";
	public static final String VOL = "VOL";

	private Table0538(){
		setTableName("Institution Relationship Type");
		setOID("2.16.840.1.113883.12.538");

		putMap("CON", "Contractor");
		putMap("CST", "Consultant");
		putMap("EMP", "Employee");
		putMap("VOL", "Volunteer");

	}

}
