package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.UNIVERSITY] category.
 */
@Suppress("unused")
class University internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<University>(fakerService) {
    override val categoryName = CategoryName.UNIVERSITY
    override val uniqueDataProvider = UniqueDataProvider<University>()
    override val unique by UniqueProviderDelegate(uniqueDataProvider)

    // Prefix and suffix are needed because they are used as expressions, i.e. `#{University.prefix}`

    fun prefix() = resolve("prefix")
    fun suffix() = resolve("suffix")
    fun name() = resolve("name")
}
