package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SDD extends hl7.model.V2_7.segment.SDD{
	public SDD(){
		super();
	}

	public static SDD CLASS;
	static{
		CLASS = new SDD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

