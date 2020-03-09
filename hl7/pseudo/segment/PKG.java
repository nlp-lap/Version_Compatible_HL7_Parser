package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PKG extends hl7.model.V2_7.segment.PKG{
	public PKG(){
		super();
	}

	public static PKG CLASS;
	static{
		CLASS = new PKG();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

