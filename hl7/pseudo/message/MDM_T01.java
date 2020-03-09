package hl7.pseudo.message;

import hl7.bean.Structure;

public class MDM_T01 extends hl7.model.V2_7.message.MDM_T01{
	public MDM_T01(){
		super();
	}

	public static MDM_T01 CLASS;
	static{
		CLASS = new MDM_T01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

