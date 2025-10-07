package edu.miu.midterm.data

import edu.miu.midterm.model.Item

interface ImageRepository {
    fun getNext(): Item
}