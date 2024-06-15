package com.bitstudy.app.domain;

public class SearchDto {
    private  String Keyword;
    private String L_option  =null ;
    private String BC_option  =null ;
    private String SC_option1  =null ;
    private String SC_option2  =null ;
    private String SC_option3  =null ;
    private String SC_option4  =null ;
    private String SC_option5  =null ;
    private Integer searchStar  =0 ;
    private Integer searchlastTime;
    private String H_writer = null;
    private  Integer offset;


    public SearchDto() {
    }

    public SearchDto(String keyword, String l_option, String BC_option, String SC_option1, String SC_option2, String SC_option3, String SC_option4, String SC_option5, Integer searchStar, Integer searchlastTime) {
        Keyword = keyword;
        L_option = l_option;
        this.BC_option = BC_option;
        this.SC_option1 = SC_option1;
        this.SC_option2 = SC_option2;
        this.SC_option3 = SC_option3;
        this.SC_option4 = SC_option4;
        this.SC_option5 = SC_option5;
        this.searchStar = searchStar;
        this.searchlastTime = searchlastTime;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public String getL_option() {
        return L_option;
    }

    public void setL_option(String l_option) {
        L_option = l_option;
    }

    public String getBC_option() {
        return BC_option;
    }

    public void setBC_option(String BC_option) {
        this.BC_option = BC_option;
    }

    public String getSC_option1() {
        return SC_option1;
    }

    public void setSC_option1(String SC_option1) {
        this.SC_option1 = SC_option1;
    }

    public String getSC_option2() {
        return SC_option2;
    }

    public void setSC_option2(String SC_option2) {
        this.SC_option2 = SC_option2;
    }

    public String getSC_option3() {
        return SC_option3;
    }

    public void setSC_option3(String SC_option3) {
        this.SC_option3 = SC_option3;
    }

    public String getSC_option4() {
        return SC_option4;
    }

    public void setSC_option4(String SC_option4) {
        this.SC_option4 = SC_option4;
    }

    public String getSC_option5() {
        return SC_option5;
    }

    public void setSC_option5(String SC_option5) {
        this.SC_option5 = SC_option5;
    }

    public Integer getSearchStar() {
        return searchStar;
    }

    public void setSearchStar(Integer searchStar) {
        this.searchStar = searchStar;
    }

    public Integer getSearchlastTime() {
        return searchlastTime;
    }

    public void setSearchlastTime(Integer searchlastTime) {
        this.searchlastTime = searchlastTime;
    }

    public String getH_writer() {return H_writer;}

    public void setH_writer(String h_writer) {H_writer = h_writer;}

    @Override
    public String toString() {
        return "SearchDto{" +
                "Keyword='" + Keyword + '\'' +
                ", L_option='" + L_option + '\'' +
                ", BC_option='" + BC_option + '\'' +
                ", SC_option1='" + SC_option1 + '\'' +
                ", SC_option2='" + SC_option2 + '\'' +
                ", SC_option3='" + SC_option3 + '\'' +
                ", SC_option4='" + SC_option4 + '\'' +
                ", SC_option5='" + SC_option5 + '\'' +
                ", searchStar=" + searchStar +
                ", searchlastTime=" + searchlastTime +
                ", H_writer='" + H_writer + '\'' +
                ", offset=" + offset +
                '}';
    }
}
