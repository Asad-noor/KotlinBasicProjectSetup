package com.worldvisionsoft.kotlinbasicprojectsetup

import com.google.gson.Gson
import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.LoginRequest
import com.worldvisionsoft.kotlinbasicprojectsetup.ui.home.HomeViewModel
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class HomeViewModelTest {

    @Mock
    lateinit var dataManager: DataManager

    lateinit var homeViewModel: HomeViewModel

    @Before
    fun setUp(){
        homeViewModel = HomeViewModel(dataManager)
    }

    @Test
    fun testPerform(){
        val loginRequest = LoginRequest("123448812", "asad_use11", "pushtoken1232434")
        homeViewModel.performHome(loginRequest)
    }
}