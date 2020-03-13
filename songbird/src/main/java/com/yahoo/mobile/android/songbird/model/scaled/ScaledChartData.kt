/**
 * Copyright 2020, Verizon Media
 * Licensed under the terms of the Apache 2.0 license. See LICENSE file in project root for terms.
 */
package com.yahoo.mobile.android.songbird.model.scaled

class ScaledChartData(
    val benchmarkY: Float,
    val benchmarkWidth: Float,
    val points: List<ScaledPoint>,
    val xAxises: List<ScaledXAxis?>,
    val yAxis: ScaledYAxis?
)