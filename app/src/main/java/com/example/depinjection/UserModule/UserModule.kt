package com.example.depinjection.UserModule

import com.example.depinjection.repository.LocalRepository
import com.example.depinjection.repository.RemoteRepository
import com.example.depinjection.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    // --->>> provides
//    @Provides
//    fun provideUserRepository(): UserRepository {
//        return RemoteRepository()
//    }

    // --->>> Qualifiers
    @Provides
    @Named("local")
    fun provideLocalRepository(localRepository: LocalRepository): UserRepository {
        return localRepository
    }

    @Provides
    @Named("remote")
    fun provideRemoteRepository(): UserRepository {
        return RemoteRepository()
    }

    // ---->>>
//    @Binds
//    abstract fun bindUserRepository(localRepository: LocalRepository): UserRepository

}