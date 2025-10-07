package edu.miu.midterm.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.miu.midterm.data.ImageRepository
import edu.miu.midterm.data.ImageRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideImageRepository(): ImageRepository = ImageRepositoryImpl()

}