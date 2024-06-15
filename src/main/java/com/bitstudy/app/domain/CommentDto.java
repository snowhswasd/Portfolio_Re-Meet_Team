package com.bitstudy.app.domain;

import java.util.Date;

public class CommentDto {
    private Integer C_seqno =null;
    private Integer FK_M_seqno;
    private String C_writer;
    private String C_text;
    private Date C_reg_date = null;

    public CommentDto() {
        this(0,"","");
    }

    public CommentDto(Integer fk_M_seqno, String c_writer, String c_text) {
        FK_M_seqno = fk_M_seqno;
        C_writer = c_writer;
        C_text = c_text;
    }

    public String getC_text() {
        return C_text;
    }

    public void setC_text(String c_text) {
        C_text = c_text;
    }

    public Integer getC_seqno() {
        return C_seqno;
    }

    public void setC_seqno(Integer c_commentseqno) {
        C_seqno = c_commentseqno;
    }

    public Integer getFK_M_seqno() {
        return FK_M_seqno;
    }

    public void setFK_M_seqno(Integer fk_M_seqno) {
        FK_M_seqno = fk_M_seqno;
    }

    public String getC_writer() {
        return C_writer;
    }

    public void setC_writer(String c_writer) {
        C_writer = c_writer;
    }

    public Date getC_reg_date() {
        return C_reg_date;
    }

    public void setC_reg_date(Date c_reg_date) {
        C_reg_date = c_reg_date;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "C_seqno=" + C_seqno +
                ", FK_M_seqno=" + FK_M_seqno +
                ", C_writer='" + C_writer + '\'' +
                ", C_text='" + C_text + '\'' +
                ", C_reg_date=" + C_reg_date +
                '}';
    }
}
