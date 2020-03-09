package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0061 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0061();
		return table;
	}

	public static final String ISO = "ISO";
	public static final String M10 = "M10";
	public static final String M11 = "M11";
	public static final String NPI = "NPI";

	private Table0061(){
		setTableName("Check digit scheme");
		setOID("2.16.840.1.113883.12.61");

		putMap("ISO", "ISO 7064: 1983");
		putMap("M10", "Mod 10 algorithm");
		putMap("M11", "Mod 11 algorithm");
		putMap("NPI", "Check digit algorithm in the US National Provider Identifier");

	}

}
