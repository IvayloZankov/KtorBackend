package com.fosents.plugins.website

import kotlinx.css.CssBuilder
import kotlinx.css.LinearDimension
import kotlinx.css.properties.*

fun CssBuilder.setAnimations() {
    setHobbyAnim()
    setRobotAnim()
    setWheelsAnim()
}

private fun CssBuilder.setWheelsAnim() {
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
    rule("@keyframes animWheelReverse") {
        rule("from") {
            transform {
                rotate(0.deg)
            }
        }
        rule("to") {
            transform {
                rotate((-359).deg)
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

private fun CssBuilder.setHobbyAnim() {
    rule("@keyframes animHobby") {
        rule("0%") {
            transform {
                skewX(0.deg)
            }
        }
        rule("20%") {
            transform {
                skewX((-5).deg)
            }
        }
        rule("30%") {
            transform {
                skewX((-4).deg)
            }
        }
        rule("50%") {
            transform {
                skewX((-9).deg)
            }
        }
        rule("60%") {
            transform {
                skewX((-2).deg)
            }
        }
        rule("70%") {
            transform {
                skewX((-4).deg)
            }
        }
        rule("100%") {
            transform {
                skewX(0.deg)
            }
        }
    }
}
