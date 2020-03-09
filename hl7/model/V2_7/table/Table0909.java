package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0909 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0909();
		return table;
	}

	public static final String SID = "SID";
	public static final String SIDC = "SIDC";
	public static final String SIMM = "SIMM";
	public static final String STBD = "STBD";
	public static final String SWNL = "SWNL";
	public static final String SWTH = "SWTH";

	private Table0909(){
		setTableName("Patient Results Release Categorization Scheme");
		setOID("");

		putMap("SID", "Share In1 Day -<p>Share result regardless of reference/therapeutic range after 1 or more business day as agreed to by the systems in play.");
		putMap("SIDC", "Share in 1 Day Conditionally -<p>Share result in reference ranges/therapeutic with patient after 1 or more business day as agreed to by the systems in play.<p>Withhold result out of reference/therapeutic range until physician release");
		putMap("SIMM", "Share Immediately -<p>Share result with patient immediately");
		putMap("STBD", "Share To Be Determined -<p>Category to be determined");
		putMap("SWNL", "Share Within Normal Limits -<p>Share result in reference/therapeutic range with patient immediately<p>Share result out of reference/therapeutic ranges with patient after 1 or more business day as agreed to by the systems in play.");
		putMap("SWTH", "Share Withhold -<p>Withhold result regardless of reference/therapeutic ranges");

	}

}
