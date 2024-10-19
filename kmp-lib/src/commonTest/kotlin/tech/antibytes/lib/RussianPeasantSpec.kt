/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import tech.antibytes.util.test.fulfils
import tech.antibytes.util.test.mustBe
import kotlin.js.JsName
import kotlin.jvm.JvmInline
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class RussianPeasantSpec {

    @Test
    @JsName("fn0")
    fun `It fulfils the RussianPeasantMultiplicationContract`() {
        RussianPeasantMultiplication fulfils RussianPeasantMultiplicationContract::class
    }

    @Test
    @JsName("fn1")
    fun `Given the left parameter is zero when multiplication then the result is zero`() {
        // Given
        val left = 0
        val right = 99

        val expected = 0

        // When
        val result = RussianPeasantMultiplication.multiply(
            left = left,
            right = right
        )

        // Then
        assertEquals(
            actual = result,
            expected = expected
        )
    }

    @Test
    @JsName("fn2")
    fun `Given the right parameter is zero when multiplication then the result is zero`() {
        // Given
        val left = 99
        val right = 0

        val expected = 0

        // When
        val result = RussianPeasantMultiplication.multiply(
            left = left,
            right = right
        )

        // Then
        assertEquals(
            actual = result,
            expected = expected
        )
    }

    @Test
    @JsName("fn3")
    fun `Given the left and right parameter are zero when multiplication then the result is zero`() {
        // Given
        val left = 0
        val right = 0

        val expected = 0

        // When
        val result = RussianPeasantMultiplication.multiply(
            left = left,
            right = right
        )

        // Then
        assertEquals(
            actual = result,
            expected = expected
        )
    }

    @Test
    @JsName("fn4")
    fun `Given the left is 1 when multiplication then the result is the right`() {
        // Given
        val left = 1
        val right = 99

        // When
        val result = RussianPeasantMultiplication.multiply(
            left = left,
            right = right
        )

        // Then
        assertEquals(
            actual = result,
            expected = right
        )
    }

    @Test
    @JsName("fn5")
    fun `Given the left is 2 when multiplication then the result is the double of the right`() {
        // Given
        val left = 2
        val right = 4
        val expected = 8

        // When
        val result = RussianPeasantMultiplication.multiply(
            left = left,
            right = right
        )

        // Then
        assertEquals(
            actual = result,
            expected = expected
        )
    }

    @Test
    @JsName("fn6")
    fun `Given the left is a power of 2 when multiplication then the result is the summary of the double the exponent multiplied by the right value`() {
        // Given
        val left = 4
        val right = 2
        val expected = 8

        // When
        val result = RussianPeasantMultiplication.multiply(
            left = left,
            right = right
        )

        // Then
        assertEquals(
            actual = result,
            expected = expected
        )
    }



}