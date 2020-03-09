package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0140 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0140();
		return table;
	}

	public static final String AUSA = "AUSA";
	public static final String AUSAF = "AUSAF";
	public static final String AUSN = "AUSN";
	public static final String NATO = "NATO";
	public static final String NOAA = "NOAA";
	public static final String USA = "USA";
	public static final String USAF = "USAF";
	public static final String USCG = "USCG";
	public static final String USMC = "USMC";
	public static final String USN = "USN";
	public static final String USPHS = "USPHS";

	private Table0140(){
		setTableName("Military Service");
		setOID("");

		putMap("AUSA", "Australian Army");
		putMap("AUSAF", "Australian Air Force");
		putMap("AUSN", "Australian Navy");
		putMap("NATO", "North Atlantic Treaty Organization");
		putMap("NOAA", "National Oceanic and Atmospheric Administration");
		putMap("USA", "US Army");
		putMap("USAF", "US Air Force");
		putMap("USCG", "US Coast Guard");
		putMap("USMC", "US Marine Corps");
		putMap("USN", "US Navy");
		putMap("USPHS", "US Public Health Service");

	}

}
