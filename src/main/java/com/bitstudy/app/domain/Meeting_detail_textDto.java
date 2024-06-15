package com.bitstudy.app.domain;


public class Meeting_detail_textDto {

    private Integer MDT_seqno = null;
    private Integer FK_M_seqno;
    private String MDT_content;
    private String id;

    public Meeting_detail_textDto() {
    }

    public Meeting_detail_textDto(Integer FK_M_seqno, String MDT_content, String id) {
        this.FK_M_seqno = FK_M_seqno;
        this.MDT_content = MDT_content;
        this.id = id;
    }

    public Integer getMDT_seqno() {
        return MDT_seqno;
    }

    public void setMDT_seqno(Integer MDT_seqno) {
        this.MDT_seqno = MDT_seqno;
    }

    public Integer getFK_M_seqno() {
        return FK_M_seqno;
    }

    public void setFK_M_seqno(Integer FK_M_seqno) {
        this.FK_M_seqno = FK_M_seqno;
    }

    public String getMDT_content() {
        return MDT_content;
    }

    public void setMDT_content(String MDT_content) {
        this.MDT_content = MDT_content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Meeting_detail_textDto{" +
                "MDT_seqno=" + MDT_seqno +
                ", FK_M_seqno=" + FK_M_seqno +
                ", MDT_content='" + MDT_content + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}









