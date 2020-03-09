package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ORG extends hl7.model.V2_7.segment.ORG{
	public ORG(){
		super();
	}

	public static ORG CLASS;
	static{
		CLASS = new ORG();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

