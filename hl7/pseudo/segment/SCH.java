package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SCH extends hl7.model.V2_7.segment.SCH{
	public SCH(){
		super();
	}

	public static SCH CLASS;
	static{
		CLASS = new SCH();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

