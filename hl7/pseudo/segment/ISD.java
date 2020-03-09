package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ISD extends hl7.model.V2_7.segment.ISD{
	public ISD(){
		super();
	}

	public static ISD CLASS;
	static{
		CLASS = new ISD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

