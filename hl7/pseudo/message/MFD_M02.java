package hl7.pseudo.message;

import hl7.bean.Structure;

public class MFD_M02 extends hl7.model.V2_2.message.MFD_M02{
	public MFD_M02(){
		super();
	}

	public static MFD_M02 CLASS;
	static{
		CLASS = new MFD_M02();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

