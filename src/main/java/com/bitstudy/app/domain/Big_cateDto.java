package com.bitstudy.app.domain;

public class Big_cateDto {
    private Integer BC_seqno = null;
    private String BC_name;

    public Big_cateDto() {
        this("");
    }

    public Big_cateDto(String BC_name) {
        this.BC_name = BC_name;
    }

    public Integer getBC_seqno() {
        return BC_seqno;
    }

    public void setBC_seqno(Integer BC_seqno) {
        this.BC_seqno = BC_seqno;
    }

    public String getBC_name() {
        return BC_name;
    }

    public void setBC_name(String BC_name) {
        this.BC_name = BC_name;
    }

    @Override
    public String toString() {
        return "Big_cateDto{" +
                "BC_seqno=" + BC_seqno +
                ", BC_name='" + BC_name + '\'' +
                '}';
    }
}
