package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0325 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0325();
		return table;
	}

	public static final String ALI = "ALI";
	public static final String DTY = "DTY";
	public static final String LAB = "LAB";
	public static final String LB2 = "LB2";
	public static final String PAR = "PAR";
	public static final String RX = "RX";
	public static final String RX2 = "RX2";

	private Table0325(){
		setTableName("Location Relationship ID");
		setOID("2.16.840.1.113883.12.325");

		putMap("ALI", "Location alias(es)");
		putMap("DTY", "Nearest Dietary");
		putMap("LAB", "Nearest Lab");
		putMap("LB2", "Second Lab");
		putMap("PAR", "Parent location");
		putMap("RX", "Nearest Pharmacy");
		putMap("RX2", "Second Pharmacy");

	}

}