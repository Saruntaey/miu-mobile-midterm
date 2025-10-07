package edu.miu.midterm.ui.test

import edu.miu.midterm.R
import edu.miu.midterm.data.FakeRepo
import edu.miu.midterm.model.Item
import edu.miu.midterm.ui.ImageExpViewModel
import org.junit.Before
import org.junit.Test

class ImageExpViewModelTest {
    private lateinit var viewModel: ImageExpViewModel

    @Before()
    fun setup() {
        viewModel = ImageExpViewModel(FakeRepo(
            listOf(
                Item(
                    title = R.string.compro_professionals,
                    image = R.drawable.compro_professionals
                ),
                Item(
                    title = R.string.faculty_student,
                    image = R.drawable.faculty_student
                ),
                Item(
                    title = R.string.friends,
                    image = R.drawable.friends
                ),
                Item(
                    title = R.string.graduation,
                    image = R.drawable.graduation
                ),
            )
        ))
    }

    @Test()
    fun testGetNext() {
        viewModel.getNext()
        assert(viewModel.uiState.value.item ==
            Item(
                title = R.string.faculty_student,
                image = R.drawable.faculty_student
            )
        )
    }
}