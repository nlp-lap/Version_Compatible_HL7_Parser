package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class NA extends hl7.model.V2_7.datastructure.NA{
	public NA(){
		super();
	}
	
	public static NA CLASS;
	static{
		CLASS = new NA();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
