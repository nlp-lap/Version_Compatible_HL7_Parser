package hl7.model.V2_51.datastructure;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.table.Table;

public class XPN extends hl7.model.V2_5.datastructure.XPN{
	public static final String VERSION = "2.5.1";
	public static final String FAMILY_NAME = "Family Name";
	public static final String GIVEN_NAME = "Given Name";
	public static final String SECOND_AND_FURTHER_GIVEN_NAMES_OR_INITIALS_THEREOF = "Second and Further Given Names or Initials Thereof";
	public static final String SUFFIX = "Suffix (e.g., JR or III)";
	public static final String PREFIX = "Prefix (e.g., DR)";
	public static final String DEGREE = "Degree (e.g., MD)";
	public static final String NAME_TYPE_CODE = "Name Type Code";
	public static final String NAME_REPRESENTATION_CODE = "Name Representation Code";
	public static final String NAME_CONTEXT = "Name Context";
	public static final String NAME_VALIDITY_RANGE = "Name Validity Range";
	public static final String NAME_ASSEMBLY_ORDER = "Name Assembly Order";
	public static final String EFFECTIVE_DATE = "Effective Date";
	public static final String EXPIRATION_DATE = "Expiration Date";
	public static final String PROFESSIONAL_SUFFIX = "Professional Suffix";
	
	public static int SIZE = 14;
	public DataStructure[] components = new DataStructure[SIZE];
	public static DataStructure[] standard = new DataStructure[SIZE];
	public static Table[] tables = new Table[SIZE];
	public static String[] descriptions = new String[SIZE];
	public static boolean[] required = new boolean[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] conditional = new boolean[SIZE];
	public static int[] length = new int[SIZE];
	static{
		standard[0]=hl7.pseudo.datastructure.FN.CLASS;
		standard[1]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[6]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[8]=hl7.pseudo.datastructure.CE.CLASS;
		standard[9]=hl7.pseudo.datastructure.DR.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.ST.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=null;
		tables[3]=null;
		tables[4]=null;
		tables[5]=hl7.model.V2_51.table.Table0360.getInstance();
		tables[6]=hl7.model.V2_51.table.Table0200.getInstance();
		tables[7]=hl7.model.V2_51.table.Table0465.getInstance();
		tables[8]=hl7.model.V2_51.table.Table0448.getInstance();
		tables[9]=null;
		tables[10]=hl7.model.V2_51.table.Table0444.getInstance();
		tables[11]=null;
		tables[12]=null;
		tables[13]=null;
		
		descriptions[0]=FAMILY_NAME;
		descriptions[1]=GIVEN_NAME;
		descriptions[2]=SECOND_AND_FURTHER_GIVEN_NAMES_OR_INITIALS_THEREOF;
		descriptions[3]=SUFFIX;
		descriptions[4]=PREFIX;
		descriptions[5]=DEGREE;
		descriptions[6]=NAME_TYPE_CODE;
		descriptions[7]=NAME_REPRESENTATION_CODE;
		descriptions[8]=NAME_CONTEXT;
		descriptions[9]=NAME_VALIDITY_RANGE;
		descriptions[10]=NAME_ASSEMBLY_ORDER;
		descriptions[11]=EFFECTIVE_DATE;
		descriptions[12]=EXPIRATION_DATE;
		descriptions[13]=PROFESSIONAL_SUFFIX;

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
		
		length[0]=194;
		length[1]=30;
		length[2]=30;
		length[3]=20;
		length[4]=20;
		length[5]=6;
		length[6]=1;
		length[7]=1;
		length[8]=483;
		length[9]=53;
		length[10]=1;
		length[11]=26;
		length[12]=26;
		length[13]=199;
	}
	
	public XPN(){
		type = DataStructure.XPN;
	}
	
	@Override
	public DataStructure cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.datastructure.XPN data = new hl7.pseudo.datastructure.XPN();
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
			if(i==11) components[i] = (subComponents[i]!=null)?hl7.bean.datastructure.primitive.TS.CLASS.cloneClass(prevVersion, prevVersion):null;
			if(i==12) components[i] = (subComponents[i]!=null)?hl7.bean.datastructure.primitive.TS.CLASS.cloneClass(prevVersion, prevVersion):null;
			if(i==8) components[i] = (subComponents[i]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(prevVersion, prevVersion):null;
			if(i==0) components[i] = subComponents[i];
			if(i==1) components[i] = subComponents[i];
			if(i==2) components[i] = subComponents[i];
			if(i==3) components[i] = subComponents[i];
			if(i==4) components[i] = subComponents[i];
			if(i==5) components[i] = subComponents[i];
			if(i==6) components[i] = subComponents[i];
			if(i==7) components[i] = subComponents[i];
			if(i==9) components[i] = subComponents[i];
			if(i==10) components[i] = subComponents[i];
			if(i==13) components[i] = subComponents[i];
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
						hl7.model.V2_5.datastructure.XPN type = (hl7.model.V2_5.datastructure.XPN)this;
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
			hl7.model.V2_6.datastructure.XPN type = (hl7.model.V2_6.datastructure.XPN)this;
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