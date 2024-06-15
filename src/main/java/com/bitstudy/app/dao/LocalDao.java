package com.bitstudy.app.dao;

import com.bitstudy.app.domain.LocalDto;

import java.util.List;

public interface LocalDao {
    // <!--    4. 메인페이지 네비 4개 중 하나에 다 뽑아주려고 -->
    List<LocalDto> selecLocal();
}
