package com.three.data.datasource

import com.three.domain.model.TempModel
import javax.inject.Inject

class TempDataSource @Inject constructor() {
    fun getTempModel() : TempModel {
        return TempModel("temp response through api or database")
    }
}