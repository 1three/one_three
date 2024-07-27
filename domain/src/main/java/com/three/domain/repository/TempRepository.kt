package com.three.domain.repository

import com.three.domain.model.TempModel

interface TempRepository {
    fun getTempModel(): TempModel
}