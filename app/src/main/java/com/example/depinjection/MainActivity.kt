package com.example.depinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.depinjection.repository.UserRepository
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    /** @AndroidEntryPoint is compulsory if this activity contain any fragment
     and also that fragment consist of injection **/

//    @Inject
//    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        userRepository.saveUserData()

    }
}