package edu.miu.midterm.ui

import androidx.lifecycle.ViewModel
import edu.miu.midterm.data.ImageRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ImageExpViewModel(
    private val imageRepository: ImageRepository
): ViewModel()  {
    private val _uiState = MutableStateFlow(ImageExpState(imageRepository.getNext()))
    val uiState: StateFlow<ImageExpState> = _uiState.asStateFlow()

    fun getNext() {
        _uiState.update {
            ImageExpState(imageRepository.getNext())
        }
    }
}