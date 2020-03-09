package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0128 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0128();
		return table;
	}

	public static final String MI = "MI";
	public static final String MO = "MO";
	public static final String SV = "SV";

	private Table0128(){
		setTableName("ALLERGY SEVERITY");
		setOID("2.16.840.1.113883.12.128");

		putMap("MI", "Mild");
		putMap("MO", "Moderate");
		putMap("SV", "Severe");

	}

}
