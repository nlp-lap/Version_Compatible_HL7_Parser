package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IIM extends hl7.model.V2_7.segment.IIM{
	public IIM(){
		super();
	}

	public static IIM CLASS;
	static{
		CLASS = new IIM();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

