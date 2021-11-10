package com.example.exlogin;

public class datamodel {

    String header,desc;

    public datamodel(String header, String desc) {
        this.desc = header;
        this.desc = desc;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
