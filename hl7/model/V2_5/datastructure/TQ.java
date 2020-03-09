package hl7.model.V2_5.datastructure;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.table.Table;

public class TQ extends hl7.model.V2_4.datastructure.TQ{
	public static final String VERSION = "2.5";
	public static final String QUANTITY = "Quantity";
	public static final String INTERVAL = "Interval";
	public static final String DURATION = "Duration";
	public static final String START_DATE_TIME = "Start Date/Time";
	public static final String END_DATE_TIME = "End Date/Time";
	public static final String PRIORITY = "Priority";
	public static final String CONDITION = "Condition";
	public static final String TEXT = "Text";
	public static final String CONJUNCTION = "Conjunction";
	public static final String ORDER_SEQUENCING = "Order Sequencing";
	public static final String OCCURRENCE_DURATION = "Occurrence Duration";
	public static final String TOTAL_OCCURRENCES = "Total Occurrences";
	
	public static int SIZE = 12;
	public DataStructure[] components = new DataStructure[SIZE];
	public static DataStructure[] standard = new DataStructure[SIZE];
	public static Table[] tables = new Table[SIZE];
	public static String[] descriptions = new String[SIZE];
	public static boolean[] required = new boolean[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] conditional = new boolean[SIZE];
	public static int[] length = new int[SIZE];
	static{
		standard[0]=hl7.pseudo.datastructure.CQ.CLASS;
		standard[1]=hl7.pseudo.datastructure.RI.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[6]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.TX.CLASS;
		standard[8]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[9]=hl7.pseudo.datastructure.OSD.CLASS;
		standard[10]=hl7.pseudo.datastructure.CE.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.NM.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=null;
		tables[3]=null;
		tables[4]=null;
		tables[5]=null;
		tables[6]=null;
		tables[7]=null;
		tables[8]=hl7.model.V2_5.table.Table0472.getInstance();
		tables[9]=null;
		tables[10]=null;
		tables[11]=null;
		
		descriptions[0]=QUANTITY;
		descriptions[1]=INTERVAL;
		descriptions[2]=DURATION;
		descriptions[3]=START_DATE_TIME;
		descriptions[4]=END_DATE_TIME;
		descriptions[5]=PRIORITY;
		descriptions[6]=CONDITION;
		descriptions[7]=TEXT;
		descriptions[8]=CONJUNCTION;
		descriptions[9]=ORDER_SEQUENCING;
		descriptions[10]=OCCURRENCE_DURATION;
		descriptions[11]=TOTAL_OCCURRENCES;

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
		
		length[0]=267;
		length[1]=206;
		length[2]=6;
		length[3]=26;
		length[4]=26;
		length[5]=6;
		length[6]=199;
		length[7]=200;
		length[8]=1;
		length[9]=110;
		length[10]=483;
		length[11]=4;
	}
	
	public TQ(){
		type = DataStructure.TQ;
	}
	
	@Override
	public DataStructure cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.datastructure.TQ data = new hl7.pseudo.datastructure.TQ();
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
						hl7.model.V2_4.datastructure.TQ type = (hl7.model.V2_4.datastructure.TQ)this;
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
			hl7.model.V2_51.datastructure.TQ type = (hl7.model.V2_51.datastructure.TQ)this;
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
