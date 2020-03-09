package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PTA extends hl7.model.V2_7.datastructure.PTA{
	public PTA(){
		super();
	}
	
	public static PTA CLASS;
	static{
		CLASS = new PTA();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
