package com.three.data.repository

import com.three.data.datasource.TempDataSource
import com.three.domain.model.TempModel
import com.three.domain.repository.TempRepository
import javax.inject.Inject

class TempRepositoryImpl @Inject constructor(private val dataSource: TempDataSource): TempRepository {

    override fun getTempModel(): TempModel {
        return dataSource.getTempModel()
    }
}