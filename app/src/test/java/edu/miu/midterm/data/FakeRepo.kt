package edu.miu.midterm.data

import edu.miu.midterm.model.Item

class FakeRepo(items: List<Item>): ImageRepository by ImageRepositoryImpl(items)