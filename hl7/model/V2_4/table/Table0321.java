package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0321 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0321();
		return table;
	}

	public static final String AD = "AD";
	public static final String F = "F";
	public static final String TR = "TR";
	public static final String UD = "UD";

	private Table0321(){
		setTableName("Dispense method");
		setOID("2.16.840.1.113883.12.321");

		putMap("AD", "Automatic Dispensing");
		putMap("F", "Floor Stock");
		putMap("TR", "Traditional");
		putMap("UD", "Unit Dose");

	}

}
