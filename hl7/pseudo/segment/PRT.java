package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PRT extends hl7.model.V2_7.segment.PRT{
	public PRT(){
		super();
	}

	public static PRT CLASS;
	static{
		CLASS = new PRT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

