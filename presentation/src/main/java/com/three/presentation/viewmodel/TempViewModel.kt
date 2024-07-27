package com.three.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.three.domain.model.TempModel
import com.three.domain.usecase.TempUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TempViewModel @Inject constructor(private val useCase: TempUseCase) : ViewModel() {

    fun getTempModel(): TempModel {
        return useCase.getTempModel()
    }
}