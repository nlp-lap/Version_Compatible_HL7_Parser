package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0905 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0905();
		return table;
	}

	public static final String INV = "INV";
	public static final String ONH = "ONH";
	public static final String PRC = "PRC";
	public static final String REJ = "REJ";
	public static final String TRN = "TRN";
	public static final String TTL = "TTL";

	private Table0905(){
		setTableName("Shipment Status");
		setOID("");

		putMap("INV", "Inventoried");
		putMap("ONH", "On Hold");
		putMap("PRC", "Processing");
		putMap("REJ", "Rejected");
		putMap("TRN", "In Transit");
		putMap("TTL", "Triaged to Lab");

	}

}
