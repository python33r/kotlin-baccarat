package org.efford.baccarat

import io.kotest.core.config.AbstractProjectConfig

object KotestProjectConfig: AbstractProjectConfig() {
    override val globalAssertSoftly = true
}