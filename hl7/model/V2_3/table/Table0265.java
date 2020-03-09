package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0265 extends Table{
	private static final String VERSION = "2.3";
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
		setOID("2.16.840.1.113883.12.265");

		putMap("ALC", "Allergy");
		putMap("AMB", "Ambulatory");
		putMap("CAN", "Cancer");
		putMap("CAR", "Coronary/Cardiac Care");
		putMap("CCR", "Critical Care");
		putMap("CHI", "Chiropractic");
		putMap("EDI", "Education");
		putMap("EMR", "Emergency");
		putMap("FPC", "Family Planning");
		putMap("INT", "Intensive Care");
		putMap("ISO", "Isolation");
		putMap("NAT", "Naturopathic");
		putMap("NBI", "Newborn, Nursery, Infants");
		putMap("OBG", "Obstetrics, Gynecology");
		putMap("OBS", "Observation");
		putMap("OTH", "Other Specialty");
		putMap("PED", "Pediatrics");
		putMap("PHY", "General/Family Practice");
		putMap("PIN", "Pediatric/Neonatal Intensive Care");
		putMap("PPS", "Pediatric Psychiatric");
		putMap("PRE", "Pediatric Rehabilitation");
		putMap("PSI", "Psychiatric Intensive Care");
		putMap("PSY", "Psychiatric");
		putMap("REH", "Rehabilitation");
		putMap("SUR", "Surgery");
		putMap("WIC", "Walk-In Clinic");

	}

}
