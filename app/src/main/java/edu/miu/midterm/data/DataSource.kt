package edu.miu.midterm.data

import edu.miu.midterm.R
import edu.miu.midterm.model.Item

object DataSource {
    fun getData(): List<Item> {
        return listOf(
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
            Item(
                title = R.string.miu_campus,
                image = R.drawable.miu_campus
            ),
            Item(
                title = R.string.miu_snow_fall,
                image = R.drawable.miu_snow_fall
            ),
            Item(
                title = R.string.rainbow,
                image = R.drawable.rainbow
            ),
            Item(
                title = R.string.sustainable_living_center,
                image = R.drawable.sustainable_living_center
            ),
        )
    }
}
