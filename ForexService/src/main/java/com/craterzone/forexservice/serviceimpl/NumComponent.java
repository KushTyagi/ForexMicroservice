package com.craterzone.forexservice.serviceimpl;

public class NumComponent {

	private int num;

	public NumComponent(int num) {
		super();
		this.num = num;
	}
	
	Number numb = new Number() {
		
		@Override
		public long longValue() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int intValue() {
			// TODO Auto-generated method stub
			return num;
		}
		
		@Override
		public float floatValue() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public double doubleValue() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
}
