package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0127 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0127();
		return table;
	}

	public static final String DA = "DA";
	public static final String FA = "FA";
	public static final String MA = "MA";
	public static final String MC = "MC";

	private Table0127(){
		setTableName("ALLERGY TYPE");
		setOID("2.16.840.1.113883.12.127");

		putMap("DA", "Drug Allergy");
		putMap("FA", "Food Allergy");
		putMap("MA", "Miscellaneous Allergy");
		putMap("MC", "Miscellaneous Contraindication");

	}

}
