package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class REL extends hl7.model.V2_7.segment.REL{
	public REL(){
		super();
	}

	public static REL CLASS;
	static{
		CLASS = new REL();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

