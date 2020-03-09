package hl7.model.V2_7.datastructure;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.table.Table;

public class XAD extends hl7.model.V2_6.datastructure.XAD{
	public static final String VERSION = "2.7";
	public static final String STREET_ADDRESS = "Street Address";
	public static final String OTHER_DESIGNATION = "Other Designation";
	public static final String CITY = "City";
	public static final String STATE_OR_PROVINCE = "State or Province";
	public static final String ZIP_OR_POSTAL_CODE = "Zip or Postal Code";
	public static final String COUNTRY = "Country";
	public static final String ADDRESS_TYPE = "Address Type";
	public static final String OTHER_GEOGRAPHIC_DESIGNATION = "Other Geographic Designation";
	public static final String COUNTY_PARISH_CODE = "County/Parish Code";
	public static final String CENSUS_TRACT = "Census Tract";
	public static final String ADDRESS_REPRESENTATION_CODE = "Address Representation Code";
	public static final String ADDRESS_VALIDITY_RANGE = "Address Validity Range";
	public static final String EFFECTIVE_DATE = "Effective Date";
	public static final String EXPIRATION_DATE = "Expiration Date";
	public static final String EXPIRATION_REASON = "Expiration Reason";
	public static final String TEMPORARY_INDICATOR = "Temporary Indicator";
	public static final String BAD_ADDRESS_INDICATOR = "Bad Address Indicator";
	public static final String ADDRESS_USAGE = "Address Usage";
	public static final String ADDRESSEE = "Addressee";
	public static final String COMMENT = "Comment";
	public static final String PREFERENCE_ORDER = "Preference Order";
	public static final String PROTECTION_CODE = "Protection Code";
	public static final String ADDRESS_IDENTIFIER = "Address Identifier";
	
	public static int SIZE = 23;
	public DataStructure[] components = new DataStructure[SIZE];
	public static DataStructure[] standard = new DataStructure[SIZE];
	public static Table[] tables = new Table[SIZE];
	public static String[] descriptions = new String[SIZE];
	public static boolean[] required = new boolean[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] conditional = new boolean[SIZE];
	public static int[] length = new int[SIZE];
	static{
		standard[0]=hl7.pseudo.datastructure.SAD.CLASS;
		standard[1]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[6]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[8]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[9]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[11]=hl7.pseudo.datastructure.DR.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[14]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[15]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[16]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[18]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[20]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[21]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[22]=hl7.pseudo.datastructure.EI.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=null;
		tables[3]=null;
		tables[4]=null;
		tables[5]=hl7.model.V2_7.table.Table0399.getInstance();
		tables[6]=hl7.model.V2_7.table.Table0190.getInstance();
		tables[7]=null;
		tables[8]=hl7.model.V2_7.table.Table0289.getInstance();
		tables[9]=hl7.model.V2_7.table.Table0288.getInstance();
		tables[10]=hl7.model.V2_7.table.Table0465.getInstance();
		tables[11]=null;
		tables[12]=null;
		tables[13]=null;
		tables[14]=hl7.model.V2_7.table.Table0616.getInstance();
		tables[15]=hl7.model.V2_7.table.Table0136.getInstance();
		tables[16]=hl7.model.V2_7.table.Table0136.getInstance();
		tables[17]=hl7.model.V2_7.table.Table0617.getInstance();
		tables[18]=null;
		tables[19]=null;
		tables[20]=null;
		tables[21]=hl7.model.V2_7.table.Table0618.getInstance();
		tables[22]=null;
		
		descriptions[0]=STREET_ADDRESS;
		descriptions[1]=OTHER_DESIGNATION;
		descriptions[2]=CITY;
		descriptions[3]=STATE_OR_PROVINCE;
		descriptions[4]=ZIP_OR_POSTAL_CODE;
		descriptions[5]=COUNTRY;
		descriptions[6]=ADDRESS_TYPE;
		descriptions[7]=OTHER_GEOGRAPHIC_DESIGNATION;
		descriptions[8]=COUNTY_PARISH_CODE;
		descriptions[9]=CENSUS_TRACT;
		descriptions[10]=ADDRESS_REPRESENTATION_CODE;
		descriptions[11]=ADDRESS_VALIDITY_RANGE;
		descriptions[12]=EFFECTIVE_DATE;
		descriptions[13]=EXPIRATION_DATE;
		descriptions[14]=EXPIRATION_REASON;
		descriptions[15]=TEMPORARY_INDICATOR;
		descriptions[16]=BAD_ADDRESS_INDICATOR;
		descriptions[17]=ADDRESS_USAGE;
		descriptions[18]=ADDRESSEE;
		descriptions[19]=COMMENT;
		descriptions[20]=PREFERENCE_ORDER;
		descriptions[21]=PROTECTION_CODE;
		descriptions[22]=ADDRESS_IDENTIFIER;

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
		
		length[0]=2147483647;
		length[1]=2147483647;
		length[2]=2147483647;
		length[3]=2147483647;
		length[4]=2147483647;
		length[5]=3;
		length[6]=3;
		length[7]=2147483647;
		length[8]=2147483647;
		length[9]=2147483647;
		length[10]=1;
		length[11]=2147483647;
		length[12]=2147483647;
		length[13]=2147483647;
		length[14]=2147483647;
		length[15]=1;
		length[16]=1;
		length[17]=1;
		length[18]=2147483647;
		length[19]=2147483647;
		length[20]=2147483647;
		length[21]=2147483647;
		length[22]=2147483647;
	}
	
	public XAD(){
		type = DataStructure.XAD;
	}
	
	@Override
	public DataStructure cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.datastructure.XAD data = new hl7.pseudo.datastructure.XAD();
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
			if(i==8) subComponents[i] = (components[i]!=null)?hl7.pseudo.datastructure.CWE.CLASS.cloneClass(VERSION, VERSION):null;
			if(i==9) subComponents[i] = (components[i]!=null)?hl7.pseudo.datastructure.CWE.CLASS.cloneClass(VERSION, VERSION):null;
			if(i==0) subComponents[i] = components[i];
			if(i==1) subComponents[i] = components[i];
			if(i==2) subComponents[i] = components[i];
			if(i==3) subComponents[i] = components[i];
			if(i==4) subComponents[i] = components[i];
			if(i==5) subComponents[i] = components[i];
			if(i==6) subComponents[i] = components[i];
			if(i==7) subComponents[i] = components[i];
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
						hl7.model.V2_6.datastructure.XAD type = (hl7.model.V2_6.datastructure.XAD)this;
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
			return null;
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
