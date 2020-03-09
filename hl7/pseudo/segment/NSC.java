package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class NSC extends hl7.model.V2_7.segment.NSC{
	public NSC(){
		super();
	}

	public static NSC CLASS;
	static{
		CLASS = new NSC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

