package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0279 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0279();
		return table;
	}

	public static final String CONFIRM = "CONFIRM";
	public static final String NO = "NO";
	public static final String NOTIFY = "NOTIFY";
	public static final String YES = "YES";

	private Table0279(){
		setTableName("Allow Substitution Codes");
		setOID("2.16.840.1.113883.12.279");

		putMap("CONFIRM", "Contact the Placer Contact Person prior to making any substitutions of this resource");
		putMap("NO", "Substitution of this resource is not allowed");
		putMap("NOTIFY", "Notify the Placer Contact Person, through normal institutional procedures, that a substitution of this resource has been made");
		putMap("YES", "Substitution of this resource is allowed");

	}

}
