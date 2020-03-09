package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CSP extends hl7.model.V2_7.segment.CSP{
	public CSP(){
		super();
	}

	public static CSP CLASS;
	static{
		CLASS = new CSP();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

