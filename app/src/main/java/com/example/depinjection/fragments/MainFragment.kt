package com.example.depinjection.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.depinjection.R
import com.example.depinjection.repository.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainFragment : Fragment() {


//    @Inject
//    lateinit var userRepository: UserRepository

    @Inject
    @Named("local")
    lateinit var userRepository: UserRepository


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        userRepository.saveUserData()

//        userRepository.saveUserInfo("Amar", "amar@gmail.com")

        userRepository.saveUserInfo("Amar", "amar@gmail.com")

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    companion object {
    }
}