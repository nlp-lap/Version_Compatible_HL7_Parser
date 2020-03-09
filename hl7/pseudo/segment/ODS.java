package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ODS extends hl7.model.V2_7.segment.ODS{
	public ODS(){
		super();
	}

	public static ODS CLASS;
	static{
		CLASS = new ODS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

