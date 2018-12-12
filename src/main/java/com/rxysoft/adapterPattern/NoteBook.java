package com.rxysoft.adapterPattern;

public class NoteBook {
	private IThreePlug iThreePlug;
	
	public NoteBook(IThreePlug iThreePlug){
		this.iThreePlug=iThreePlug;
	}
	
	public void charge(){
		iThreePlug.powerWithThree();
	}
	
	//测试主函数
	public static void main(String args[]) {
		GBTwoPlug plug=new GBTwoPlug();
		//组合方式
		TwoPlugAdapterWithCombination adapter=new TwoPlugAdapterWithCombination(plug);
		NoteBook nb=new NoteBook(adapter);
		nb.charge();
		System.out.println("++++++++++++++++++++++++");
		//继承方式
		TwoPlugAdapterWithExtend adapter2=new TwoPlugAdapterWithExtend();
		NoteBook nb2=new NoteBook(adapter2);
		nb2.charge();
	}
}
