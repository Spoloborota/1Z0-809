package com.spoloborota.ocp.innernested;


class OuterWorld
{
	public InnerPeace i = new InnerPeace();
	private class InnerPeace
	{  
		private String reason = "none";
	}
	
	public static void main(String[] args) {
		System.out.println(new OuterWorld().i.reason);
	}
}

