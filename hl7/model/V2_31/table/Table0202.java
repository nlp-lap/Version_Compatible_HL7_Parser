package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0202 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0202();
		return table;
	}

	public static final String BP = "BP";
	public static final String CP = "CP";
	public static final String FX = "FX";
	public static final String Internet = "Internet";
	public static final String MD = "MD";
	public static final String PH = "PH";
	public static final String X_400 = "X.400";

	private Table0202(){
		setTableName("Telecommunication equipment type");
		setOID("2.16.840.1.113883.12.202");

		putMap("BP", "Beeper");
		putMap("CP", "Cellular Phone");
		putMap("FX", "Fax");
		putMap("Internet", "Internet Address: Use Only If Telecommunication Use Code Is NET");
		putMap("MD", "Modem");
		putMap("PH", "Telephone");
		putMap("X.400", "X.400 email address: Use Only If Telecommunication Use Code Is NET");

	}

}
