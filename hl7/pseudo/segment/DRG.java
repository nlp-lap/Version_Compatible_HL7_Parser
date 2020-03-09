package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class DRG extends hl7.model.V2_7.segment.DRG{
	public DRG(){
		super();
	}

	public static DRG CLASS;
	static{
		CLASS = new DRG();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

