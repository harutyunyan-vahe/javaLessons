package com.vahe.voletail;

public class VoletailTest {
    /*Computers with multiple processors can temporarily hold memory values in
    registers or local memory caches. As a consequence, threads running in
    different processors may see different values for the same memory location!
            •
    Compilers can reorder instructions for maximum throughput. Compilers
    won’t choose an ordering that changes the meaning of the code, but they make
    the assumption that memory values are only changed when there are explicit
    instructions in the code. However, a memory value can be changed by another
    thread!*/

    private boolean done;

    public synchronized boolean isDone() {
        return done;
    }

    public synchronized void setDone() {
        done = true;
    }
}
