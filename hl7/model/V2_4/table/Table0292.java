package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0292 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0292();
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
	public static final String _100 = "100";
	public static final String _101 = "101";
	public static final String _11 = "11";
	public static final String _12 = "12";
	public static final String _13 = "13";
	public static final String _14 = "14";
	public static final String _15 = "15";
	public static final String _16 = "16";
	public static final String _17 = "17";
	public static final String _18 = "18";
	public static final String _19 = "19";
	public static final String _20 = "20";
	public static final String _21 = "21";
	public static final String _22 = "22";
	public static final String _23 = "23";
	public static final String _24 = "24";
	public static final String _25 = "25";
	public static final String _26 = "26";
	public static final String _27 = "27";
	public static final String _28 = "28";
	public static final String _29 = "29";
	public static final String _30 = "30";
	public static final String _31 = "31";
	public static final String _32 = "32";
	public static final String _33 = "33";
	public static final String _34 = "34";
	public static final String _35 = "35";
	public static final String _36 = "36";
	public static final String _37 = "37";
	public static final String _38 = "38";
	public static final String _39 = "39";
	public static final String _40 = "40";
	public static final String _41 = "41";
	public static final String _42 = "42";
	public static final String _43 = "43";
	public static final String _44 = "44";
	public static final String _45 = "45";
	public static final String _46 = "46";
	public static final String _47 = "47";
	public static final String _48 = "48";
	public static final String _49 = "49";
	public static final String _50 = "50";
	public static final String _51 = "51";
	public static final String _52 = "52";
	public static final String _53 = "53";
	public static final String _54 = "54";
	public static final String _55 = "55";
	public static final String _56 = "56";
	public static final String _57 = "57";
	public static final String _58 = "58";
	public static final String _59 = "59";
	public static final String _60 = "60";
	public static final String _61 = "61";
	public static final String _62 = "62";
	public static final String _63 = "63";
	public static final String _64 = "64";
	public static final String _65 = "65";
	public static final String _66 = "66";
	public static final String _67 = "67";
	public static final String _68 = "68";
	public static final String _69 = "69";
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
	public static final String _81 = "81";
	public static final String _82 = "82";
	public static final String _83 = "83";
	public static final String _84 = "84";
	public static final String _85 = "85";
	public static final String _86 = "86";
	public static final String _87 = "87";
	public static final String _88 = "88";
	public static final String _89 = "89";
	public static final String _90 = "90";
	public static final String _91 = "91";
	public static final String _92 = "92";
	public static final String _93 = "93";
	public static final String _94 = "94";
	public static final String _95 = "95";
	public static final String _96 = "96";
	public static final String _97 = "97";
	public static final String _98 = "98";
	public static final String _99 = "99";
	public static final String _999 = "999";

	private Table0292(){
		setTableName("Vaccines administered (code = CVX)(parenteral, unless oral is noted)");
		setOID("2.16.840.1.113883.12.292");

		putMap("01", "diphtheria, tetanus toxoids and pertussis vaccine");
		putMap("02", "poliovirus vaccine, live, oral");
		putMap("03", "measles, mumps and rubella virus vaccine");
		putMap("04", "measles and rubella virus vaccine");
		putMap("05", "measles virus vaccine");
		putMap("06", "rubella virus vaccine");
		putMap("07", "mumps virus vaccine");
		putMap("08", "hepatitis B vaccine, pediatric or pediatric/adolescent dosage");
		putMap("09", "tetanus and diphtheria toxoids, adsorbed for adult use");
		putMap("10", "poliovirus vaccine, inactivated");
		putMap("100", "pneumococcal conjugate vaccine, polyvalent");
		putMap("101", "Typhoid Vi capsular polysaccharide vaccine");
		putMap("11", "pertussis vaccine");
		putMap("12", "diphtheria antitoxin");
		putMap("13", "tetanus immune globulin");
		putMap("14", "immune globulin, NOS");
		putMap("15", "influenza virus vaccine, split virus (incl. purified surface antigen)");
		putMap("16", "influenza virus vaccine, whole virus");
		putMap("17", "Haemophilus influenzae type b vaccine, conjugate NOS");
		putMap("18", "rabies vaccine, for intramuscular injection");
		putMap("19", "Bacillus Calmette-Guerin vaccine");
		putMap("20", "diphtheria, tetanus toxoids and acellular pertussis vaccine");
		putMap("21", "varicella virus vaccine");
		putMap("22", "DTP-Haemophilus influenzae type b conjugate vaccine");
		putMap("23", "plague vaccine");
		putMap("24", "anthrax vaccine");
		putMap("25", "typhoid vaccine, live, oral");
		putMap("26", "cholera vaccine");
		putMap("27", "botulinum antitoxin");
		putMap("28", "diphtheria and tetanus toxoids, adsorbed for pediatric use");
		putMap("29", "cytomegalovirus immune globulin, intravenous");
		putMap("30", "hepatitis B immune globulin");
		putMap("31", "hepatitis A vaccine, pediatric dosage, NOS");
		putMap("32", "meningococcal polysaccharide vaccine");
		putMap("33", "pneumococcal  polysaccharide vaccine");
		putMap("34", "rabies immune globulin");
		putMap("35", "tetanus toxoid");
		putMap("36", "varicella zoster immune globulin");
		putMap("37", "yellow fever vaccine");
		putMap("38", "rubella and mumps virus vaccine");
		putMap("39", "Japanese encephalitis vaccine");
		putMap("40", "rabies vaccine, for intradermal injection");
		putMap("41", "typhoid vaccine, parenteral, other than acetone-killed, dried");
		putMap("42", "hepatitis B vaccine, adolescent/high risk infant dosage");
		putMap("43", "hepatitis B vaccine, adult dosage");
		putMap("44", "hepatitis B vaccine, dialysis patient dosage");
		putMap("45", "hepatitis B vaccine, NOS");
		putMap("46", "Haemophilus influenzae type b vaccine, PRP-D conjugate");
		putMap("47", "Haemophilus influenzae type b vaccine, HbOC conjugate");
		putMap("48", "Haemophilus influenzae type b vaccine, PRP-T conjugate");
		putMap("49", "Haemophilus influenzae type b vaccine, PRP-OMP conjugate");
		putMap("50", "DTaP-Haemophilus influenzae type b conjugate vaccine");
		putMap("51", "Haemophilus influenzae type b conjugate and Hepatitis B vaccine");
		putMap("52", "hepatitis A vaccine, adult dosage");
		putMap("53", "typhoid vaccine, parenteral, acetone-killed, dried (U.S. military)");
		putMap("54", "adenovirus vaccine, type 4, live, oral");
		putMap("55", "adenovirus vaccine, type 7, live, oral");
		putMap("56", "dengue fever vaccine");
		putMap("57", "hantavirus vaccine");
		putMap("58", "hepatitis C vaccine");
		putMap("59", "hepatitis E vaccine");
		putMap("60", "herpes simplex virus, type 2 vaccine");
		putMap("61", "human immunodeficiency virus vaccine");
		putMap("62", "human papilloma virus vaccine");
		putMap("63", "Junin virus vaccine");
		putMap("64", "leishmaniasis vaccine");
		putMap("65", "leprosy vaccine");
		putMap("66", "Lyme disease vaccine");
		putMap("67", "malaria vaccine");
		putMap("68", "melanoma vaccine");
		putMap("69", "parainfluenza-3 virus vaccine");
		putMap("70", "Q fever vaccine");
		putMap("71", "respiratory syncytial virus immune globulin, intravenous");
		putMap("72", "rheumatic fever vaccine");
		putMap("73", "Rift Valley fever vaccine");
		putMap("74", "rotavirus vaccine, tetravalent, live, oral");
		putMap("75", "smallpox vaccine");
		putMap("76", "Staphylococcus bacteriophage lysate");
		putMap("77", "tick-borne encephalitis vaccine");
		putMap("78", "tularemia vaccine");
		putMap("79", "vaccinia immune globulin");
		putMap("80", "Venezuelan equine encephalitis, live, attenuated");
		putMap("81", "Venezuelan equine encephalitis, inactivated");
		putMap("82", "adenovirus vaccine, NOS");
		putMap("83", "hepatitis A vaccine, pediatric/adolescent dosage, 2 dose schedule");
		putMap("84", "hepatitis A vaccine, pediatric/adolescent dosage, 3 dose schedule");
		putMap("85", "hepatitis A vaccine, NOS");
		putMap("86", "immune globulin, intramuscular");
		putMap("87", "immune globulin, intravenous");
		putMap("88", "influenza virus vaccine, NOS");
		putMap("89", "poliovirus vaccine, NOS");
		putMap("90", "rabies vaccine, NOS");
		putMap("91", "typhoid vaccine, NOS");
		putMap("92", "Venezuelan equine encephalitis vaccine, NOS");
		putMap("93", "respiratory syncytial virus monoclonal antibody (palivizumab), intramuscular");
		putMap("94", "measles, mumps, rubella, and varicella virus vaccine");
		putMap("95", "tuberculin skin test; old tuberculin, multipuncture device");
		putMap("96", "tuberculin skin test; purified protein derivative solution, intradermal");
		putMap("97", "tuberculin skin test; purified protein derivative, multipuncture device");
		putMap("98", "tuberculin skin test; NOS");
		putMap("99", "RESERVED - do not use");
		putMap("999", "unknown vaccine or immune globulin");

	}

}
