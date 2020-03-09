package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class VND extends hl7.model.V2_7.segment.VND{
	public VND(){
		super();
	}

	public static VND CLASS;
	static{
		CLASS = new VND();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

