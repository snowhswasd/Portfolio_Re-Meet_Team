package com.bitstudy.app.domain;

public class Meeting_detail_imgDto {
    private Integer MDI_seqno =null;
    private Integer FK_M_seqno;
    private String MDI_image;

    public Meeting_detail_imgDto() {
        this(0,"");
    }

    public Meeting_detail_imgDto(Integer fk_M_seqno, String MDI_image) {
        FK_M_seqno = fk_M_seqno;
        this.MDI_image = MDI_image;
    }

    public Integer getMDI_seqno() {
        return MDI_seqno;
    }

    public void setMDI_seqno(Integer MDI_seqno) {
        this.MDI_seqno = MDI_seqno;
    }

    public Integer getFK_M_seqno() {
        return FK_M_seqno;
    }

    public void setFK_M_seqno(Integer fk_M_seqno) {
        FK_M_seqno = fk_M_seqno;
    }

    public String getMDI_image() {
        return MDI_image;
    }

    public void setMDI_image(String MDI_image) {
        this.MDI_image = MDI_image;
    }

    @Override
    public String toString() {
        return "Meeting_detail_imgDto{" +
                "MDI_seqno=" + MDI_seqno +
                ", FK_M_seqno=" + FK_M_seqno +
                ", MDI_image='" + MDI_image + '\'' +
                '}';
    }
}


