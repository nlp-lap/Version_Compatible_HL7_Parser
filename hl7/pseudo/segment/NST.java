package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class NST extends hl7.model.V2_7.segment.NST{
	public NST(){
		super();
	}

	public static NST CLASS;
	static{
		CLASS = new NST();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

