package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SAC extends hl7.model.V2_7.segment.SAC{
	public SAC(){
		super();
	}

	public static SAC CLASS;
	static{
		CLASS = new SAC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

