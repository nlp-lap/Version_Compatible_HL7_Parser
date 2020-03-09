package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0477 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0477();
		return table;
	}

	public static final String I = "I";
	public static final String II = "II";
	public static final String III = "III";
	public static final String IV = "IV";
	public static final String V = "V";
	public static final String VI = "VI";

	private Table0477(){
		setTableName("Controlled Substance Schedule*");
		setOID("2.16.840.1.113883.12.477");

		putMap("I", "Schedule I");
		putMap("II", "Schedule II");
		putMap("III", "Schedule III");
		putMap("IV", "Schedule IV");
		putMap("V", "Schedule V");
		putMap("VI", "Schedule VI");

	}

}
