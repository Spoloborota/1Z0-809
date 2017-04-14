package com.spoloborota.ocp.enums;

public enum Season {
	WINTER("winter") {
		
		int xxx = 0;
		
		class XXX {}
		
		@Override
		void dodo() {
			// TODO Auto-generated method stub
			
		}
	}, SPRING("spring") {
		@Override
		void dodo() {
			// TODO Auto-generated method stub
			
		}
	}, SUMMER("summer") {
		
		public void doS(){}
		
		{
			System.out.println("XXX");
		}

		@Override
		void dodo() {
			// TODO Auto-generated method stub
			
		}
	}, FALL("fall") {
		@Override
		void dodo() {
			// TODO Auto-generated method stub
			
		}
	};
	
	String s;
	
	Season(String s) {
		this.s = s;
	}
	
	abstract void dodo();
	
	static class TestSeason {
		public static void main(String[] args) {
			for (Season s : Season.values()) {
				System.out.println(s.getClass() + " " + s.name() + " " + s.ordinal() + " " + s.hashCode());
			}
			
		}
	}
}
