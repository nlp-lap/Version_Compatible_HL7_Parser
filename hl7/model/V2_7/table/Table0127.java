package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0127 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0127();
		return table;
	}

	public static final String AA = "AA";
	public static final String DA = "DA";
	public static final String EA = "EA";
	public static final String FA = "FA";
	public static final String LA = "LA";
	public static final String MA = "MA";
	public static final String MC = "MC";
	public static final String PA = "PA";

	private Table0127(){
		setTableName("Allergen Type");
		setOID("");

		putMap("AA", "Animal Allergy");
		putMap("DA", "Drug allergy");
		putMap("EA", "Environmental Allergy");
		putMap("FA", "Food allergy");
		putMap("LA", "Pollen Allergy");
		putMap("MA", "Miscellaneous allergy");
		putMap("MC", "Miscellaneous contraindication");
		putMap("PA", "Plant Allergy");

	}

}
