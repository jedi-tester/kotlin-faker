package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.ADDRESS] category.
 */
@Suppress("unused")
class Separator internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Separator>(fakerService) {
    override val categoryName = CategoryName.SEPARATOR
    override val uniqueDataProvider = UniqueDataProvider<Separator>()
    override val unique by UniqueProviderDelegate(uniqueDataProvider)

    fun separator() = resolve("separator")
}
