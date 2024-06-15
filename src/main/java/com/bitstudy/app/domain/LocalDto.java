package com.bitstudy.app.domain;

public class LocalDto {
    private Integer L_seqno=null;
    private String L_name;

    public LocalDto() {
        this("");
    }

    public LocalDto(String l_name) {
        L_name = l_name;
    }

    public int getL_seqno() {
        return L_seqno;
    }

    public void setL_seqno(int l_seqno) {
        L_seqno = l_seqno;
    }

    public String getL_name() {
        return L_name;
    }

    public void setL_name(String l_name) {
        L_name = l_name;
    }

    @Override
    public String toString() {
        return "LocalDto{" +
                "L_seqno=" + L_seqno +
                ", L_name='" + L_name + '\'' +
                '}';
    }
}
