package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0253 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0253();
		return table;
	}

	public static final String B = "B";
	public static final String F = "F";
	public static final String O = "O";
	public static final String P = "P";
	public static final String X = "X";

	private Table0253(){
		setTableName("Indirect exposure mechanism");
		setOID("2.16.840.1.113883.12.253");

		putMap("B", "Breast milk");
		putMap("F", "Father");
		putMap("O", "Other");
		putMap("P", "Transplacental");
		putMap("X", "Blood product");

	}

}
