package com.quovantis.program.reverselinklist;

class LinkedList {
    public LinkedList next;
    public int value;
 
    public LinkedList(int value) {
        this.value = value;
        this.next = null;
    }
 
    @Override
    public String toString() {
 
        String data = "";
        LinkedList current = this;
        do {
            data += current.value + ",";
            current = current.next;
        } while (current != null);
 
        return data;
    }
}

