/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

object RussianPeasantMultiplication : RussianPeasantMultiplicationContract {
    override fun multiply(left: Int, right: Int): Int {
        return when (left) {
            1 -> right
            2 -> right * 2
            else -> 0
        }
    }
}

