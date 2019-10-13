package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.CODE] category.
 */
@Suppress("unused")
class Code internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Code>(fakerService) {
    override val categoryName = CategoryName.CODE
    override val uniqueDataProvider = UniqueDataProvider<Code>()
    override val unique by UniqueProviderDelegate(uniqueDataProvider)

    fun asin() = resolve("asin")
}
