package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0494 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0494();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String M = "M";

	private Table0494(){
		setTableName("Specimen Child Role");
		setOID("2.16.840.1.113883.12.494");

		putMap("A", "Aliquot");
		putMap("C", "Component");
		putMap("M", "Modified from original specimen");

	}

}
