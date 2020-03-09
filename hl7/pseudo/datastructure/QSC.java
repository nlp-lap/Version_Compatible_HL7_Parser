package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class QSC extends hl7.model.V2_7.datastructure.QSC{
	public QSC(){
		super();
	}
	
	public static QSC CLASS;
	static{
		CLASS = new QSC();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
