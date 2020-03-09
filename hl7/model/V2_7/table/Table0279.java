package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0279 extends Table{
	private static final String VERSION = "2.7";
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
		setOID("");

		putMap("Confirm", "Contact the Placer Contact Person prior to making any substitutions of this resource");
		putMap("No", "Substitution of this resource is not allowed");
		putMap("Notify", "Notify the Placer Contact Person, through normal institutional procedures, that a substitution of this resource has been made");
		putMap("Yes", "Substitution of this resource is allowed");

	}

}
