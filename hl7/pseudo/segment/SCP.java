package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SCP extends hl7.model.V2_7.segment.SCP{
	public SCP(){
		super();
	}

	public static SCP CLASS;
	static{
		CLASS = new SCP();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

