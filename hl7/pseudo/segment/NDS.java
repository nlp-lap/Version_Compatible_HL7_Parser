package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class NDS extends hl7.model.V2_7.segment.NDS{
	public NDS(){
		super();
	}

	public static NDS CLASS;
	static{
		CLASS = new NDS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

