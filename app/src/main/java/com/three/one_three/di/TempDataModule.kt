package com.three.one_three.di

import com.three.data.repository.TempRepositoryImpl
import com.three.domain.repository.TempRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface TempDataModule {

    @Binds
    @Singleton
    fun bindTempRepository(tempRepository: TempRepositoryImpl): TempRepository
}