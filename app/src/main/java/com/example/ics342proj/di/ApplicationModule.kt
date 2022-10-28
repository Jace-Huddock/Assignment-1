package com.example.ics342proj.di

import com.example.ics342proj.data.CurrentConditions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ApplicationModule {

    @Provides
    fun provideCurrentConditions(): CurrentConditions {
        return CurrentConditions(90f,"St. Paul, MN")
    }
}