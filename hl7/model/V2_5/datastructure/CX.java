package hl7.model.V2_5.datastructure;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.table.Table;

public class CX extends hl7.model.V2_4.datastructure.CX{
	public static final String VERSION = "2.5";
	public static final String ID_NUMBER = "ID Number";
	public static final String CHECK_DIGIT = "Check Digit";
	public static final String CHECK_DIGIT_SCHEME = "Check Digit Scheme";
	public static final String ASSIGNING_AUTHORITY = "Assigning Authority";
	public static final String IDENTIFIER_TYPE_CODE = "Identifier Type Code";
	public static final String ASSIGNING_FACILITY = "Assigning Facility";
	public static final String EFFECTIVE_DATE = "Effective Date";
	public static final String EXPIRATION_DATE = "Expiration Date";
	public static final String ASSIGNING_JURISDICTION = "Assigning Jurisdiction";
	public static final String ASSIGNING_AGENCY_OR_DEPARTMENT = "Assigning Agency or Department";
	
	public static int SIZE = 10;
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
		standard[1]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[3]=hl7.pseudo.datastructure.HD.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[5]=hl7.pseudo.datastructure.HD.CLASS;
		standard[6]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[8]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[9]=hl7.pseudo.datastructure.CWE.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=hl7.model.V2_5.table.Table0061.getInstance();
		tables[3]=hl7.model.V2_5.table.Table0363.getInstance();
		tables[4]=hl7.model.V2_5.table.Table0203.getInstance();
		tables[5]=null;
		tables[6]=null;
		tables[7]=null;
		tables[8]=null;
		tables[9]=null;
		
		descriptions[0]=ID_NUMBER;
		descriptions[1]=CHECK_DIGIT;
		descriptions[2]=CHECK_DIGIT_SCHEME;
		descriptions[3]=ASSIGNING_AUTHORITY;
		descriptions[4]=IDENTIFIER_TYPE_CODE;
		descriptions[5]=ASSIGNING_FACILITY;
		descriptions[6]=EFFECTIVE_DATE;
		descriptions[7]=EXPIRATION_DATE;
		descriptions[8]=ASSIGNING_JURISDICTION;
		descriptions[9]=ASSIGNING_AGENCY_OR_DEPARTMENT;

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
		
		length[0]=15;
		length[1]=1;
		length[2]=3;
		length[3]=227;
		length[4]=5;
		length[5]=227;
		length[6]=8;
		length[7]=8;
		length[8]=705;
		length[9]=705;
	}
	
	public CX(){
		type = DataStructure.CX;
	}
	
	@Override
	public DataStructure cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.datastructure.CX data = new hl7.pseudo.datastructure.CX();
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
	
	private boolean compiled = false;	//���� ������ ���� Ȯ��
	public void decode(String message) throws Exception {
		originalComponent = message;
		if(MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){
			super.decode(message);
			
		}else{
			compiled = true;	//���� ������ ���� Ȯ��
			
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
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * �Ź��� �޽���-->������ �ļ�(����ȣȯ)
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
			if(components[i]==null) continue;
			components[i].depth(subComponents[i].depth);
			subComponents[i].setVersion(prevVersion);
			String data = subComponents[i].encode();
			components[i].decode(data);
		}
	}
	
	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * ������ �޽���-->�Ź��� �ļ�(����ȣȯ)
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
			if(components[i]==null) continue;
			subComponents[i].depth(components[i].depth);
			components[i].setVersion(originalVersion);
			String data = components[i].encode();
			subComponents[i].decode(data);
		}
	}
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//���� ������ �޼ҵ忡�� ��ġã�� �ɼ� ����
		return encode(null);
	}
	
	public String encode(DataStructure[] subComponents) throws Exception{
		if(seekOriginalVersion&&MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){ //���� ������ ��ġ ã��
			//���� ������ ���� ��ġ�� �ƴ� ��
			//���� ���� ��ġ ã�ư���
			return super.encode(null);
			
		}else{//���� ������ ��ġ ã��
			seekOriginalVersion = false;
			//���� ������ ���� ��ġ�� ��
			if(setVersion.equals(VERSION)){ //���� ������ ��ġ ã��
				//���� ������ ���� ��ġ�� ��
				String message = this.makeMessage(components, VERSION);
				return message;
				
			}else{ //���� ������ ��ġ ã��
				//���� ������ ���� ��ġ�� �ƴ� ��
				if(MessageStructure.getVersionCode(setVersion)<MessageStructure.getVersionCode(VERSION)){ //�������� �̵� ���� ã��
					//���� ������ ���� �������� ���� �� (backward)
					//if(MessageStructure.getVersionCode(originalVersion)>=MessageStructure.getVersionCode(VERSION)){
						hl7.model.V2_4.datastructure.CX type = (hl7.model.V2_4.datastructure.CX)this;
						type.backward(type.components, components, originalVersion, setVersion, VERSION, depth);
					//}
					//���� ������ ��ġ�� ã�ư���
					return super.encode(components);
					
					
				}else{ //�������� �̵� ���� ã��
					/*-------------------------------------------------------------
					 *���� ������ ���� �������� ���� ��(forward)
					 *���� �������� Casting �� forward ȣ��
					 *������ ������ ���� 
					 *-----------------------------------------------------------------
					 */
					encodeVersion = VERSION;
					return this.encodeForward(encodeVersion, setVersion);
				}

			}
			
		}
	}

	public String encodeForward(String encodeVersion, String setVersion) throws Exception{
		//���� �������� ���ڵ� �� �ش� ��ġ�� ã�� ������ (�޼ҵ� �������̵� ������ ó������ �ٽ� ã�ư��� ��)
		if(encodeVersion.equals(VERSION)){
			hl7.model.V2_51.datastructure.CX type = (hl7.model.V2_51.datastructure.CX)this;
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

			boolean add = false;	//���ʿ��� ������Ʈ�� ������ �� true
			String component = "";
			DataStructure exDS = null;
			for(int i=0; i<components.length; i++){
				if(components[i]!=null) exDS = components[i];
			}
			if(exDS==null) return null;
			char separator = (exDS.depth<=1)?MessageStructure.COMPONENT_SEPARATOR:MessageStructure.SUBCOMPONENT_SEPARATOR;;
			for(int i=components.length-1; i>=0; i--){
				DataStructure comp = components[i];
				if(comp!=null || required[i]) add=true;	//�ʼ��׸���� �߰�
				
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