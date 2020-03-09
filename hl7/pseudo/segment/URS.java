package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class URS extends hl7.model.V2_6.segment.URS{
	public URS(){
		super();
	}

	public static URS CLASS;
	static{
		CLASS = new URS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

