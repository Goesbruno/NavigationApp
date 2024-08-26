package com.auma.navigationapp.di

import androidx.navigation.NavController
import com.auma.navigationapp.viewmodel.myViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {

    viewModel { (navController: NavController) ->
        myViewModel(
        navController = navController
    ) }
}