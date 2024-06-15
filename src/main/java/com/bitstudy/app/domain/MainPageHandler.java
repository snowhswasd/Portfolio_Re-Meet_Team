package com.bitstudy.app.domain;

public class MainPageHandler {
    private Integer page;
    private Integer pageSize = 12 ;
    private Integer totalCount;
    private Integer totalPage;
    private Integer navPage = 5 ;
    private Integer startPage;
    private Integer endPage;

    private boolean showPrevBtn;
    private boolean showNextbtn;


    public MainPageHandler() {
    }

    public MainPageHandler(Integer page, Integer totalCount) {
        this.page = page;
        this.totalCount = totalCount;

        totalPage = (int)Math.ceil(totalCount / (double)pageSize);
        startPage = (page - 1) / navPage * navPage + 1;
        endPage =  Math.min((startPage + navPage - 1), totalPage);

        showPrevBtn = startPage != 1;
        showNextbtn = endPage != totalPage;
    }




    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getNavPage() {
        return navPage;
    }

    public void setNavPage(Integer navPage) {
        this.navPage = navPage;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    public boolean isShowPrevBtn() {
        return showPrevBtn;
    }

    public void setShowPrevBtn(boolean showPrevBtn) {
        this.showPrevBtn = showPrevBtn;
    }

    public boolean isShowNextbtn() {
        return showNextbtn;
    }

    public void setShowNextbtn(boolean showNextbtn) {
        this.showNextbtn = showNextbtn;
    }

    @Override
    public String toString() {
        return "MainPageHandler{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", navPage=" + navPage +
                ", startPage=" + startPage +
                ", endPage=" + endPage +
                ", showPrevBtn=" + showPrevBtn +
                ", showNextbtn=" + showNextbtn +
                '}';
    }

    public void print() {
        System.out.println(showPrevBtn?"[Prev]":"");

        for(int i = startPage; i<=endPage; i++) {
            System.out.println(" " + i + " ");
        }

        System.out.println(showNextbtn?"[Next]":"");
    }

}
