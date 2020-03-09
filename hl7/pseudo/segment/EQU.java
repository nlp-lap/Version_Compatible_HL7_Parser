package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class EQU extends hl7.model.V2_7.segment.EQU{
	public EQU(){
		super();
	}

	public static EQU CLASS;
	static{
		CLASS = new EQU();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

