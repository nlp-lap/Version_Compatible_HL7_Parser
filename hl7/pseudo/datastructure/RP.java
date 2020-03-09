package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class RP extends hl7.model.V2_7.datastructure.RP{
	public RP(){
		super();
	}
	
	public static RP CLASS;
	static{
		CLASS = new RP();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
