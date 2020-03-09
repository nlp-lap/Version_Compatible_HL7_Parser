package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0344 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0344();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";
	public static final String _04 = "04";
	public static final String _05 = "05";
	public static final String _06 = "06";
	public static final String _07 = "07";
	public static final String _08 = "08";
	public static final String _09 = "09";
	public static final String _10 = "10";
	public static final String _11 = "11";
	public static final String _12 = "12";
	public static final String _13 = "13";
	public static final String _14 = "14";
	public static final String _15 = "15";
	public static final String _16 = "16";
	public static final String _17 = "17";
	public static final String _18 = "18";
	public static final String _19 = "19";

	private Table0344(){
		setTableName("Patient's Relationship to Insured");
		setOID("");

		putMap("01", "Patient is insured");
		putMap("02", "Spouse");
		putMap("03", "Natural child/insured financial responsibility");
		putMap("04", "Natural child/Insured does not have financial responsibility");
		putMap("05", "Step child");
		putMap("06", "Foster child");
		putMap("07", "Ward of the court");
		putMap("08", "Employee");
		putMap("09", "Unknown");
		putMap("10", "Handicapped dependent");
		putMap("11", "Organ donor");
		putMap("12", "Cadaver donor");
		putMap("13", "Grandchild");
		putMap("14", "Niece/nephew");
		putMap("15", "Injured plaintiff");
		putMap("16", "Sponsored dependent");
		putMap("17", "Minor dependent of a minor dependent");
		putMap("18", "Parent");
		putMap("19", "Grandparent");

	}

}
