package com.three.domain.usecase

import com.three.domain.model.TempModel
import com.three.domain.repository.TempRepository
import javax.inject.Inject

class TempUseCase @Inject constructor(private val repository: TempRepository) {

    fun getTempModel() : TempModel {
        return repository.getTempModel()
    }
}