package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Big_cateDto;

import java.util.List;

public interface Big_cateDao {
    // <!--  5. 대분류 불러오기 -->
    List<Big_cateDto> select_bigCate();
}
