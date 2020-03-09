package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0043 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0043();
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
	public static final String _12_____16 = "12 ... 16";
	public static final String _18 = "18";
	public static final String _19 = "19";
	public static final String _20 = "20";
	public static final String _21 = "21";
	public static final String _26 = "26";
	public static final String _27 = "27";
	public static final String _28 = "28";
	public static final String _29 = "29";
	public static final String _31 = "31";
	public static final String _32 = "32";
	public static final String _33 = "33";
	public static final String _34 = "34";
	public static final String _36 = "36";
	public static final String _37 = "37";
	public static final String _38 = "38";
	public static final String _39 = "39";
	public static final String _40 = "40";
	public static final String _41 = "41";
	public static final String _46 = "46";
	public static final String _48 = "48";
	public static final String _55 = "55";
	public static final String _56 = "56";
	public static final String _57 = "57";
	public static final String _60 = "60";
	public static final String _61 = "61";
	public static final String _62 = "62";
	public static final String _66 = "66";
	public static final String _67 = "67";
	public static final String _68 = "68";
	public static final String _70 = "70";
	public static final String _71 = "71";
	public static final String _72 = "72";
	public static final String _73 = "73";
	public static final String _74 = "74";
	public static final String _75 = "75";
	public static final String _76 = "76";
	public static final String _77 = "77";
	public static final String _78 = "78";
	public static final String _79 = "79";
	public static final String _80 = "80";

	private Table0043(){
		setTableName("Condition code");
		setOID("2.16.840.1.113883.12.43");

		putMap("01", "Military service related");
		putMap("02", "Condition is employment related");
		putMap("03", "Patient covered by insurance not reflected here");
		putMap("04", "HMO enrollee");
		putMap("05", "Lien has been filed");
		putMap("06", "ESRD patient in first 18 months of entitlement covered by employer group health insurance");
		putMap("07", "Treatment of non-terminal condition for hospice patient");
		putMap("08", "Beneficiary would not provide information concerning other insurance coverage");
		putMap("09", "Neither patient nor spouse is employed");
		putMap("10", "Patient and/or spouse is employed but no EGHP exists");
		putMap("11", "Disabled beneficiary but no LGHP");
		putMap("12 ... 16", "Payer codes.");
		putMap("18", "Maiden name retained");
		putMap("19", "Child retains mother¡¯s name");
		putMap("20", "Beneficiary requested billing");
		putMap("21", "Billing for Denial Notice");
		putMap("26", "VA eligible patient chooses to receive services in a medicare certified facility");
		putMap("27", "Patient referred to a sole community hospital for a diagnostic laboratory test");
		putMap("28", "Patient and/or spouse¡¯s EGHP is secondary to Medicare");
		putMap("29", "Disabled beneficiary and/or family member¡¯s LGHP is secondary to Medicare");
		putMap("31", "Patient is student (full time-day)");
		putMap("32", "Patient is student (cooperative/work study program)");
		putMap("33", "Patient is student (full time-night)");
		putMap("34", "Patient is student (Part time)");
		putMap("36", "General care patient in a special unit");
		putMap("37", "Ward accommodation as patient request");
		putMap("38", "Semi-private room not available");
		putMap("39", "Private room medically necessary");
		putMap("40", "Same day transfer");
		putMap("41", "Partial hospitalization");
		putMap("46", "Non-availability statement on file");
		putMap("48", "Psychiatric residential treatment centers for children and adolescents");
		putMap("55", "SNF bed not available");
		putMap("56", "Medical appropriateness");
		putMap("57", "SNF readmission");
		putMap("60", "Day outlier");
		putMap("61", "Cost outlier");
		putMap("62", "Payer code");
		putMap("66", "Provider does not wish cost outlier payment");
		putMap("67", "Beneficiary elects not to use life time reserve (LTR) days");
		putMap("68", "Beneficiary elects to use life time reserve (LTR) days");
		putMap("70", "Self-administered EPO");
		putMap("71", "Full care in unit");
		putMap("72", "Self-care in unit");
		putMap("73", "Self-care training");
		putMap("74", "Home");
		putMap("75", "Home - 100% reimbursement");
		putMap("76", "Back-up in facility dialysis");
		putMap("77", "Provider accepts or is obligated/required due to a contractual arrangement or law to accept payment by a primary payer as payment in full");
		putMap("78", "New coverage not implemented by HMO");
		putMap("79", "Corf services provided off-site");
		putMap("80", "Pregnant");

	}

}
