package com.auma.navigationapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class myViewModel(
    private val navController: NavController
) : ViewModel() {

    fun navigate(resId: Int){
        navController.navigate(resId)
    }


}