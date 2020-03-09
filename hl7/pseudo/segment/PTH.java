package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PTH extends hl7.model.V2_7.segment.PTH{
	public PTH(){
		super();
	}

	public static PTH CLASS;
	static{
		CLASS = new PTH();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

