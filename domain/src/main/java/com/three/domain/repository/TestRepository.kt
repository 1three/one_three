package com.three.domain.repository

import com.three.domain.model.TestModel

interface TestRepository {
    fun getTestData(): TestModel?
}

// data module : 위 레포지토리(인터페이스)를 가져다 사용
// domain module : 어떤 모듈도 참조 불가