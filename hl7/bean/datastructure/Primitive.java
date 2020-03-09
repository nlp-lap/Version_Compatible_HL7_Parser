package hl7.bean.datastructure;


public abstract class Primitive extends DataStructure{
	protected String value;
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}
	public String encode(){
		return getValue();
	}
	
	public void decode(String value){
		setValue(value);
	}
	
	public void setVersion(String setVersion){
		this.setVersion = setVersion;
	}
	
	public void originalVersion(String originalVersion){
		this.originalVersion = originalVersion;
	}
	
	public void depth(int depth){
		this.depth = depth;
	}


}
