package com.designs;

interface BrandType{
	abstract void anyBrandType();
}

abstract class Brands{
	protected BrandType brand1;
	protected BrandType brand2;
	
	public Brands(BrandType type1, BrandType type2) {
		this.brand1 = type1;
		this.brand2 = type2;
		
	}
	public abstract void designCompany();
}

class OriginalBrand implements BrandType{

	@Override
	public void anyBrandType() {
		System.out.println("Original");
		
	}
	
}

class CopyBrand implements BrandType{

	@Override
	public void anyBrandType() {
		System.out.println("Clone");
		
	}
	
}

class AppleB1 extends Brands{

	public AppleB1(BrandType type1, BrandType type2) {
		super(type1, type2);
	}

	@Override
	public void designCompany() {
		System.out.println("Apple India");
		
		brand1.anyBrandType();
		brand2.anyBrandType();
		
	}
	
}

class DellB1 extends Brands{

	public DellB1(BrandType type1, BrandType type2) {
		super(type1, type2);
	}

	@Override
	public void designCompany() {
		System.out.println("Dell India");
		
		brand1.anyBrandType();
		brand2.anyBrandType();
		
	}
	
}

class ProductStatus implements BrandType{

	@Override
	public void anyBrandType() {
		System.out.println("Completed");
		
	}
	
}

class ProductDelivered implements BrandType{

	@Override
	public void anyBrandType() {
		System.out.println("Delivered");
		
	}
	
}
public class BridgeDemo {

	public static void main(String[] args) {
		Brands obj1 = new AppleB1(new ProductStatus(), new ProductDelivered());
		Brands obj2 = new DellB1(new ProductStatus(), new ProductDelivered());
		obj1.designCompany();
		obj2.designCompany();

	}

}
