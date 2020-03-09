package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0279 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0279();
		return table;
	}

	public static final String Confirm = "Confirm";
	public static final String No = "No";
	public static final String Notify = "Notify";
	public static final String Yes = "Yes";

	private Table0279(){
		setTableName("Allow Substitution Codes");
		setOID("2.16.840.1.113883.12.279");

		putMap("Confirm", "Contact the Placer Contact Person prior to making any substitutions of this resource");
		putMap("No", "Substitution of this resource is not allowed");
		putMap("Notify", "Notify the Placer Contact Person, through normal institutional procedures, that a substitution of this resource has been made");
		putMap("Yes", "Substitution of this resource is allowed");

	}

}
