package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0259 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0259();
		return table;
	}

	public static final String AS = "AS";
	public static final String BS = "BS";
	public static final String CD = "CD";
	public static final String CP = "CP";
	public static final String CR = "CR";
	public static final String CS = "CS";
	public static final String CT = "CT";
	public static final String DD = "DD";
	public static final String DG = "DG";
	public static final String DM = "DM";
	public static final String EC = "EC";
	public static final String ES = "ES";
	public static final String FA = "FA";
	public static final String FS = "FS";
	public static final String LP = "LP";
	public static final String LS = "LS";
	public static final String MA = "MA";
	public static final String MS = "MS";
	public static final String NM = "NM";
	public static final String OT = "OT";
	public static final String PT = "PT";
	public static final String RF = "RF";
	public static final String ST = "ST";
	public static final String TG = "TG";
	public static final String US = "US";
	public static final String XA = "XA";

	private Table0259(){
		setTableName("Modality");
		setOID("2.16.840.1.113883.12.259");

		putMap("AS", "Angioscopy");
		putMap("BS", "Biomagnetic imaging");
		putMap("CD", "Color Flow Doppler");
		putMap("CP", "Colposcopy");
		putMap("CR", "Computed Radiography");
		putMap("CS", "Cystoscopy");
		putMap("CT", "Computed Tomography");
		putMap("DD", "Duplex Doppler");
		putMap("DG", "Diapanography");
		putMap("DM", "Digital microscopy");
		putMap("EC", "Echocardiography");
		putMap("ES", "Endoscopy");
		putMap("FA", "Fluorescein Angiography");
		putMap("FS", "Fundoscopy");
		putMap("LP", "Laparoscopy");
		putMap("LS", "Laser surface scan");
		putMap("MA", "Magnetic Resonance Angiography");
		putMap("MS", "Magnetic Resonance Spectroscopy");
		putMap("NM", "Nuclear medicine (radioisotope study)");
		putMap("OT", "Other");
		putMap("PT", "Positron Emission Tomography (PET)");
		putMap("RF", "RadioFluoroscopy");
		putMap("ST", "Single Photon Emission Computed Tomography (SPECT)");
		putMap("TG", "Thermography");
		putMap("US", "Ultrasound");
		putMap("XA", "X-Ray Angiography");

	}

}
