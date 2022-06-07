package com.fosents.plugins.website

import com.fosents.data.URL_PROJECT_KTOR
import com.fosents.data.URL_PROJECT_VENDING_JAVA
import com.fosents.data.URL_PROJECT_VENDING_KOTLIN
import kotlinx.html.*

fun HTML.initLandingPage() {
    setHead()
    setMenu()
    setBody()
    setFooter()
}

private fun HTML.setBody() {
    body {
        setIntro()
        setInfoSection()
        setAboutMeSection()
        setProjectsSection()
        setHobbiesSection()
    }
}

private fun BODY.setIntro() {
    div("background") {
        div(classes = "row main intro") {
            id = "home"
            div(classes = "column picture") {}
            div(classes = "column") {
                h1(classes = "intro") {
                    +"Hi there, I'm Ivaylo, a software developer"
                }
                div(classes = "button") {
                    style = "text-align: center"
                    a(classes = "button") {
                        href = "mailto:ivaylo@zankov.dev"
                        +"Email me"
                    }
                }
            }
        }
    }
}

private fun BODY.setInfoSection() {
    div("main") {
        id = "info"
        div("inner scroll") { id = "about_me" }
        div("inner info") {
            h1(classes = "inner") {
                +"My Ktor website"
            }
            p {
                text("Welcome to my website developed on Kotlin Ktor. Here you can find information " +
                        "about me, as well as the latest projects I'm developing.")
            }
        }
    }
}

private fun BODY.setAboutMeSection() {
    div("main") {
        setAboutMe()
    }
    div("backgroundAccent") {
        div("main skills") {
            setSkills()
        }
    }
    div("main") {
        setCertificates()
    }
}

private fun DIV.setAboutMe() {
    div("inner") {
        div("row") {
            div("column left img") {
                img(classes = "title animRobot") {
                    src = "robot.svg"
                }
            }
            div("column left text") {
                h1(classes = "hobbies") {
                    +"About me"
                }
            }
        }
        p {
            text("I'm a dedicated programmer always seeking the most advanced problem-solving solutions. " +
                    "I'm experienced in Android development with Java and Kotlin, MVVM, RxJava, Kotlin Coroutines, " +
                    "Retrofit, and I'm quite familiar with Ktor and automation UI testing.")
        }
        p {
            text("I love pushing my limits at challenges and enjoy working with skilled team mates solving " +
                    "complex tasks. I'm a flexible learner and keen to further develop my career.")
        }
    }
    div("inner")
}

private fun DIV.setSkills() {
    div("inner small") {
        secTitle("skills.svg", "My skills", "accent")
    }
    div("row skills") {
        div("column left skills") {
            addSkill("Java", 5)
            addSkill("Kotlin", 4)
            addSkill("Coroutines", 4)
            addSkill("Hilt-Dagger", 4)
            addSkill("Android", 5)
        }
        div("column left skills") {
            addSkill("Ktor", 3)
            addSkill("MVVM", 5)
            addSkill("RxJava", 4)
            addSkill("Retrofit", 4)
            addSkill("Git", 4)
        }
    }
}

private fun DIV.addSkill(skill: String, level: Int) {
    div("cellSkill") {
        p("skills") { +skill }
    }
    div("cellSkill") {
        div("row") {
            for (i in 1..level) {
                span("skillPoint")
            }
        }
    }
}

private fun DIV.setCertificates() {
    div("inner") {
        secTitle("certs.svg", "My certs", "certs")
    }
    div("inner scroll") {
        id = "projects"
    }
    div ("inner certs") {
        ul {
            cert(
                "Build Modern Android App with Ktor Server",
                "Udemy")
            cert(
                "Functional Programming with Java",
                "LinkedIn Learning")
            cert(
                "Building an Android App with Jetpack Libraries",
                "LinkedIn Learning")
            cert(
                "Full Android 11 Masterclass",
                "Udemy")
            cert(
                "Advanced Java Programming",
                "LinkedIn Learning")
            cert(
                "Kotlin for Java Developers",
                "LinkedIn Learning")
            cert(
                "RxJava: Design Patterns for Android Developers",
                "LinkedIn Learning")
        }
    }
}

private fun DIV.secTitle(image: String, text: String, textClass: String) {
    div("row") {
        div("columnImgSmall") {
            img(classes = "title small") {
                src = image
            }
        }
        div("columnTextSmall") {
            h2(classes = textClass) {
                +text
            }
        }
    }
}

private fun UL.cert(name: String, issuer: String) {
    li {
        h3 { +name }
        p { +issuer }
    }
}

private fun BODY.setProjectsSection() {
    div("backgroundAccentSecondary") {
        div("main") {
            div("inner") {
                div("row") {
                    div("column left img") {
                        div("projectsFrame") {
                            img(classes = "wheelBig") {
                                src = "wheel.svg"
                            }
                            img(classes = "wheelMedium") {
                                src = "wheel.svg"
                            }
                            img(classes = "wheelSmall") {
                                src = "wheel.svg"
                            }
                        }
                    }
                    div("column left text") {
                        h1(classes = "accent") {
                            +"My projects"
                        }
                    }
                }
            }
            ul {
                project(
                    "vending",
                    "Kotlin VM",
                    "Android vending machine implementation on Kotlin with Jetpack Compose, Hilt-Dagger, " +
                            "Coroutines, Retrofit, Room, DataStore.",
                    URL_PROJECT_VENDING_KOTLIN)
                project(
                    "vending",
                    "Java VM",
                    "Android vending machine implementation on Java with MVVM, LiveData, Retrofit, RxJava.",
                    URL_PROJECT_VENDING_JAVA)
                project(
                    "coding",
                    "Ktor backend",
                    "Kotlin Ktor backend implementation for website and REST API for Android vending machine.",
                    URL_PROJECT_KTOR)
            }
        }
    }
}

private fun BODY.setHobbiesSection() {
    div("main") {
        setHobbies()
    }
}

private fun DIV.setHobbies() {
    div("inner hobbies") {
        div("row") {
            div("column left img") {
                img(classes = "title animBike") {
                    src = "bike.svg"
                }
            }
            div("column left text") {
                h1(classes = "hobbies") {
                    +"My Hobbies"
                }
            }
        }
        p {
            text("I'm a mountain biker and I ride different styles as Enduro and Downhill. " +
                    "I’ve been a biker for years and I take every opportunity to go to the " +
                    "mountains and explore new routes. For me riding is one of the best experiences, " +
                    "where I get lost in nature and clear my mind.")
        }
        p {
            text("Another hobby of mine is cooking. I am fond of it, and I am always trying " +
                    "interesting new recipes. Sometimes I like watching a good movie and spending quality " +
                    "time with my family and friends.")
        }
    }
    div("inner")
}

private fun UL.project(imageClass: String, title: String, about: String, link: String, inProgress: Boolean = true) {
    li {
        div {
            projectTitle(imageClass, title, link)
        }
        div ("project") {
            p("project") { +about }
            if (inProgress)
                p("progress") { +"in progress" }
        }
    }
}

private fun DIV.projectTitle(imageClass: String, text: String, link: String) {
    div("projectTitle") {
        a(classes = "project $imageClass", href = link, target="_blank") {
            +text
        }
    }
}
