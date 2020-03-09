package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class AD extends hl7.model.V2_7.datastructure.AD{
	public AD(){
		super();
	}
	
	public static AD CLASS;
	static{
		CLASS = new AD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
