package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0063 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0063();
		return table;
	}

	public static final String ASC = "ASC";
	public static final String BRO = "BRO";
	public static final String CGV = "CGV";
	public static final String CHD = "CHD";
	public static final String DEP = "DEP";
	public static final String DOM = "DOM";
	public static final String EMC = "EMC";
	public static final String EME = "EME";
	public static final String EMR = "EMR";
	public static final String EXF = "EXF";
	public static final String FCH = "FCH";
	public static final String FND = "FND";
	public static final String FTH = "FTH";
	public static final String GCH = "GCH";
	public static final String GRD = "GRD";
	public static final String GRP = "GRP";
	public static final String MGR = "MGR";
	public static final String MTH = "MTH";
	public static final String NCH = "NCH";
	public static final String NON = "NON";
	public static final String OAD = "OAD";
	public static final String OTH = "OTH";
	public static final String OWN = "OWN";
	public static final String PAR = "PAR";
	public static final String SCH = "SCH";
	public static final String SEL = "SEL";
	public static final String SIB = "SIB";
	public static final String SIS = "SIS";
	public static final String SPO = "SPO";
	public static final String TRA = "TRA";
	public static final String UNK = "UNK";
	public static final String WRD = "WRD";

	private Table0063(){
		setTableName("Relationship");
		setOID("2.16.840.1.113883.12.63");

		putMap("ASC", "Associate");
		putMap("BRO", "Brother");
		putMap("CGV", "Care giver");
		putMap("CHD", "Child");
		putMap("DEP", "Handicapped dependent");
		putMap("DOM", "Life partner");
		putMap("EMC", "Emergency contact");
		putMap("EME", "Employee");
		putMap("EMR", "Employer");
		putMap("EXF", "Extended family");
		putMap("FCH", "Foster child");
		putMap("FND", "Friend");
		putMap("FTH", "Father");
		putMap("GCH", "Grandchild");
		putMap("GRD", "Guardian");
		putMap("GRP", "Grandparent");
		putMap("MGR", "Manager");
		putMap("MTH", "Mother");
		putMap("NCH", "Natural child");
		putMap("NON", "None");
		putMap("OAD", "Other adult");
		putMap("OTH", "Other");
		putMap("OWN", "Owner");
		putMap("PAR", "Parent");
		putMap("SCH", "Stepchild");
		putMap("SEL", "Self");
		putMap("SIB", "Sibling");
		putMap("SIS", "Sister");
		putMap("SPO", "Spouse");
		putMap("TRA", "Trainer");
		putMap("UNK", "Unknown");
		putMap("WRD", "Ward of court");

	}

}
