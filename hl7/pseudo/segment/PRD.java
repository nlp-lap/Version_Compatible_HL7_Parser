package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PRD extends hl7.model.V2_7.segment.PRD{
	public PRD(){
		super();
	}

	public static PRD CLASS;
	static{
		CLASS = new PRD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

