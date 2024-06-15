package com.bitstudy.app.domain;

public class UserDto {
    private Integer u_seqno=null;
    private String id;
    private String pw;
    private  String gender;
    private  String FK_BC_cate;
    private String name;
    private  String hopeLocal;
    private String birth;

    public UserDto() {
        this("","","","","","","");
    }

    public UserDto(String id, String pw, String gender, String FK_BC_cate, String name, String hopeLocal, String birth) {
        this.id = id;
        this.pw = pw;
        this.gender = gender;
        this.FK_BC_cate = FK_BC_cate;
        this.name = name;
        this.hopeLocal = hopeLocal;
        this.birth = birth;
    }

    public Integer getU_seqno() {
        return u_seqno;
    }

    public void setU_seqno(Integer u_seqno) {
        this.u_seqno = u_seqno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFK_BC_cate() {
        return FK_BC_cate;
    }

    public void setFK_BC_cate(String FK_BC_cate) {
        this.FK_BC_cate = FK_BC_cate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHopeLocal() {
        return hopeLocal;
    }

    public void setHopeLocal(String hopeLocal) {
        this.hopeLocal = hopeLocal;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }


    @Override
    public String toString() {
        return "UserDto{" +
                "u_seqno=" + u_seqno +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", gender='" + gender + '\'' +
                ", FK_BC_cate='" + FK_BC_cate + '\'' +
                ", name='" + name + '\'' +
                ", hopeLocal='" + hopeLocal + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
