package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.STARGATE] category.
 */
@Suppress("unused")
class Stargate internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Stargate>(fakerService) {
    override val categoryName = CategoryName.STARGATE
    override val uniqueDataProvider = UniqueDataProvider<Stargate>()
    override val unique by UniqueProviderDelegate(uniqueDataProvider)

    fun characters() = resolve("characters")
    fun planets() = resolve("planets")
    fun quotes() = resolve("quotes")
}
