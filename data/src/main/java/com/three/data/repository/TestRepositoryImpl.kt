package com.three.data.repository

import com.three.data.datasource.TestDataSource
import com.three.data.model.toDomainModel
import com.three.domain.model.TestModel
import com.three.domain.repository.TestRepository

class TestRepositoryImpl(val dataSource: TestDataSource): TestRepository {
    override fun getTestData(): TestModel? {
        // return TestModel("test")
        // dataSource 파라미터 추가됨에 따라 아래와 같이 수정
        return dataSource.getTestModelResponse().toDomainModel()
    }
}

// domain module의 TestRepository(인터페이스)를 가져오기 위해 gradle 의존성 추가
// data layer → domain layer 참조 가능
// domain layer : 어떤 레이어도 참조 불가