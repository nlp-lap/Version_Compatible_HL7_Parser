package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class MFE extends hl7.model.V2_7.segment.MFE{
	public MFE(){
		super();
	}

	public static MFE CLASS;
	static{
		CLASS = new MFE();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

