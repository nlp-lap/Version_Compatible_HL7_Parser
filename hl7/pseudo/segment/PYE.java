package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PYE extends hl7.model.V2_7.segment.PYE{
	public PYE(){
		super();
	}

	public static PYE CLASS;
	static{
		CLASS = new PYE();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

