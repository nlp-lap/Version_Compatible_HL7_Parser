package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0436 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0436();
		return table;
	}

	public static final String AD = "AD";
	public static final String AL = "AL";
	public static final String CT = "CT";
	public static final String IN = "IN";

	private Table0436(){
		setTableName("Sensitivity to Causative Agent Code");
		setOID("2.16.840.1.113883.12.436");

		putMap("AD", "Adverse Reaction (Not otherwise classified)");
		putMap("AL", "Allergy");
		putMap("CT", "Contraindication");
		putMap("IN", "Intolerance");

	}

}
