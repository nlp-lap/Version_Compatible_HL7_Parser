package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0261 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0261();
		return table;
	}

	public static final String EEG = "EEG";
	public static final String EKG = "EKG";
	public static final String INF = "INF";
	public static final String IVP = "IVP";
	public static final String OXY = "OXY";
	public static final String SUC = "SUC";
	public static final String VEN = "VEN";
	public static final String VIT = "VIT";

	private Table0261(){
		setTableName("Location Equipment");
		setOID("2.16.840.1.113883.12.261");

		putMap("EEG", "Electro-Encephalogram");
		putMap("EKG", "Electro-Cardiogram");
		putMap("INF", "Infusion pump");
		putMap("IVP", "IV pump");
		putMap("OXY", "Oxygen");
		putMap("SUC", "Suction");
		putMap("VEN", "Ventilator");
		putMap("VIT", "Vital signs monitor");

	}

}
