package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0158 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0158();
		return table;
	}

	public static final String _1ST = "1ST";
	public static final String ALL = "ALL";
	public static final String LST = "LST";
	public static final String REV = "REV";

	private Table0158(){
		setTableName("Date/time selection qualifier");
		setOID("2.16.840.1.113883.12.158");

		putMap("1ST", "First value within range");
		putMap("ALL", "All values within the range");
		putMap("LST", "Last value within the range");
		putMap("REV", "All values within the range returned in reverse chronological order (This is the default if not otherwise specified.)");

	}

}
