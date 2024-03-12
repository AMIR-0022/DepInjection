package com.example.depinjection.repository

import android.util.Log
import com.example.depinjection.services.LoggerServices
import javax.inject.Inject

//class UserRepository @Inject constructor(){
//    fun saveUserData (){
//        Log.d("User", "user data saved to server");
//    }
//}

//class UserRepository @Inject constructor(val loggerServices: LoggerServices){
//    fun saveUserData (){
//        loggerServices.log("User Saved to Server DB")
//    }
//}

interface UserRepository {
    fun saveUserInfo (name: String, email: String)
}

// to store data in SQL
class LocalRepository @Inject constructor() : UserRepository {
    override fun saveUserInfo(name: String, email: String) {
        Log.d("User", "User stored in SQL Db")
    }
}

// to store data in FireBase
class RemoteRepository: UserRepository {
    override fun saveUserInfo(name: String, email: String) {
        Log.d("User", "User stored in FireBase Db")
    }
}