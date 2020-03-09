package hl7.pseudo.message;

import hl7.bean.Structure;

public class PTR_PCF extends hl7.model.V2_7.message.PTR_PCF{
	public PTR_PCF(){
		super();
	}

	public static PTR_PCF CLASS;
	static{
		CLASS = new PTR_PCF();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

