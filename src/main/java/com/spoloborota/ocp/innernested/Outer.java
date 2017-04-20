package com.spoloborota.ocp.innernested;

public class Outer {
	
	
	private void Outer() { }
	private class Inner {
		public Inner () {}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private int length = (int) System.currentTimeMillis();
	public void calculate() {
		int width = length;
		class Inner {
			public void multiply() {
				System. out .println(length * width);
			}
		}
		Inner inner = new Inner();
		inner.multiply();
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.calculate();
	}
	
	
	class InnerInner extends Outer {
		static final int x = 10;
	}
	
	static class StaticClass {
		static class Xxx {}
		
		class InStatic {
//			static final void doSmth() {}
//			static class Xxx {}
			class Xxx {}
		}
		
		static final void doSmth() {}
	}
}
