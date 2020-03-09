package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0140 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0140();
		return table;
	}

	public static final String NATO = "NATO";
	public static final String NOAA = "NOAA";
	public static final String USA = "USA";
	public static final String USAF = "USAF";
	public static final String USCG = "USCG";
	public static final String USMC = "USMC";
	public static final String USN = "USN";
	public static final String USPHS = "USPHS";

	private Table0140(){
		setTableName("Military service");
		setOID("2.16.840.1.113883.12.140");

		putMap("NATO", "North Atlantic Treaty Organization");
		putMap("NOAA", "National Oceanic and Atmospheric Administration");
		putMap("USA", "U.S. Army");
		putMap("USAF", "U.S. Air Force");
		putMap("USCG", "U.S. Coast Guard");
		putMap("USMC", "U.S. Marines");
		putMap("USN", "U.S. Navy");
		putMap("USPHS", "U.S. Public Health Service");

	}

}
