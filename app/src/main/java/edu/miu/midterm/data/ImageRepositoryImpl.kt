package edu.miu.midterm.data

import edu.miu.midterm.model.Item

class ImageRepositoryImpl(
    private val dataSource: List<Item> = DataSource.getData()
): ImageRepository  {
    private var idx: Int = 0

    override fun getNext(): Item {
        val item = dataSource[idx]
        val n = dataSource.size
        idx = (idx + 1) % n
        return item
    }
}