package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0456 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0456();
		return table;
	}

	public static final String _260 = "260";
	public static final String _280 = "280";
	public static final String _301 = "301";
	public static final String _991 = "991";
	public static final String _993 = "993";
	public static final String _994 = "994";

	private Table0456(){
		setTableName("Revenue code");
		setOID("2.16.840.1.113883.12.456");

		putMap("260", "IV Therapy");
		putMap("280", "Oncology");
		putMap("301", "Lab/Chemistry");
		putMap("991", "Cafeteria /Guest Tray");
		putMap("993", "Telephone/Telegraph");
		putMap("994", "TV/Radio");

	}

}
