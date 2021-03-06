package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0391 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0391();
		return table;
	}

	public static final String ADMINISTRATION = "ADMINISTRATION";
	public static final String ALLERGY = "ALLERGY";
	public static final String APP_STATS = "APP_STATS";
	public static final String APP_STATUS = "APP_STATUS";
	public static final String ASSOCIATED_PERSON = "ASSOCIATED_PERSON";
	public static final String ASSOCIATED_RX_ADMIN = "ASSOCIATED_RX_ADMIN";
	public static final String ASSOCIATED_RX_ORDER = "ASSOCIATED_RX_ORDER";
	public static final String AUTHORIZATION = "AUTHORIZATION";
	public static final String AUTHORIZATION_CONTACT = "AUTHORIZATION_CONTACT";
	public static final String CERTIFICATE = "CERTIFICATE";
	public static final String CLOCK = "CLOCK";
	public static final String CLOCK_AND_STATISTICS = "CLOCK_AND_STATISTICS";
	public static final String CLOCK_AND_STATS_WITH_NOTE = "CLOCK_AND_STATS_WITH_NOTE";
	public static final String COMMAND = "COMMAND";
	public static final String COMMAND_RESPONSE = "COMMAND_RESPONSE";
	public static final String COMMON_ORDER = "COMMON_ORDER";
	public static final String COMPONENT = "COMPONENT";
	public static final String COMPONENTS = "COMPONENTS";
	public static final String CONTAINER = "CONTAINER";
	public static final String DEFINITION = "DEFINITION";
	public static final String DIET = "DIET";
	public static final String DISPENSE = "DISPENSE";
	public static final String ENCODED_ORDER = "ENCODED ORDER";
	public static final String ENCODING = "ENCODING";
	public static final String EXPERIENCE = "EXPERIENCE";
	public static final String FINANCIAL = "FINANCIAL";
	public static final String FINANCIAL_COMMON_ORDER = "FINANCIAL_COMMON ORDER";
	public static final String FINANCIAL_INSURANCE = "FINANCIAL_INSURANCE";
	public static final String FINANCIAL_OBSERVATION = "FINANCIAL_OBSERVATION";
	public static final String FINANCIAL_ORDER = "FINANCIAL_ORDER";
	public static final String FINANCIAL_PROCEDURE = "FINANCIAL_PROCEDURE";
	public static final String FINANCIAL_TIMING_QUANTITY = "FINANCIAL_TIMING QUANTITY";
	public static final String GENERAL_RESOURCE = "GENERAL RESOURCE";
	public static final String GIVE = "GIVE";
	public static final String GOAL = "GOAL";
	public static final String GOAL_OBSERVATION = "GOAL_OBSERVATION";
	public static final String GOAL_PATHWAY = "GOAL_PATHWAY";
	public static final String GOAL_ROLE = "GOAL_ROLE";
	public static final String GUARANTOR_INSURANCE = "GUARANTOR_INSURANCE";
	public static final String INSURANCE = "INSURANCE";
	public static final String LOCATION_RESOURCE = "LOCATION RESOURCE";
	public static final String MERGE_INFO = "MERGE_INFO";
	public static final String MF = "MF";
	public static final String MF_CDM = "MF_CDM";
	public static final String MF_CLIN_STUDY = "MF_CLIN_STUDY";
	public static final String MF_CLIN_STUDY_SCHED = "MF_CLIN_STUDY_SCHED";
	public static final String MF_INV_ITEM = "MF_INV_ITEM";
	public static final String MF_LOC_DEPT = "MF_LOC_DEPT";
	public static final String MF_LOCATION = "MF_LOCATION";
	public static final String MF_OBS_ATTRIBUTES = "MF_OBS_ATTRIBUTES";
	public static final String MF_PHASE_SCHED_DETAIL = "MF_PHASE_SCHED_DETAIL";
	public static final String MF_QUERY = "MF_QUERY";
	public static final String MF_SITE_DEFINED = "MF_SITE_DEFINED";
	public static final String MF_STAFF = "MF_STAFF";
	public static final String MF_TEST = "MF_TEST";
	public static final String MF_TEST_BATT_DETAIL = "MF_TEST_BATT_DETAIL";
	public static final String MF_TEST_BATTERIES = "MF_TEST_BATTERIES";
	public static final String MF_TEST_CALC_DETAIL = "MF_TEST_CALC_DETAIL";
	public static final String MF_TEST_CALCULATED = "MF_TEST_CALCULATED";
	public static final String MF_TEST_CAT_DETAIL = "MF_TEST_CAT_DETAIL";
	public static final String MF_TEST_CATEGORICAL = "MF_TEST_CATEGORICAL";
	public static final String MF_TEST_NUMERIC = "MF_TEST_NUMERIC";
	public static final String NK1_TIMING_QTY = "NK1_TIMING_QTY";
	public static final String NOTIFICATION = "NOTIFICATION";
	public static final String OBSERVATION = "OBSERVATION";
	public static final String OBSERVATION_PRIOR = "OBSERVATION_PRIOR";
	public static final String OBSERVATION_REQUEST = "OBSERVATION_REQUEST";
	public static final String OMSERVATION = "OMSERVATION";
	public static final String ORDER = "ORDER";
	public static final String ORDER_CHOICE = "ORDER_CHOICE";
	public static final String ORDER_DETAIL = "ORDER_DETAIL";
	public static final String ORDER_DETAIL_SUPPLEMENT = "ORDER_DETAIL_SUPPLEMENT";
	public static final String ORDER_DIET = "ORDER_DIET";
	public static final String ORDER_ENCODED = "ORDER_ENCODED";
	public static final String ORDER_OBSERVATION = "ORDER_OBSERVATION";
	public static final String ORDER_PRIOR = "ORDER_PRIOR";
	public static final String ORDER_TRAY = "ORDER_TRAY";
	public static final String PATHWAY = "PATHWAY";
	public static final String PATHWAY_ROLE = "PATHWAY_ROLE";
	public static final String PATIENT = "PATIENT";
	public static final String PATIENT_VISIT = "PATIENT VISIT";
	public static final String PATIENT_PRIOR = "PATIENT_PRIOR";
	public static final String PATIENT_RESULT = "PATIENT_RESULT";
	public static final String PATIENT_VISIT_PRIOR = "PATIENT_VISIT_PRIOR";
	public static final String PERSONNEL_RESOURCE = "PERSONNEL RESOURCE";
	public static final String PEX_CAUSE = "PEX_CAUSE";
	public static final String PEX_OBSERVATION = "PEX_OBSERVATION";
	public static final String PRIOR_RESULT = "PRIOR_RESULT";
	public static final String PROBLEM = "PROBLEM";
	public static final String PROBLEM_OBSERVATION = "PROBLEM_OBSERVATION";
	public static final String PROBLEM_PATHWAY = "PROBLEM_PATHWAY";
	public static final String PROBLEM_ROLE = "PROBLEM_ROLE";
	public static final String PROCEDURE = "PROCEDURE";
	public static final String PRODUCT = "PRODUCT";
	public static final String PRODUCT_STATUS = "PRODUCT_STATUS";
	public static final String PROVIDER = "PROVIDER";
	public static final String PROVIDER_CONTACT = "PROVIDER_CONTACT";
	public static final String QBP = "QBP";
	public static final String QRY_WITH_DETAIL = "QRY_WITH_DETAIL";
	public static final String QUERY_RESPONSE = "QUERY_RESPONSE";
	public static final String QUERY_RESULT_CLUSTER = "QUERY_RESULT_CLUSTER";
	public static final String REQUEST = "REQUEST";
	public static final String RESOURCE = "RESOURCE";
	public static final String RESOURCES = "RESOURCES";
	public static final String RESPONSE = "RESPONSE";
	public static final String RESULT = "RESULT";
	public static final String RESULTS = "RESULTS";
	public static final String RESULTS_NOTES = "RESULTS_NOTES";
	public static final String ROW_DEFINITION = "ROW_DEFINITION";
	public static final String RX_ADMINISTRATION = "RX_ADMINISTRATION";
	public static final String RX_ORDER = "RX_ORDER";
	public static final String SCHEDULE = "SCHEDULE";
	public static final String SERVICE = "SERVICE";
	public static final String SPECIMEN = "SPECIMEN";
	public static final String SPECIMEN_CONTAINER = "SPECIMEN_CONTAINER";
	public static final String STAFF = "STAFF";
	public static final String STUDY = "STUDY";
	public static final String STUDY_OBSERVATION = "STUDY_OBSERVATION";
	public static final String STUDY_PHASE = "STUDY_PHASE";
	public static final String STUDY_SCHEDULE = "STUDY_SCHEDULE";
	public static final String TEST_CONFIGURATION = "TEST_CONFIGURATION";
	public static final String TIMING = "TIMING";
	public static final String TIMING_DIET = "TIMING_DIET";
	public static final String TIMING_ENCODED = "TIMING_ENCODED";
	public static final String TIMING_GIVE = "TIMING_GIVE";
	public static final String TIMING_PRIOR = "TIMING_PRIOR";
	public static final String TIMING_QTY = "TIMING_QTY";
	public static final String TIMING_QUANTITY = "TIMING_QUANTITY";
	public static final String TIMING_TRAY = "TIMING_TRAY";
	public static final String TREATMENT = "TREATMENT";
	public static final String VISIT = "VISIT";

	private Table0391(){
		setTableName("Segment group");
		setOID("2.16.840.1.113883.12.391");

		putMap("ADMINISTRATION", "");
		putMap("ALLERGY", "");
		putMap("APP_STATS", "");
		putMap("APP_STATUS", "");
		putMap("ASSOCIATED_PERSON", "");
		putMap("ASSOCIATED_RX_ADMIN", "");
		putMap("ASSOCIATED_RX_ORDER", "");
		putMap("AUTHORIZATION", "");
		putMap("AUTHORIZATION_CONTACT", "");
		putMap("CERTIFICATE", "");
		putMap("CLOCK", "");
		putMap("CLOCK_AND_STATISTICS", "");
		putMap("CLOCK_AND_STATS_WITH_NOTE", "");
		putMap("COMMAND", "");
		putMap("COMMAND_RESPONSE", "");
		putMap("COMMON_ORDER", "");
		putMap("COMPONENT", "");
		putMap("COMPONENTS", "");
		putMap("CONTAINER", "");
		putMap("DEFINITION", "");
		putMap("DIET", "");
		putMap("DISPENSE", "");
		putMap("ENCODED ORDER", "");
		putMap("ENCODING", "");
		putMap("EXPERIENCE", "");
		putMap("FINANCIAL", "");
		putMap("FINANCIAL_COMMON ORDER", "");
		putMap("FINANCIAL_INSURANCE", "");
		putMap("FINANCIAL_OBSERVATION", "");
		putMap("FINANCIAL_ORDER", "");
		putMap("FINANCIAL_PROCEDURE", "");
		putMap("FINANCIAL_TIMING QUANTITY", "");
		putMap("GENERAL RESOURCE", "");
		putMap("GIVE", "");
		putMap("GOAL", "");
		putMap("GOAL_OBSERVATION", "");
		putMap("GOAL_PATHWAY", "");
		putMap("GOAL_ROLE", "");
		putMap("GUARANTOR_INSURANCE", "");
		putMap("INSURANCE", "");
		putMap("LOCATION RESOURCE", "");
		putMap("MERGE_INFO", "");
		putMap("MF", "");
		putMap("MF_CDM", "");
		putMap("MF_CLIN_STUDY", "");
		putMap("MF_CLIN_STUDY_SCHED", "");
		putMap("MF_INV_ITEM", "");
		putMap("MF_LOC_DEPT", "");
		putMap("MF_LOCATION", "");
		putMap("MF_OBS_ATTRIBUTES", "");
		putMap("MF_PHASE_SCHED_DETAIL", "");
		putMap("MF_QUERY", "");
		putMap("MF_SITE_DEFINED", "");
		putMap("MF_STAFF", "");
		putMap("MF_TEST", "");
		putMap("MF_TEST_BATT_DETAIL", "");
		putMap("MF_TEST_BATTERIES", "");
		putMap("MF_TEST_CALC_DETAIL", "");
		putMap("MF_TEST_CALCULATED", "");
		putMap("MF_TEST_CAT_DETAIL", "");
		putMap("MF_TEST_CATEGORICAL", "");
		putMap("MF_TEST_NUMERIC", "");
		putMap("NK1_TIMING_QTY", "");
		putMap("NOTIFICATION", "");
		putMap("OBSERVATION", "");
		putMap("OBSERVATION_PRIOR", "");
		putMap("OBSERVATION_REQUEST", "");
		putMap("OMSERVATION", "");
		putMap("ORDER", "");
		putMap("ORDER_CHOICE", "");
		putMap("ORDER_DETAIL", "");
		putMap("ORDER_DETAIL_SUPPLEMENT", "");
		putMap("ORDER_DIET", "");
		putMap("ORDER_ENCODED", "");
		putMap("ORDER_OBSERVATION", "");
		putMap("ORDER_PRIOR", "");
		putMap("ORDER_TRAY", "");
		putMap("PATHWAY", "");
		putMap("PATHWAY_ROLE", "");
		putMap("PATIENT", "");
		putMap("PATIENT VISIT", "");
		putMap("PATIENT_PRIOR", "");
		putMap("PATIENT_RESULT", "");
		putMap("PATIENT_VISIT_PRIOR", "");
		putMap("PERSONNEL RESOURCE", "");
		putMap("PEX_CAUSE", "");
		putMap("PEX_OBSERVATION", "");
		putMap("PRIOR_RESULT", "");
		putMap("PROBLEM", "");
		putMap("PROBLEM_OBSERVATION", "");
		putMap("PROBLEM_PATHWAY", "");
		putMap("PROBLEM_ROLE", "");
		putMap("PROCEDURE", "");
		putMap("PRODUCT", "");
		putMap("PRODUCT_STATUS", "");
		putMap("PROVIDER", "");
		putMap("PROVIDER_CONTACT", "");
		putMap("QBP", "");
		putMap("QRY_WITH_DETAIL", "");
		putMap("QUERY_RESPONSE", "");
		putMap("QUERY_RESULT_CLUSTER", "");
		putMap("REQUEST", "");
		putMap("RESOURCE", "");
		putMap("RESOURCES", "");
		putMap("RESPONSE", "");
		putMap("RESULT", "");
		putMap("RESULTS", "");
		putMap("RESULTS_NOTES", "");
		putMap("ROW_DEFINITION", "");
		putMap("RX_ADMINISTRATION", "");
		putMap("RX_ORDER", "");
		putMap("SCHEDULE", "");
		putMap("SERVICE", "");
		putMap("SPECIMEN", "");
		putMap("SPECIMEN_CONTAINER", "");
		putMap("STAFF", "");
		putMap("STUDY", "");
		putMap("STUDY_OBSERVATION", "");
		putMap("STUDY_PHASE", "");
		putMap("STUDY_SCHEDULE", "");
		putMap("TEST_CONFIGURATION", "");
		putMap("TIMING", "");
		putMap("TIMING_DIET", "");
		putMap("TIMING_ENCODED", "");
		putMap("TIMING_GIVE", "");
		putMap("TIMING_PRIOR", "");
		putMap("TIMING_QTY", "");
		putMap("TIMING_QUANTITY", "");
		putMap("TIMING_TRAY", "");
		putMap("TREATMENT", "");
		putMap("VISIT", "");

	}

}
