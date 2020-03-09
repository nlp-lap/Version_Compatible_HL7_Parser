package hl7.pseudo.message;

import hl7.bean.Structure;

public class QRY_PCE extends hl7.model.V2_31.message.QRY_PCE{
	public QRY_PCE(){
		super();
	}

	public static QRY_PCE CLASS;
	static{
		CLASS = new QRY_PCE();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

