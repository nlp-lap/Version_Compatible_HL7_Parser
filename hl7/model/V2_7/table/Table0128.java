package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0128 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0128();
		return table;
	}

	public static final String MI = "MI";
	public static final String MO = "MO";
	public static final String SV = "SV";
	public static final String U = "U";

	private Table0128(){
		setTableName("Allergy Severity");
		setOID("");

		putMap("MI", "Mild");
		putMap("MO", "Moderate");
		putMap("SV", "Severe");
		putMap("U", "Unknown");

	}

}
