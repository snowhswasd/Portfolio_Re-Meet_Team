package com.bitstudy.app.domain;

public class HeartDto {
    private Integer H_seqno = null;
    private Integer FK_M_seqno;
    private String H_writer;
    private Integer H_count;


    public HeartDto() {
    }

    public HeartDto(Integer fk_M_seqno, String h_writer) {
        FK_M_seqno = fk_M_seqno;
        H_writer = h_writer;
    }



    /*<!---7-2 미팅의 하트 업데이트 하기 위해 뽑아 오는 쿼리문-->*/
    public HeartDto(Integer fk_M_seqno, Integer h_count) {
        FK_M_seqno = fk_M_seqno;
        H_count = h_count;
    }

    public Integer getH_seqno() {
        return H_seqno;
    }

    public void setH_seqno(Integer h_seqno) {
        H_seqno = h_seqno;
    }

    public Integer getFK_M_seqno() {
        return FK_M_seqno;
    }

    public void setFK_M_seqno(Integer fk_M_seqno) {
        FK_M_seqno = fk_M_seqno;
    }

    public String getH_writer() {
        return H_writer;
    }

    public void setH_writer(String h_writer) {
        H_writer = h_writer;
    }

    public Integer getH_count() {
        return H_count;
    }

    public void setH_count(Integer h_count) {
        H_count = h_count;
    }

    @Override
    public String toString() {
        return "HeartDto{" +
                "H_seqno=" + H_seqno +
                ", FK_M_seqno=" + FK_M_seqno +
                ", H_writer='" + H_writer + '\'' +
                ", H_count=" + H_count +
                '}';
    }
}
