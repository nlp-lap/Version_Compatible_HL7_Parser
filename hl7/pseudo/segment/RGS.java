package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RGS extends hl7.model.V2_7.segment.RGS{
	public RGS(){
		super();
	}

	public static RGS CLASS;
	static{
		CLASS = new RGS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

