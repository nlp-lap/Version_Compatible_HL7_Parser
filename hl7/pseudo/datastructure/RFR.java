package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class RFR extends hl7.model.V2_7.datastructure.RFR{
	public RFR(){
		super();
	}
	
	public static RFR CLASS;
	static{
		CLASS = new RFR();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
