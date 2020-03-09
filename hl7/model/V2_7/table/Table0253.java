package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0253 extends Table{
	private static final String VERSION = "2.7";
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
		setTableName("Indirect Exposure Mechanism");
		setOID("");

		putMap("B", "Breast milk");
		putMap("F", "Father");
		putMap("O", "Other");
		putMap("P", "Transplacental");
		putMap("X", "Blood product");

	}

}
