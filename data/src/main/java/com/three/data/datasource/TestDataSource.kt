package com.three.data.datasource

import com.three.data.model.TestModelResponse

class TestDataSource {
    fun getTestModelResponse() : TestModelResponse {
        return TestModelResponse("test response")
    }
}