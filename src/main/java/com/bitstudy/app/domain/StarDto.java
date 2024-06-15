package com.bitstudy.app.domain;


public class StarDto {
    private Integer S_seqno = null;
    private Integer FK_M_seqno;
    private String S_writer;
    private Integer S_count;
    private Integer S_point;
    private Double S_point_AVG;


    public StarDto() {

    }

    public StarDto(Integer fk_M_seqno, String s_writer,Integer s_point) {
        FK_M_seqno = fk_M_seqno;
        S_writer = s_writer;
        S_point = s_point;
    }


    /*<!--7-4. 별점테이블 모임번호 그룹화해서 그 수 뽑아서 저장하고 거기있는 모임번호 별점(평균) 카운트 뽑아오기-->*/
    public StarDto(Integer fk_M_seqno, Integer s_count, Double s_point_AVG) {
        FK_M_seqno = fk_M_seqno;
        S_count = s_count;
        S_point_AVG = s_point_AVG;
    }

    public Integer getS_seqno() {
        return S_seqno;
    }

    public void setS_seqno(Integer s_seqno) {
        S_seqno = s_seqno;
    }

    public Integer getFK_M_seqno() {
        return FK_M_seqno;
    }

    public void setFK_M_seqno(Integer FK_M_seqno) {
        this.FK_M_seqno = FK_M_seqno;
    }

    public String getS_writer() {
        return S_writer;
    }

    public void setS_writer(String s_writer) {
        S_writer = s_writer;
    }

    public Integer getS_count() {
        return S_count;
    }

    public void setS_count(Integer s_count) {
        S_count = s_count;
    }

    public Integer getS_point() {
        return S_point;
    }

    public void setS_point(Integer s_point) {
        S_point = s_point;
    }

    public Double getS_point_AVG() {
        return S_point_AVG;
    }

    public void setS_point_AVG(Double s_point_AVG) {
        S_point_AVG = s_point_AVG;
    }
}
