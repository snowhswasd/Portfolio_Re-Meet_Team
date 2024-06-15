package com.bitstudy.app.domain;


public class Meeting_memberDto {
    private Integer MM_seqno=null;
    private Integer FK_M_seqno;
    private String id;


    public Meeting_memberDto() {
        this(0,"");
    }

    public Meeting_memberDto(Integer fk_M_seqno, String id) {
        FK_M_seqno = fk_M_seqno;
        this.id = id;
    }

    public Integer getReg_seqno() {
        return MM_seqno;
    }

    public void setReg_seqno(Integer MM_seqno) {
        this.MM_seqno = MM_seqno;
    }

    public Integer getFK_M_seqno() {
        return FK_M_seqno;
    }

    public void setFK_M_seqno(Integer fk_M_seqno) {
        FK_M_seqno = fk_M_seqno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}
