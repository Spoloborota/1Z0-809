package com.spoloborota.ocp.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomics {

    public AtomicInteger status = new AtomicInteger(0);
    


    public void valuate() {
        int oldstatus = status.get();
//        int newstatus = status.compareAndSet(10, 20);//determine new status

        
    }

}
