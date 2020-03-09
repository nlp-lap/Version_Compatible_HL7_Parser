package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CSR extends hl7.model.V2_7.segment.CSR{
	public CSR(){
		super();
	}

	public static CSR CLASS;
	static{
		CLASS = new CSR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

