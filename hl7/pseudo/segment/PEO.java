package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PEO extends hl7.model.V2_7.segment.PEO{
	public PEO(){
		super();
	}

	public static PEO CLASS;
	static{
		CLASS = new PEO();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

