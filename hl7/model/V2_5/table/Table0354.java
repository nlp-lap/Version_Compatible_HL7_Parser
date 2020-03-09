package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0354 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0354();
		return table;
	}

	public static final String ACK = "ACK";
	public static final String ADR_A19 = "ADR_A19";
	public static final String ADT_A01 = "ADT_A01";
	public static final String ADT_A02 = "ADT_A02";
	public static final String ADT_A03 = "ADT_A03";
	public static final String ADT_A05 = "ADT_A05";
	public static final String ADT_A06 = "ADT_A06";
	public static final String ADT_A09 = "ADT_A09";
	public static final String ADT_A15 = "ADT_A15";
	public static final String ADT_A16 = "ADT_A16";
	public static final String ADT_A17 = "ADT_A17";
	public static final String ADT_A18 = "ADT_A18";
	public static final String ADT_A20 = "ADT_A20";
	public static final String ADT_A21 = "ADT_A21";
	public static final String ADT_A24 = "ADT_A24";
	public static final String ADT_A30 = "ADT_A30";
	public static final String ADT_A37 = "ADT_A37";
	public static final String ADT_A38 = "ADT_A38";
	public static final String ADT_A39 = "ADT_A39";
	public static final String ADT_A43 = "ADT_A43";
	public static final String ADT_A45 = "ADT_A45";
	public static final String ADT_A50 = "ADT_A50";
	public static final String ADT_A52 = "ADT_A52";
	public static final String ADT_A54 = "ADT_A54";
	public static final String ADT_A60 = "ADT_A60";
	public static final String ADT_A61 = "ADT_A61";
	public static final String BAR_P01 = "BAR_P01";
	public static final String BAR_P02 = "BAR_P02";
	public static final String BAR_P05 = "BAR_P05";
	public static final String BAR_P06 = "BAR_P06";
	public static final String BAR_P10 = "BAR_P10";
	public static final String BAR_P12 = "BAR_P12";
	public static final String BPS_O29 = "BPS_O29";
	public static final String BRP_030 = "BRP_030";
	public static final String BRT_O32 = "BRT_O32";
	public static final String BTS_O31 = "BTS_O31";
	public static final String CRM_C01 = "CRM_C01";
	public static final String CSU_C09 = "CSU_C09";
	public static final String DFT_P03 = "DFT_P03";
	public static final String DFT_P11 = "DFT_P11";
	public static final String DOC_T12 = "DOC_T12";
	public static final String DSR_P04 = "DSR_P04";
	public static final String DSR_Q01 = "DSR_Q01";
	public static final String DSR_Q03 = "DSR_Q03";
	public static final String EAC_U07 = "EAC_U07";
	public static final String EAN_U09 = "EAN_U09";
	public static final String EAR_U08 = "EAR_U08";
	public static final String EDR_R07 = "EDR_R07";
	public static final String EQQ_Q04 = "EQQ_Q04";
	public static final String ERP_R09 = "ERP_R09";
	public static final String ESR_U02 = "ESR_U02";
	public static final String ESU_U01 = "ESU_U01";
	public static final String INR_U06 = "INR_U06";
	public static final String INU_U05 = "INU_U05";
	public static final String LSU_U12 = "LSU_U12";
	public static final String MDM_T01 = "MDM_T01";
	public static final String MDM_T02 = "MDM_T02";
	public static final String MFD_MFA = "MFD_MFA";
	public static final String MFK_M01 = "MFK_M01";
	public static final String MFN_M01 = "MFN_M01";
	public static final String MFN_M02 = "MFN_M02";
	public static final String MFN_M03 = "MFN_M03";
	public static final String MFN_M04 = "MFN_M04";
	public static final String MFN_M05 = "MFN_M05";
	public static final String MFN_M06 = "MFN_M06";
	public static final String MFN_M07 = "MFN_M07";
	public static final String MFN_M08 = "MFN_M08";
	public static final String MFN_M09 = "MFN_M09";
	public static final String MFN_M10 = "MFN_M10";
	public static final String MFN_M11 = "MFN_M11";
	public static final String MFN_M12 = "MFN_M12";
	public static final String MFN_M13 = "MFN_M13";
	public static final String MFN_M15 = "MFN_M15";
	public static final String MFQ_M01 = "MFQ_M01";
	public static final String MFR_M01 = "MFR_M01";
	public static final String NMD_N02 = "NMD_N02";
	public static final String NMQ_N01 = "NMQ_N01";
	public static final String NMR_N01 = "NMR_N01";
	public static final String OMB_O27 = "OMB_O27";
	public static final String OMD_O03 = "OMD_O03";
	public static final String OMG_O19 = "OMG_O19";
	public static final String OMI_O23 = "OMI_O23";
	public static final String OML_O21 = "OML_O21";
	public static final String OML_O33 = "OML_O33";
	public static final String OML_O35 = "OML_O35";
	public static final String OMN_O07 = "OMN_O07";
	public static final String OMP_O09 = "OMP_O09";
	public static final String OMS_O05 = "OMS_O05";
	public static final String ORB_O28 = "ORB_O28";
	public static final String ORD_O04 = "ORD_O04";
	public static final String ORF_R04 = "ORF_R04";
	public static final String ORG_O20 = "ORG_O20";
	public static final String ORI_O24 = "ORI_O24";
	public static final String ORL_O22 = "ORL_O22";
	public static final String ORL_O34 = "ORL_O34";
	public static final String ORL_O36 = "ORL_O36";
	public static final String ORM_O01 = "ORM_O01";
	public static final String ORN_O08 = "ORN_O08";
	public static final String ORP_O10 = "ORP_O10";
	public static final String ORR_O02 = "ORR_O02";
	public static final String ORS_O06 = "ORS_O06";
	public static final String ORU_R01 = "ORU_R01";
	public static final String ORU_R30 = "ORU_R30";
	public static final String ORU_R31 = "ORU_R31";
	public static final String ORU_R32 = "ORU_R32";
	public static final String ORU_W01 = "ORU_W01";
	public static final String OSQ_Q06 = "OSQ_Q06";
	public static final String OSR_Q06 = "OSR_Q06";
	public static final String OUL_R21 = "OUL_R21";
	public static final String OUL_R22 = "OUL_R22";
	public static final String OUL_R23 = "OUL_R23";
	public static final String OUL_R24 = "OUL_R24";
	public static final String PEX_P07 = "PEX_P07";
	public static final String PGL_PC6 = "PGL_PC6";
	public static final String PMU_B01 = "PMU_B01";
	public static final String PMU_B03 = "PMU_B03";
	public static final String PMU_B04 = "PMU_B04";
	public static final String PMU_B07 = "PMU_B07";
	public static final String PMU_B08 = "PMU_B08";
	public static final String PPG_PCG = "PPG_PCG";
	public static final String PPP_PCB = "PPP_PCB";
	public static final String PPR_PC1 = "PPR_PC1";
	public static final String PPT_PCL = "PPT_PCL";
	public static final String PPV_PCA = "PPV_PCA";
	public static final String PRR_PC5 = "PRR_PC5";
	public static final String PTR_PCF = "PTR_PCF";
	public static final String QBP_Q11 = "QBP_Q11";
	public static final String QBP_Q13 = "QBP_Q13";
	public static final String QBP_Q15 = "QBP_Q15";
	public static final String QBP_Q21 = "QBP_Q21";
	public static final String QCK_Q02 = "QCK_Q02";
	public static final String QCN_J01 = "QCN_J01";
	public static final String QRF_W02 = "QRF_W02";
	public static final String QRY_A19 = "QRY_A19";
	public static final String QRY_P04 = "QRY_P04";
	public static final String QRY_PC4 = "QRY_PC4";
	public static final String QRY_Q01 = "QRY_Q01";
	public static final String QRY_Q02 = "QRY_Q02";
	public static final String QRY_R02 = "QRY_R02";
	public static final String QRY_T12 = "QRY_T12";
	public static final String QSB_Q16 = "QSB_Q16";
	public static final String QVR_Q17 = "QVR_Q17";
	public static final String RAR_RAR = "RAR_RAR";
	public static final String RAS_O17 = "RAS_O17";
	public static final String RCI_I05 = "RCI_I05";
	public static final String RCL_I06 = "RCL_I06";
	public static final String RDE_O01 = "RDE_O01";
	public static final String RDE_O11 = "RDE_O11";
	public static final String RDR_RDR = "RDR_RDR";
	public static final String RDS_O13 = "RDS_O13";
	public static final String RDY_K15 = "RDY_K15";
	public static final String REF_I12 = "REF_I12";
	public static final String RER_RER = "RER_RER";
	public static final String RGR_RGR = "RGR_RGR";
	public static final String RGV_O15 = "RGV_O15";
	public static final String ROR_ROR = "ROR_ROR";
	public static final String RPA_I08 = "RPA_I08";
	public static final String RPI_I01 = "RPI_I01";
	public static final String RPL_I02 = "RPL_I02";
	public static final String RPR_I03 = "RPR_I03";
	public static final String RQA_I08 = "RQA_I08";
	public static final String RQC_I05 = "RQC_I05";
	public static final String RQI_I01 = "RQI_I01";
	public static final String RQP_I04 = "RQP_I04";
	public static final String RQQ_Q09 = "RQQ_Q09";
	public static final String RRA_O02 = "RRA_O02";
	public static final String RRA_O18 = "RRA_O18";
	public static final String RRD_O14 = "RRD_O14";
	public static final String RRE_O12 = "RRE_O12";
	public static final String RRG_O16 = "RRG_O16";
	public static final String RRI_I12 = "RRI_I12";
	public static final String RSP_K11 = "RSP_K11";
	public static final String RSP_K21 = "RSP_K21";
	public static final String RSP_K22 = "RSP_K22";
	public static final String RSP_K23 = "RSP_K23";
	public static final String RTB_K13 = "RTB_K13";
	public static final String SIU_S12 = "SIU_S12";
	public static final String SPQ_Q08 = "SPQ_Q08";
	public static final String SQM_S25 = "SQM_S25";
	public static final String SQR_S25 = "SQR_S25";
	public static final String SRM_S01 = "SRM_S01";
	public static final String SRR_S01 = "SRR_S01";
	public static final String SSR_U04 = "SSR_U04";
	public static final String SSU_U03 = "SSU_U03";
	public static final String SUR_P09 = "SUR_P09";
	public static final String TBR_R08 = "TBR_R08";
	public static final String TBR_R09 = "TBR_R09";
	public static final String TCU_U10 = "TCU_U10";
	public static final String UDM_Q05 = "UDM_Q05";
	public static final String VQQ_Q07 = "VQQ_Q07";
	public static final String VXQ_V01 = "VXQ_V01";
	public static final String VXR_V03 = "VXR_V03";
	public static final String VXU_V04 = "VXU_V04";
	public static final String VXX_V02 = "VXX_V02";

	private Table0354(){
		setTableName("Message structure");
		setOID("2.16.840.1.113883.12.354");

		putMap("ACK", "Varies");
		putMap("ADR_A19", "A19");
		putMap("ADT_A01", "A01, A04, A08, A13");
		putMap("ADT_A02", "A02");
		putMap("ADT_A03", "A03");
		putMap("ADT_A05", "A05, A14, A28, A31");
		putMap("ADT_A06", "A06, A07");
		putMap("ADT_A09", "A09, A10, A11, A12");
		putMap("ADT_A15", "A15");
		putMap("ADT_A16", "A16");
		putMap("ADT_A17", "A17");
		putMap("ADT_A18", "A18");
		putMap("ADT_A20", "A20");
		putMap("ADT_A21", "A21, A22, A23, A25, A26, A27, A29, A32, A33");
		putMap("ADT_A24", "A24");
		putMap("ADT_A30", "A30, A34, A35, A36, A46, A47, A48, A49");
		putMap("ADT_A37", "A37");
		putMap("ADT_A38", "A38");
		putMap("ADT_A39", "A39, A40, A41, A42");
		putMap("ADT_A43", "A43, A44");
		putMap("ADT_A45", "A45");
		putMap("ADT_A50", "A50, A51");
		putMap("ADT_A52", "A52, A53, A55");
		putMap("ADT_A54", "A54");
		putMap("ADT_A60", "A60");
		putMap("ADT_A61", "A61, A62");
		putMap("BAR_P01", "P01");
		putMap("BAR_P02", "P02");
		putMap("BAR_P05", "P05");
		putMap("BAR_P06", "P06");
		putMap("BAR_P10", "P10");
		putMap("BAR_P12", "P12");
		putMap("BPS_O29", "O29");
		putMap("BRP_030", "O30");
		putMap("BRT_O32", "O32");
		putMap("BTS_O31", "O31");
		putMap("CRM_C01", "C01, C02, C03, C04, C05, C06, C07, C08");
		putMap("CSU_C09", "C09, C10, C11, C12");
		putMap("DFT_P03", "P03");
		putMap("DFT_P11", "P11");
		putMap("DOC_T12", "T12");
		putMap("DSR_P04", "P04");
		putMap("DSR_Q01", "Q01");
		putMap("DSR_Q03", "Q03");
		putMap("EAC_U07", "U07");
		putMap("EAN_U09", "U09");
		putMap("EAR_U08", "U08");
		putMap("EDR_R07", "R07");
		putMap("EQQ_Q04", "Q04");
		putMap("ERP_R09", "R09");
		putMap("ESR_U02", "U02");
		putMap("ESU_U01", "U01");
		putMap("INR_U06", "U06");
		putMap("INU_U05", "U05");
		putMap("LSU_U12", "U12, U13");
		putMap("MDM_T01", "T01, T03, T05, T07, T09, T11");
		putMap("MDM_T02", "T02, T04, T06, T08, T10");
		putMap("MFD_MFA", "MFA");
		putMap("MFK_M01", "M01, M02, M03, M04, M05, M06, M07, M08, M09, M10, M11");
		putMap("MFN_M01", "M01");
		putMap("MFN_M02", "M02");
		putMap("MFN_M03", "M03");
		putMap("MFN_M04", "M04");
		putMap("MFN_M05", "M05");
		putMap("MFN_M06", "M06");
		putMap("MFN_M07", "M07");
		putMap("MFN_M08", "M08");
		putMap("MFN_M09", "M09");
		putMap("MFN_M10", "M10");
		putMap("MFN_M11", "M11");
		putMap("MFN_M12", "M12");
		putMap("MFN_M13", "M13");
		putMap("MFN_M15", "M15");
		putMap("MFQ_M01", "M01, M02, M03, M04, M05, M06");
		putMap("MFR_M01", "M01, M02, M03, M04, M05, M06");
		putMap("NMD_N02", "N02");
		putMap("NMQ_N01", "N01");
		putMap("NMR_N01", "N01");
		putMap("OMB_O27", "O27");
		putMap("OMD_O03", "O03");
		putMap("OMG_O19", "O19");
		putMap("OMI_O23", "O23");
		putMap("OML_O21", "O21");
		putMap("OML_O33", "O33");
		putMap("OML_O35", "O35");
		putMap("OMN_O07", "007");
		putMap("OMP_O09", "O09");
		putMap("OMS_O05", "O05");
		putMap("ORB_O28", "O28");
		putMap("ORD_O04", "O04");
		putMap("ORF_R04", "R04");
		putMap("ORG_O20", "O20");
		putMap("ORI_O24", "O24");
		putMap("ORL_O22", "022");
		putMap("ORL_O34", "O34");
		putMap("ORL_O36", "O36");
		putMap("ORM_O01", "O01");
		putMap("ORN_O08", "O08");
		putMap("ORP_O10", "O10");
		putMap("ORR_O02", "O02");
		putMap("ORS_O06", "O06");
		putMap("ORU_R01", "R01");
		putMap("ORU_R30", "R30");
		putMap("ORU_R31", "R31");
		putMap("ORU_R32", "R32");
		putMap("ORU_W01", "W01");
		putMap("OSQ_Q06", "Q06");
		putMap("OSR_Q06", "Q06");
		putMap("OUL_R21", "R21");
		putMap("OUL_R22", "R22");
		putMap("OUL_R23", "R23");
		putMap("OUL_R24", "R24");
		putMap("PEX_P07", "P07, P08");
		putMap("PGL_PC6", "PC6, PC7, PC8");
		putMap("PMU_B01", "B01, B02");
		putMap("PMU_B03", "B03");
		putMap("PMU_B04", "B04, B05, B06");
		putMap("PMU_B07", "B07");
		putMap("PMU_B08", "B08");
		putMap("PPG_PCG", "PCC, PCG, PCH, PCJ");
		putMap("PPP_PCB", "PCB, PCD");
		putMap("PPR_PC1", "PC1, PC2, PC3");
		putMap("PPT_PCL", "PCL");
		putMap("PPV_PCA", "PCA");
		putMap("PRR_PC5", "PC5");
		putMap("PTR_PCF", "PCF");
		putMap("QBP_Q11", "Q11");
		putMap("QBP_Q13", "Q13");
		putMap("QBP_Q15", "Q15");
		putMap("QBP_Q21", "Q21, Q22, Q23,Q24, Q25");
		putMap("QCK_Q02", "Q02");
		putMap("QCN_J01", "J01, J02");
		putMap("QRF_W02", "W02");
		putMap("QRY_A19", "A19");
		putMap("QRY_P04", "P04");
		putMap("QRY_PC4", "PC4, PC9, PCE, PCK");
		putMap("QRY_Q01", "Q01, Q26, Q27, Q28, Q29, Q30");
		putMap("QRY_Q02", "Q02");
		putMap("QRY_R02", "R02");
		putMap("QRY_T12", "T12");
		putMap("QSB_Q16", "Q16");
		putMap("QVR_Q17", "Q17");
		putMap("RAR_RAR", "RAR");
		putMap("RAS_O17", "O17");
		putMap("RCI_I05", "I05");
		putMap("RCL_I06", "I06");
		putMap("RDE_O01", "O01");
		putMap("RDE_O11", "O11, O25");
		putMap("RDR_RDR", "RDR");
		putMap("RDS_O13", "O13");
		putMap("RDY_K15", "K15");
		putMap("REF_I12", "I12, I13, I14, I15");
		putMap("RER_RER", "RER");
		putMap("RGR_RGR", "RGR");
		putMap("RGV_O15", "O15");
		putMap("ROR_ROR", "ROR");
		putMap("RPA_I08", "I08, I09. I10, I11");
		putMap("RPI_I01", "I01, I04");
		putMap("RPL_I02", "I02");
		putMap("RPR_I03", "I03");
		putMap("RQA_I08", "I08, I09, I10, I11");
		putMap("RQC_I05", "I05, I06");
		putMap("RQI_I01", "I01, I02, I03, I07");
		putMap("RQP_I04", "I04");
		putMap("RQQ_Q09", "Q09");
		putMap("RRA_O02", "O02");
		putMap("RRA_O18", "O18");
		putMap("RRD_O14", "O14");
		putMap("RRE_O12", "O12, O26");
		putMap("RRG_O16", "O16");
		putMap("RRI_I12", "I12, I13, I14, I15");
		putMap("RSP_K11", "K11");
		putMap("RSP_K21", "K21");
		putMap("RSP_K22", "K22");
		putMap("RSP_K23", "K23, K24");
		putMap("RTB_K13", "K13");
		putMap("SIU_S12", "S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, S23, S24, S26");
		putMap("SPQ_Q08", "Q08");
		putMap("SQM_S25", "S25");
		putMap("SQR_S25", "S25");
		putMap("SRM_S01", "S01, S02, S03, S04, S05, S06, S07, S08, S09, S10, S11");
		putMap("SRR_S01", "S01, S02, S03, S04, S05, S06, S07, S08, S09, S10, S11");
		putMap("SSR_U04", "U04");
		putMap("SSU_U03", "U03");
		putMap("SUR_P09", "P09");
		putMap("TBR_R08", "R08");
		putMap("TBR_R09", "R09");
		putMap("TCU_U10", "U10, U11");
		putMap("UDM_Q05", "Q05");
		putMap("VQQ_Q07", "Q07");
		putMap("VXQ_V01", "V01");
		putMap("VXR_V03", "V03");
		putMap("VXU_V04", "V04");
		putMap("VXX_V02", "V02");

	}

}
