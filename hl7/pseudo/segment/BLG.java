package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class BLG extends hl7.model.V2_7.segment.BLG{
	public BLG(){
		super();
	}

	public static BLG CLASS;
	static{
		CLASS = new BLG();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

