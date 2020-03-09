package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class URD extends hl7.model.V2_6.segment.URD{
	public URD(){
		super();
	}

	public static URD CLASS;
	static{
		CLASS = new URD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

