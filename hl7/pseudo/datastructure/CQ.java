package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CQ extends hl7.model.V2_7.datastructure.CQ{
	public CQ(){
		super();
	}
	
	public static CQ CLASS;
	static{
		CLASS = new CQ();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
