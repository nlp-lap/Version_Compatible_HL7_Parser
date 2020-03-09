package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ADD extends hl7.model.V2_7.segment.ADD{
	public ADD(){
		super();
	}

	public static ADD CLASS;
	static{
		CLASS = new ADD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

