package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RDT extends hl7.model.V2_7.segment.RDT{
	public RDT(){
		super();
	}

	public static RDT CLASS;
	static{
		CLASS = new RDT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

