package hl7.pseudo.message;

import hl7.bean.Structure;

public class CRM_C01 extends hl7.model.V2_7.message.CRM_C01{
	public CRM_C01(){
		super();
	}

	public static CRM_C01 CLASS;
	static{
		CLASS = new CRM_C01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

