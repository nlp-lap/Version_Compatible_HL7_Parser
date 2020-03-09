package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ORO extends hl7.model.V2_1.segment.ORO{
	public ORO(){
		super();
	}

	public static ORO CLASS;
	static{
		CLASS = new ORO();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

