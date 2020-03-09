package hl7.model.V2_51.datastructure;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.table.Table;

public class PPN extends hl7.model.V2_5.datastructure.PPN{
	public static final String VERSION = "2.5.1";
	public static final String ID_NUMBER = "ID Number";
	public static final String FAMILY_NAME = "Family Name";
	public static final String GIVEN_NAME = "Given Name";
	public static final String SECOND_AND_FURTHER_GIVEN_NAMES_OR_INITIALS_THEREOF = "Second and Further Given Names or Initials Thereof";
	public static final String SUFFIX = "Suffix (e.g., JR or III)";
	public static final String PREFIX = "Prefix (e.g., DR)";
	public static final String DEGREE = "Degree (e.g., MD)";
	public static final String SOURCE_TABLE = "Source Table";
	public static final String ASSIGNING_AUTHORITY = "Assigning Authority";
	public static final String NAME_TYPE_CODE = "Name Type Code";
	public static final String IDENTIFIER_CHECK_DIGIT = "Identifier Check Digit";
	public static final String CHECK_DIGIT_SCHEME = "Check Digit Scheme";
	public static final String IDENTIFIER_TYPE_CODE = "Identifier Type Code";
	public static final String ASSIGNING_FACILITY = "Assigning Facility";
	public static final String DATE_TIME_ACTION_PERFORMED = "Date/Time Action Performed";
	public static final String NAME_REPRESENTATION_CODE = "Name Representation Code";
	public static final String NAME_CONTEXT = "Name Context";
	public static final String NAME_VALIDITY_RANGE = "Name Validity Range";
	public static final String NAME_ASSEMBLY_ORDER = "Name Assembly Order";
	public static final String EFFECTIVE_DATE = "Effective Date";
	public static final String EXPIRATION_DATE = "Expiration Date";
	public static final String PROFESSIONAL_SUFFIX = "Professional Suffix";
	public static final String ASSIGNING_JURISDICTION = "Assigning Jurisdiction";
	public static final String ASSIGNING_AGENCY_OR_DEPARTMENT = "Assigning Agency or Department";
	
	public static int SIZE = 24;
	public DataStructure[] components = new DataStructure[SIZE];
	public static DataStructure[] standard = new DataStructure[SIZE];
	public static Table[] tables = new Table[SIZE];
	public static String[] descriptions = new String[SIZE];
	public static boolean[] required = new boolean[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] conditional = new boolean[SIZE];
	public static int[] length = new int[SIZE];
	static{
		standard[0]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[1]=hl7.pseudo.datastructure.FN.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[6]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[8]=hl7.pseudo.datastructure.HD.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[13]=hl7.pseudo.datastructure.HD.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[15]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[16]=hl7.pseudo.datastructure.CE.CLASS;
		standard[17]=hl7.pseudo.datastructure.DR.CLASS;
		standard[18]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[20]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[21]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[22]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[23]=hl7.pseudo.datastructure.CWE.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=null;
		tables[3]=null;
		tables[4]=null;
		tables[5]=null;
		tables[6]=hl7.model.V2_51.table.Table0360.getInstance();
		tables[7]=hl7.model.V2_51.table.Table0297.getInstance();
		tables[8]=hl7.model.V2_51.table.Table0363.getInstance();
		tables[9]=hl7.model.V2_51.table.Table0200.getInstance();
		tables[10]=null;
		tables[11]=hl7.model.V2_51.table.Table0061.getInstance();
		tables[12]=hl7.model.V2_51.table.Table0203.getInstance();
		tables[13]=null;
		tables[14]=null;
		tables[15]=hl7.model.V2_51.table.Table0465.getInstance();
		tables[16]=hl7.model.V2_51.table.Table0448.getInstance();
		tables[17]=null;
		tables[18]=hl7.model.V2_51.table.Table0444.getInstance();
		tables[19]=null;
		tables[20]=null;
		tables[21]=null;
		tables[22]=null;
		tables[23]=null;
		
		descriptions[0]=ID_NUMBER;
		descriptions[1]=FAMILY_NAME;
		descriptions[2]=GIVEN_NAME;
		descriptions[3]=SECOND_AND_FURTHER_GIVEN_NAMES_OR_INITIALS_THEREOF;
		descriptions[4]=SUFFIX;
		descriptions[5]=PREFIX;
		descriptions[6]=DEGREE;
		descriptions[7]=SOURCE_TABLE;
		descriptions[8]=ASSIGNING_AUTHORITY;
		descriptions[9]=NAME_TYPE_CODE;
		descriptions[10]=IDENTIFIER_CHECK_DIGIT;
		descriptions[11]=CHECK_DIGIT_SCHEME;
		descriptions[12]=IDENTIFIER_TYPE_CODE;
		descriptions[13]=ASSIGNING_FACILITY;
		descriptions[14]=DATE_TIME_ACTION_PERFORMED;
		descriptions[15]=NAME_REPRESENTATION_CODE;
		descriptions[16]=NAME_CONTEXT;
		descriptions[17]=NAME_VALIDITY_RANGE;
		descriptions[18]=NAME_ASSEMBLY_ORDER;
		descriptions[19]=EFFECTIVE_DATE;
		descriptions[20]=EXPIRATION_DATE;
		descriptions[21]=PROFESSIONAL_SUFFIX;
		descriptions[22]=ASSIGNING_JURISDICTION;
		descriptions[23]=ASSIGNING_AGENCY_OR_DEPARTMENT;

		required[0]=false;
		required[1]=false;
		required[2]=false;
		required[3]=false;
		required[4]=false;
		required[5]=false;
		required[6]=false;
		required[7]=false;
		required[8]=false;
		required[9]=false;
		required[10]=false;
		required[11]=false;
		required[12]=false;
		required[13]=false;
		required[14]=false;
		required[15]=false;
		required[16]=false;
		required[17]=false;
		required[18]=false;
		required[19]=false;
		required[20]=false;
		required[21]=false;
		required[22]=false;
		required[23]=false;
		
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
		optional[3]=false;
		optional[4]=false;
		optional[5]=false;
		optional[6]=false;
		optional[7]=false;
		optional[8]=false;
		optional[9]=false;
		optional[10]=false;
		optional[11]=false;
		optional[12]=false;
		optional[13]=false;
		optional[14]=false;
		optional[15]=false;
		optional[16]=false;
		optional[17]=false;
		optional[18]=false;
		optional[19]=false;
		optional[20]=false;
		optional[21]=false;
		optional[22]=false;
		optional[23]=false;
		
		conditional[0]=false;
		conditional[1]=false;
		conditional[2]=false;
		conditional[3]=false;
		conditional[4]=false;
		conditional[5]=false;
		conditional[6]=false;
		conditional[7]=false;
		conditional[8]=false;
		conditional[9]=false;
		conditional[10]=false;
		conditional[11]=false;
		conditional[12]=false;
		conditional[13]=false;
		conditional[14]=false;
		conditional[15]=false;
		conditional[16]=false;
		conditional[17]=false;
		conditional[18]=false;
		conditional[19]=false;
		conditional[20]=false;
		conditional[21]=false;
		conditional[22]=false;
		conditional[23]=false;
		
		length[0]=15;
		length[1]=194;
		length[2]=30;
		length[3]=30;
		length[4]=20;
		length[5]=20;
		length[6]=5;
		length[7]=4;
		length[8]=227;
		length[9]=1;
		length[10]=1;
		length[11]=3;
		length[12]=5;
		length[13]=227;
		length[14]=26;
		length[15]=1;
		length[16]=483;
		length[17]=17;
		length[18]=1;
		length[19]=26;
		length[20]=26;
		length[21]=199;
		length[22]=705;
		length[23]=705;
	}
	
	public PPN(){
		type = DataStructure.PPN;
	}
	
	@Override
	public DataStructure cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.datastructure.PPN data = new hl7.pseudo.datastructure.PPN();
		data.originalVersion = originalVersion;
		data.setVersion = setVersion;
		return data;
	}
	
	public void depth(int depth) {
		super.depth(depth);
		this.depth = depth; 
		for(int i=0; i<components.length; i++){
			DataStructure dataStructure = components[i];
			if(dataStructure!=null) dataStructure.depth(depth+1);
		}
	}
	public void setVersion(String setVersion) {
		super.setVersion(setVersion);
		this.setVersion = setVersion; 
		for(int i=0; i<components.length; i++){
			DataStructure dataStructure = components[i];
			if(dataStructure!=null) dataStructure.setVersion(setVersion);
		}
	}
	public void originalVersion(String originalVersion) {
		super.originalVersion(originalVersion);
		this.originalVersion = originalVersion; 
		for(int i=0; i<components.length; i++){
			DataStructure dataStructure = components[i];
			if(dataStructure!=null) dataStructure.originalVersion(originalVersion);
		}
	}
	public DataStructure[] getComponents(){
		if(setVersion.equals(VERSION)){
			return components;
		}else{
			return super.getComponents();
		}
	}
	
	private boolean compiled = false;	//최초 컴파일 여부 확인
	public void decode(String message) throws Exception {
		originalComponent = message;
		if(MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){
			super.decode(message);
			
		}else{
			compiled = true;	//최초 컴파일 여부 확인
			
			char separator = (depth<1)?MessageStructure.COMPONENT_SEPARATOR:MessageStructure.SUBCOMPONENT_SEPARATOR;
			String[] comps = divide(message, separator);
			if(comps==null) return;
		
			for(int i=0; i<components.length&&comps!=null&&i<comps.length; i++){
				components[i] = standard[i].cloneClass(originalVersion, setVersion);
				components[i].originalVersion(originalVersion);
				components[i].depth(depth+1);
				components[i].decode(comps[i]);
			}
		}
	}
	


	/* -----------------------------------------------------------------
	 * 이전 버전으로 매핑 components:구버전, subComponents:신버전
	 * 신버전 메시지-->구버전 파서(상위호환)
	 * -----------------------------------------------------------------
	 */
	public static void backward(DataStructure[] components, DataStructure[] subComponents, String originalVersion, String setVersion, String prevVersion, int depth) throws Exception{
		for(int i=0; subComponents!=null&&i<subComponents.length; i++){
			if(i>=SIZE) break;
			if(subComponents[i]==null) continue;
			if(i==14) components[i] = (subComponents[i]!=null)?hl7.bean.datastructure.primitive.TS.CLASS.cloneClass(prevVersion, prevVersion):null;
			if(i==19) components[i] = (subComponents[i]!=null)?hl7.bean.datastructure.primitive.TS.CLASS.cloneClass(prevVersion, prevVersion):null;
			if(i==20) components[i] = (subComponents[i]!=null)?hl7.bean.datastructure.primitive.TS.CLASS.cloneClass(prevVersion, prevVersion):null;
			if(i==16) components[i] = (subComponents[i]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(prevVersion, prevVersion):null;
			if(i==0) components[i] = subComponents[i];
			if(i==1) components[i] = subComponents[i];
			if(i==2) components[i] = subComponents[i];
			if(i==3) components[i] = subComponents[i];
			if(i==4) components[i] = subComponents[i];
			if(i==5) components[i] = subComponents[i];
			if(i==6) components[i] = subComponents[i];
			if(i==7) components[i] = subComponents[i];
			if(i==8) components[i] = subComponents[i];
			if(i==9) components[i] = subComponents[i];
			if(i==10) components[i] = subComponents[i];
			if(i==11) components[i] = subComponents[i];
			if(i==12) components[i] = subComponents[i];
			if(i==13) components[i] = subComponents[i];
			if(i==15) components[i] = subComponents[i];
			if(i==17) components[i] = subComponents[i];
			if(i==18) components[i] = subComponents[i];
			if(i==21) components[i] = subComponents[i];
			if(i==22) components[i] = subComponents[i];
			if(i==23) components[i] = subComponents[i];
			if(components[i]==null) continue;
			components[i].depth(subComponents[i].depth);
			subComponents[i].setVersion(prevVersion);
			String data = subComponents[i].encode();
			components[i].decode(data);
		}
	}
	
	/* -----------------------------------------------------------------
	 * 이후 버전으로 매핑 components:구버전, subComponents:신버전
	 * 구버전 메시지-->신버전 파서(하위호환)
	 * -----------------------------------------------------------------
	 */
	public static void forward(DataStructure[] components, DataStructure[] subComponents, String originalVersion, String setVersion, int depth) throws Exception{ 
		for(int i=0; components!=null&&i<components.length; i++){
			if(components[i]==null) continue;
			if(i==0) subComponents[i] = components[i];
			if(i==1) subComponents[i] = components[i];
			if(i==2) subComponents[i] = components[i];
			if(i==3) subComponents[i] = components[i];
			if(i==4) subComponents[i] = components[i];
			if(i==5) subComponents[i] = components[i];
			if(i==6) subComponents[i] = components[i];
			if(i==7) subComponents[i] = components[i];
			if(i==8) subComponents[i] = components[i];
			if(i==9) subComponents[i] = components[i];
			if(i==10) subComponents[i] = components[i];
			if(i==11) subComponents[i] = components[i];
			if(i==12) subComponents[i] = components[i];
			if(i==13) subComponents[i] = components[i];
			if(i==14) subComponents[i] = components[i];
			if(i==15) subComponents[i] = components[i];
			if(i==16) subComponents[i] = components[i];
			if(i==17) subComponents[i] = components[i];
			if(i==18) subComponents[i] = components[i];
			if(i==19) subComponents[i] = components[i];
			if(i==20) subComponents[i] = components[i];
			if(i==21) subComponents[i] = components[i];
			if(i==22) subComponents[i] = components[i];
			if(i==23) subComponents[i] = components[i];
			if(components[i]==null) continue;
			subComponents[i].depth(components[i].depth);
			components[i].setVersion(originalVersion);
			String data = components[i].encode();
			subComponents[i].decode(data);
		}
	}
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//가장 마지막 메소드에서 위치찾기 옵션 설정
		return encode(null);
	}
	
	public String encode(DataStructure[] subComponents) throws Exception{
		if(seekOriginalVersion&&MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){ //실제 버전의 위치 찾기
			//실제 버전이 현재 위치가 아닐 때
			//실제 버전 위치 찾아가기
			return super.encode(null);
			
		}else{//실제 버전의 위치 찾기
			seekOriginalVersion = false;
			//실제 버전이 현재 위치일 때
			if(setVersion.equals(VERSION)){ //설정 버전의 위치 찾기
				//설정 버전이 현재 위치일 때
				String message = this.makeMessage(components, VERSION);
				return message;
				
			}else{ //설정 버전의 위치 찾기
				//설정 버전이 현재 위치가 아닐 때
				if(MessageStructure.getVersionCode(setVersion)<MessageStructure.getVersionCode(VERSION)){ //버전으로 이동 방향 찾기
					//설정 버전이 현재 버전보다 낮을 때 (backward)
					//if(MessageStructure.getVersionCode(originalVersion)>=MessageStructure.getVersionCode(VERSION)){
						hl7.model.V2_5.datastructure.PPN type = (hl7.model.V2_5.datastructure.PPN)this;
						type.backward(type.components, components, originalVersion, setVersion, VERSION, depth);
					//}
					//설정 버전의 위치로 찾아가기
					return super.encode(components);
					
					
				}else{ //버전으로 이동 방향 찾기
					/*-------------------------------------------------------------
					 *설정 버전이 현재 버전보다 높을 때(forward)
					 *이후 버전으로 Casting 후 forward 호출
					 *마지막 버전은 생략 
					 *-----------------------------------------------------------------
					 */
					encodeVersion = VERSION;
					return this.encodeForward(encodeVersion, setVersion);
				}

			}
			
		}
	}

	public String encodeForward(String encodeVersion, String setVersion) throws Exception{
		//하위 버전으로 인코딩 시 해당 위치를 찾아 가도록 (메소드 오버라이딩 때문에 처음부터 다시 찾아가야 함)
		if(encodeVersion.equals(VERSION)){
			hl7.model.V2_6.datastructure.PPN type = (hl7.model.V2_6.datastructure.PPN)this;
			type.forward(this.components, type.components, originalVersion, setVersion, depth);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return super.encodeForward(encodeVersion, setVersion);
		}
	}

	public String makeMessage(DataStructure[] components, String version) throws Exception{
		if(VERSION.equals(version)){
			String message = "";

			boolean add = false;	//뒤쪽에서 컴포넌트가 존재할 때 true
			String component = "";
			DataStructure exDS = null;
			for(int i=0; i<components.length; i++){
				if(components[i]!=null) exDS = components[i];
			}
			if(exDS==null) return null;
			char separator = (exDS.depth<=1)?MessageStructure.COMPONENT_SEPARATOR:MessageStructure.SUBCOMPONENT_SEPARATOR;;
			for(int i=components.length-1; i>=0; i--){
				DataStructure comp = components[i];
				if(comp!=null || required[i]) add=true;	//필수항목부터 추가
				
				if(add&&component.length()>0) component = separator + component;
				if(comp==null) continue;
			
				String data = comp.encode();
				if(length[i]>0&&data!=null&&data.length()>length[i]) data=data.substring(0, length[i]);
				component = ((data==null)?"":data) + component;
			}
			
			if(message.length()>0) message+=MessageStructure.REPEATITION_SEPARATOR;
			message+=component;
			return (message.length()==0)?null:message;
			
		}else{
			return super.makeMessage(components, version);
		}
	}

}
