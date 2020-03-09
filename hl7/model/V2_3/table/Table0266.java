package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0266 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0266();
		return table;
	}

	public static final String E = "E";
	public static final String F = "F";
	public static final String M = "M";

	private Table0266(){
		setTableName("Gender Indicator");
		setOID("2.16.840.1.113883.12.266");

		putMap("E", "Either Male Or Female Patients");
		putMap("F", "Only Female Patients");
		putMap("M", "Only Male Patients");

	}

}
