package hl7.model.V2_7.datastructure;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.table.Table;

public class ED extends hl7.model.V2_6.datastructure.ED{
	public static final String VERSION = "2.7";
	public static final String SOURCE_APPLICATION = "Source Application";
	public static final String TYPE_OF_DATA = "Type of Data";
	public static final String DATA_SUBTYPE = "Data Subtype";
	public static final String ENCODING = "Encoding";
	public static final String DATA = "Data";
	
	public static int SIZE = 5;
	public DataStructure[] components = new DataStructure[SIZE];
	public static DataStructure[] standard = new DataStructure[SIZE];
	public static Table[] tables = new Table[SIZE];
	public static String[] descriptions = new String[SIZE];
	public static boolean[] required = new boolean[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] conditional = new boolean[SIZE];
	public static int[] length = new int[SIZE];
	static{
		standard[0]=hl7.pseudo.datastructure.HD.CLASS;
		standard[1]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.TX.CLASS;
		
		tables[0]=null;
		tables[1]=hl7.model.V2_7.table.Table0834.getInstance();
		tables[2]=hl7.model.V2_7.table.Table0291.getInstance();
		tables[3]=hl7.model.V2_7.table.Table0299.getInstance();
		tables[4]=null;
		
		descriptions[0]=SOURCE_APPLICATION;
		descriptions[1]=TYPE_OF_DATA;
		descriptions[2]=DATA_SUBTYPE;
		descriptions[3]=ENCODING;
		descriptions[4]=DATA;

		required[0]=false;
		required[1]=false;
		required[2]=false;
		required[3]=false;
		required[4]=false;
		
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
		optional[3]=false;
		optional[4]=false;
		
		conditional[0]=false;
		conditional[1]=false;
		conditional[2]=false;
		conditional[3]=false;
		conditional[4]=false;
		
		length[0]=2147483647;
		length[1]=11;
		length[2]=2147483647;
		length[3]=6;
		length[4]=2147483647;
	}
	
	public ED(){
		type = DataStructure.ED;
	}
	
	@Override
	public DataStructure cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.datastructure.ED data = new hl7.pseudo.datastructure.ED();
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
						hl7.model.V2_6.datastructure.ED type = (hl7.model.V2_6.datastructure.ED)this;
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
			return null;
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