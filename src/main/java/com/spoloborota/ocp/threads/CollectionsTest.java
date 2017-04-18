package com.spoloborota.ocp.threads;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;


public class CollectionsTest {

	static ConcurrentHashMap<String, Object> chm = new ConcurrentHashMap<String, Object>();

	public static void main(String[] args) {
		chm.put("a", "aaa");
		chm.put("b", "bbb");
		chm.put("c", "ccc");

		new Thread(){
			public void run(){
				Iterator<Entry<String, Object>> it = CollectionsTest.chm.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, Object> en = it.next();
					if(en.getKey().equals("a") || en.getKey().equals("b")){
						it.remove();
					}
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

		new Thread(){
			public void run(){
				Iterator<Entry<String, Object>> it = CollectionsTest.chm.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, Object> en = it.next();
					System.out.print(en.getKey()+", ");
				}
			}
		}.start();        
	}

}
