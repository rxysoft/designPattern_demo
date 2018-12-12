package com.rxysoft.adapterPattern;

/**
 * 使用组合的方式实现二相转三相的适配器
 * @author Administrator
 *
 */
public class TwoPlugAdapterWithCombination implements IThreePlug{

	private GBTwoPlug gBTwoPlug;
	
	public TwoPlugAdapterWithCombination(GBTwoPlug gBTwoPlug){
		this.gBTwoPlug=gBTwoPlug;
	}
	
	@Override
	public void powerWithThree() {
		System.out.println("通过组合方式二相适配器转换");
		gBTwoPlug.powerWithTWo();
	}

}
