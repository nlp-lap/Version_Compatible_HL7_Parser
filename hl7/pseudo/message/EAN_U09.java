package hl7.pseudo.message;

import hl7.bean.Structure;

public class EAN_U09 extends hl7.model.V2_7.message.EAN_U09{
	public EAN_U09(){
		super();
	}

	public static EAN_U09 CLASS;
	static{
		CLASS = new EAN_U09();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

