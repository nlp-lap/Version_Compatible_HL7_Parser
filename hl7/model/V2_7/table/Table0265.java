package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0265 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0265();
		return table;
	}

	public static final String ALC = "ALC";
	public static final String AMB = "AMB";
	public static final String CAN = "CAN";
	public static final String CAR = "CAR";
	public static final String CCR = "CCR";
	public static final String CHI = "CHI";
	public static final String EDI = "EDI";
	public static final String EMR = "EMR";
	public static final String FPC = "FPC";
	public static final String INT = "INT";
	public static final String ISO = "ISO";
	public static final String NAT = "NAT";
	public static final String NBI = "NBI";
	public static final String OBG = "OBG";
	public static final String OBS = "OBS";
	public static final String OTH = "OTH";
	public static final String PED = "PED";
	public static final String PHY = "PHY";
	public static final String PIN = "PIN";
	public static final String PPS = "PPS";
	public static final String PRE = "PRE";
	public static final String PSI = "PSI";
	public static final String PSY = "PSY";
	public static final String REH = "REH";
	public static final String SUR = "SUR";
	public static final String WIC = "WIC";

	private Table0265(){
		setTableName("Specialty Type");
		setOID("");

		putMap("ALC", "Allergy");
		putMap("AMB", "Ambulatory");
		putMap("CAN", "Cancer");
		putMap("CAR", "Coronary/cardiac care");
		putMap("CCR", "Critical care");
		putMap("CHI", "Chiropractic");
		putMap("EDI", "Education");
		putMap("EMR", "Emergency");
		putMap("FPC", "Family planning");
		putMap("INT", "Intensive care");
		putMap("ISO", "Isolation");
		putMap("NAT", "Naturopathic");
		putMap("NBI", "Newborn, nursery, infants");
		putMap("OBG", "Obstetrics, gynecology");
		putMap("OBS", "Observation");
		putMap("OTH", "Other specialty");
		putMap("PED", "Pediatrics");
		putMap("PHY", "General/family practice");
		putMap("PIN", "Pediatric/neonatal intensive care");
		putMap("PPS", "Pediatric psychiatric");
		putMap("PRE", "Pediatric rehabilitation");
		putMap("PSI", "Psychiatric intensive care");
		putMap("PSY", "Psychiatric");
		putMap("REH", "Rehabilitation");
		putMap("SUR", "Surgery");
		putMap("WIC", "Walk-in clinic");

	}

}
