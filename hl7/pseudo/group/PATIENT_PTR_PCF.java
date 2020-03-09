package hl7.pseudo.group;

import hl7.bean.Structure;

public class PATIENT_PTR_PCF extends hl7.model.V2_7.group.PATIENT_PTR_PCF{
	public PATIENT_PTR_PCF(){
		super();
	}

	public static PATIENT_PTR_PCF CLASS;
	static{
		CLASS = new PATIENT_PTR_PCF();
	}


	public Structure[][] getComponents(){
		return super.getComponents();
	}
}

