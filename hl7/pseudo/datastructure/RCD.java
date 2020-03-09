package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class RCD extends hl7.model.V2_7.datastructure.RCD{
	public RCD(){
		super();
	}
	
	public static RCD CLASS;
	static{
		CLASS = new RCD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
