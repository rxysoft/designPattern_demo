package com.rxysoft.adapterPattern;

/**
 * 采用继承方式的插座适配器
 * @author Administrator
 *
 */
public class TwoPlugAdapterWithExtend extends GBTwoPlug implements IThreePlug {

	@Override
	public void powerWithThree() {
		System.out.println("通过继承方式二相适配器转换");
		super.powerWithTWo();
	}
	
}
