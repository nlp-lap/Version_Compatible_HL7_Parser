package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0298 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0298();
		return table;
	}

	public static final String F = "F";
	public static final String P = "P";

	private Table0298(){
		setTableName("CP range type");
		setOID("2.16.840.1.113883.12.298");

		putMap("F", "Flat-rate.  Apply the entire price to this interval, do not pro-rate the price if the full interval has not occurred/been consumed");
		putMap("P", "Pro-rate.  Apply this price to this interval, pro-rated by whatever portion of the interval has occurred/been consumed");

	}

}
