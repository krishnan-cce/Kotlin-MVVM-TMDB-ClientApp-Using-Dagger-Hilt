package com.example.retrofit.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.example.retrofit.domain.usecase.GetArtistsUseCase
import com.example.retrofit.domain.usecase.UpdateArtistsUseCase

class ArtistViewModelFactory(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ArtistViewModel(
            getArtistsUseCase,
            updateArtistsUseCase
        ) as T
    }
}