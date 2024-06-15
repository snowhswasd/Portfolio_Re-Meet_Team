package com.bitstudy.app.domain;

import java.util.Date;

public class MeetingDto {
    private Integer M_seqno = null;
    private String M_local;
    private String  FK_BC_cate;
    private String FK_SC_cate;
    private String M_name;
    private Integer M_limit;
    private String M_writer;
    private Double M_starPoint = 0.0;
    private Integer M_starCount =0;
    private Integer M_heart = 0;
    private Date M_reg_date;
    private String M_titleImg;
    private String H_writer = null;


    public MeetingDto() {
        this("","","","",0,"");
    }

    public MeetingDto(String m_local, String FK_BC_cate, String FK_SC_cate, String m_name, Integer m_limit, String m_writer) {
        M_local = m_local;
        this.FK_BC_cate = FK_BC_cate;
        this.FK_SC_cate = FK_SC_cate;
        M_name = m_name;
        M_limit = m_limit;
        M_writer = m_writer;
    }

    public Integer getM_seqno() {
        return M_seqno;
    }

    public void setM_seqno(Integer m_seqno) {
        M_seqno = m_seqno;
    }

    public String getM_local() {
        return M_local;
    }
    public void setM_local(String m_local) {
        M_local = m_local;
    }

    public String getFK_BC_cate() {
        return FK_BC_cate;
    }

    public void setFK_BC_cate(String FK_BC_cate) {
        this.FK_BC_cate = FK_BC_cate;
    }

    public String getFK_SC_cate() {
        return FK_SC_cate;
    }

    public void setFK_SC_cate(String FK_SC_cate) {
        this.FK_SC_cate = FK_SC_cate;
    }

    public String getM_name() {
        return M_name;
    }

    public void setM_name(String m_name) {
        M_name = m_name;
    }

    public Integer getM_limit() {
        return M_limit;
    }

    public void setM_limit(Integer m_limit) {
        M_limit = m_limit;
    }

    public String getM_writer() {
        return M_writer;
    }

    public void setM_writer(String m_writer) {
        M_writer = m_writer;
    }

    public Double getM_starPoint() {
        return M_starPoint;
    }

    public void setM_starPoint(Double m_starPoint) {
        M_starPoint = m_starPoint;
    }

    public Integer getM_starCount() {
        return M_starCount;
    }

    public void setM_starCount(Integer m_starcount) {
        M_starCount = m_starcount;
    }

    public Integer getM_heart() {
        return M_heart;
    }

    public void setM_heart(Integer m_heart) {
        M_heart = m_heart;
    }

    public Date getReg_date() {
        return M_reg_date;
    }

    public void setReg_date(Date M_reg_date) {
        this.M_reg_date = M_reg_date;
    }

    public String getM_titleImg() {
        return M_titleImg;
    }

    public void setM_titleImg(String m_titleImg) {
        M_titleImg = m_titleImg;
    }

    public Date getM_reg_date() {return M_reg_date;}

    public void setM_reg_date(Date m_reg_date) {M_reg_date = m_reg_date;}

    public String getH_writer() {return H_writer;}

    public void setH_writer(String h_writer) {H_writer = h_writer;}

    @Override
    public String toString() {
        return "MeetingDto{" +
                "M_seqno=" + M_seqno +
                ", M_local='" + M_local + '\'' +
                ", FK_BC_cate='" + FK_BC_cate + '\'' +
                ", FK_SC_cate='" + FK_SC_cate + '\'' +
                ", M_name='" + M_name + '\'' +
                ", M_limit=" + M_limit +
                ", M_writer='" + M_writer + '\'' +
                ", M_starPoint=" + M_starPoint +
                ", M_starCount=" + M_starCount +
                ", M_heart=" + M_heart +
                ", M_reg_date=" + M_reg_date +
                ", M_titleImg='" + M_titleImg + '\'' +
                ", H_writer='" + H_writer + '\'' +
                '}';
    }
}
