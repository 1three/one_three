package com.three.data.model

import com.three.domain.model.TestModel

class TestModelResponse(val name: String?)

fun TestModelResponse.toDomainModel(): TestModel? {
    return if (name != null) {
        TestModel(name)
    } else {
        null
    }
}

// 서버로부터 데이터를 응답 받는다고 가정
// TestModel → DomainModel 변경하는 extension 생성
// 왜 DomainModel로 변경?

// null 처리
// 1. 상황
// dataSource를 통해 값을 가져올 때 API (혹은 상황)에 따라 필드 값이 채워지지 않을 가능성 존재
// non-null 약속하더라도 예외 발생 가능
// 2. 해결
// ? (nullable)
// if (조건문)을 통한 null check