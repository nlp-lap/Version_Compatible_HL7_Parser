package hl7.pseudo.group;

import hl7.bean.Structure;

public class PATIENT_ORM_O01 extends hl7.model.V2_6.group.PATIENT_ORM_O01{
	public PATIENT_ORM_O01(){
		super();
	}

	public static PATIENT_ORM_O01 CLASS;
	static{
		CLASS = new PATIENT_ORM_O01();
	}


	public Structure[][] getComponents(){
		return super.getComponents();
	}
}

