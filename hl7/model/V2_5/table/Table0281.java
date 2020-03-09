package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0281 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0281();
		return table;
	}

	public static final String Hom = "Hom";
	public static final String Lab = "Lab";
	public static final String Med = "Med";
	public static final String Psy = "Psy";
	public static final String Rad = "Rad";
	public static final String Skn = "Skn";

	private Table0281(){
		setTableName("Referral type");
		setOID("2.16.840.1.113883.12.281");

		putMap("Hom", "Home Care");
		putMap("Lab", "Laboratory");
		putMap("Med", "Medical");
		putMap("Psy", "Psychiatric");
		putMap("Rad", "Radiology");
		putMap("Skn", "Skilled Nursing");

	}

}
