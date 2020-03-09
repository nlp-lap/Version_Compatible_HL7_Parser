package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class QPD extends hl7.model.V2_7.segment.QPD{
	public QPD(){
		super();
	}

	public static QPD CLASS;
	static{
		CLASS = new QPD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

