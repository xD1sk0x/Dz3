package org.example;
public class Str {
    private String[] container;
    private int space;
    private int len;

    public Str(){
        container = new String[8];
        space = 8;
        len = 0;
    }

    public void push(String toadd){
        if (space <= len){
            String[] tmp = new String[space * 2];
            for(int i = 0; i < space; ++i){
                tmp[i] = container[i];
            }
            container = tmp;
            space *= 2;
        }
        container[len++] = new String(toadd);
        int pos = len - 1;
        while( (pos >= 1) && (container[pos-1].length() > container[pos].length())){
            String tmp;
            tmp = container[pos-1];
            container[pos-1] = container[pos];
            container[pos] = tmp;
            --pos;
        }
    }

    public String max(){
        return new String(container[len- 1] );
    }

    public float avg(){
        int sum = 0;
        for(int i = 0; i < len; ++i){
            sum += container[i].length();
        }
        return sum/len;
    }

    public String toString(){
        String str = "Contents of list:\n";
        for(int i = 0; i < len; ++i){
            str += "..." + container[i] + "...";
            if(i != len-1) str += "\n";
        }
        return str;
    }
}
