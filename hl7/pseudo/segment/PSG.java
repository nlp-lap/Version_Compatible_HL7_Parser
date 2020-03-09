package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PSG extends hl7.model.V2_7.segment.PSG{
	public PSG(){
		super();
	}

	public static PSG CLASS;
	static{
		CLASS = new PSG();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

