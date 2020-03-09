package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0431 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0431();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String K = "K";
	public static final String M = "M";
	public static final String O = "O";
	public static final String T = "T";
	public static final String U = "U";

	private Table0431(){
		setTableName("Recreational Drug Use Code");
		setOID("2.16.840.1.113883.12.431");

		putMap("A", "Alcohol");
		putMap("C", "Tobacco - chewed");
		putMap("K", "Kava");
		putMap("M", "Marijuana");
		putMap("O", "Other");
		putMap("T", "Tobacco - smoked");
		putMap("U", "Unknown");

	}

}
