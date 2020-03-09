package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PSH extends hl7.model.V2_7.segment.PSH{
	public PSH(){
		super();
	}

	public static PSH CLASS;
	static{
		CLASS = new PSH();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

