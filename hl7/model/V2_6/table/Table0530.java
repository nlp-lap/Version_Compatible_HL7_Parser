package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0530 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0530();
		return table;
	}

	public static final String AE = "AE";
	public static final String DEA = "DEA";
	public static final String DOD = "DOD";
	public static final String MC = "MC";
	public static final String VA = "VA";
	public static final String VI = "VI";

	private Table0530(){
		setTableName("Organization, agency, department");
		setOID("2.16.840.1.113883.12.530");

		putMap("AE", "American Express");
		putMap("DEA", "Drug Enforcement Agency");
		putMap("DOD", "Department of Defense");
		putMap("MC", "Master Card");
		putMap("VA", "Veterans Affairs");
		putMap("VI", "Visa");

	}

}
