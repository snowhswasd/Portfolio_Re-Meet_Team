package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Small_cateDto;

import java.util.List;

public interface Small_cateDao {
    //<!--  대분류 불러오기 -->
    List<Small_cateDto> select_smallCate();

    //
    List<Small_cateDto> select_smallCate2(Integer aaa);
}
