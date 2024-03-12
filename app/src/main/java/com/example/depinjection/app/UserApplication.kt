package com.example.depinjection.app

import android.app.Application
import com.example.depinjection.repository.UserRepository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application() {

//    @Inject
//    lateinit var userRepository: UserRepository;

    override fun onCreate() {
        super.onCreate()

//        userRepository.saveUserData()

    }

}