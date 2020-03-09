package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class SAD extends hl7.model.V2_7.datastructure.SAD{
	public SAD(){
		super();
	}
	
	public static SAD CLASS;
	static{
		CLASS = new SAD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
