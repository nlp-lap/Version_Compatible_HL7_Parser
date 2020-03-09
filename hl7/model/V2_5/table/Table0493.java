package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0493 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0493();
		return table;
	}

	public static final String AUT = "AUT";
	public static final String CLOT = "CLOT";
	public static final String CON = "CON";
	public static final String COOL = "COOL";
	public static final String FROZ = "FROZ";
	public static final String HEM = "HEM";
	public static final String LIVE = "LIVE";
	public static final String ROOM = "ROOM";
	public static final String SNR = "SNR";

	private Table0493(){
		setTableName("Specimen Condition");
		setOID("2.16.840.1.113883.12.493");

		putMap("AUT", "Autolyzed");
		putMap("CLOT", "Clotted");
		putMap("CON", "Contaminated");
		putMap("COOL", "Cool");
		putMap("FROZ", "Frozen");
		putMap("HEM", "Hemolyzed");
		putMap("LIVE", "Live");
		putMap("ROOM", "Room temperature");
		putMap("SNR", "Sample not received");

	}

}
