package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class MRG extends hl7.model.V2_7.segment.MRG{
	public MRG(){
		super();
	}

	public static MRG CLASS;
	static{
		CLASS = new MRG();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

