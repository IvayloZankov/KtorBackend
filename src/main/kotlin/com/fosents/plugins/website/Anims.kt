package com.fosents.plugins.website

import kotlinx.css.CssBuilder
import kotlinx.css.LinearDimension
import kotlinx.css.properties.*

fun CssBuilder.setAnimations() {
    setBikeAnim()
    setRobotAnim()
    setWheelAnim()
}

private fun CssBuilder.setWheelAnim() {
    rule("@keyframes animWheel") {
        rule("from") {
            transform {
                rotate(0.deg)
            }
        }
        rule("to") {
            transform {
                rotate(359.deg)
            }
        }
    }
}

private fun CssBuilder.setRobotAnim() {
    rule("@keyframes animRobot") {
        rule("0%") {
            transform {
                scale(1)
                translateY(LinearDimension("0%"))
            }
        }
        rule("20%") {
            transform {
                scale(1.1, 1.1)
                translateY(LinearDimension("0%"))
            }
        }
        rule("60%") {
            transform {
                scale(0.9, 1)
                translateY(LinearDimension("-20%"))
            }
        }
        rule("75%") {
            transform {
                scale(1)
                translateY(LinearDimension("0%"))
            }
        }
        rule("100%") {
            transform {
                scale(1)
                translateY(LinearDimension("0%"))
            }
        }
    }
}

private fun CssBuilder.setBikeAnim() {
    rule("@keyframes animBike") {
        rule("0%") {
            transform {
                scale(1)
                translateX(LinearDimension("0%"))
            }
        }
        rule("25%") {
            transform {
                scale(0.9)
                translateX(LinearDimension("-20%"))
            }
        }
        rule("50%") {
            transform {
                scale(0.8)
                translateX(LinearDimension("0%"))
            }
        }
        rule("75%") {
            transform {
                scale(0.9)
                translateX(LinearDimension("20%"))
            }
        }
        rule("100%") {
            transform {
                scale(1)
                translateY(LinearDimension("0%"))
            }
        }
    }
}
