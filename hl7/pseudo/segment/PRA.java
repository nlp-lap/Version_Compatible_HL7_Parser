package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PRA extends hl7.model.V2_7.segment.PRA{
	public PRA(){
		super();
	}

	public static PRA CLASS;
	static{
		CLASS = new PRA();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

