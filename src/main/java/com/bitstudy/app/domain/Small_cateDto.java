package com.bitstudy.app.domain;

public class Small_cateDto {
    private Integer SC_seqno =null;
    private Integer FK_BC_cate;
    private String SC_name;


    public Small_cateDto() {
        this(0,"");
    }

    public Small_cateDto(Integer FK_BC_cate, String SC_name) {
        this.FK_BC_cate = FK_BC_cate;
        this.SC_name = SC_name;
    }

    public Integer getSC_seqno() {
        return SC_seqno;
    }

    public void setSC_seqno(Integer SC_seqno) {
        this.SC_seqno = SC_seqno;
    }

    public Integer getFK_BC_cate() {
        return FK_BC_cate;
    }

    public void setFK_BC_cate(Integer FK_BC_cate) {
        this.FK_BC_cate = FK_BC_cate;
    }

    public String getSC_name() {
        return SC_name;
    }

    public void setSC_name(String SC_name) {
        this.SC_name = SC_name;
    }

    @Override
    public String toString() {
        return "Small_cateDto{" +
                "SC_seqno=" + SC_seqno +
                ", FK_BC_cate=" + FK_BC_cate +
                ", SC_name='" + SC_name + '\'' +
                '}';
    }
}

