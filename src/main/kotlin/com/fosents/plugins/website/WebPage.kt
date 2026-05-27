package com.fosents.plugins.website

import com.fosents.data.*
import kotlinx.html.*

fun HTML.initLandingPage() {
    setHead()
    setMenu()
    setBody()
    setFooter()
}

private fun HTML.setBody() {
    body {
        noScript {
            iframe {
                src = "https://www.googletagmanager.com/ns.html?id=GTM-NBGBD8J"
                height = "0"
                width = "0"
                style = "display:none;visibility:hidden"
            }
        }
        setIntro()
        setInfoSection()
        setProjectsSection()
        setAboutMeSection()
        setHobbiesSection()
    }
}

private fun BODY.setIntro() {
    div("background") {
        div(classes = "row main intro") {
            id = "home"
            div(classes = "column left intro-text") {
                h1(classes = "intro") {
                    +"Ivaylo Zankov"
                }
                h3(classes = "intro") {
                    +"Senior Android Engineer"
                }
                h4 {
                    +"6+ years of experience. Expert in Clean Architecture, Jetpack Compose & High-Security Banking Apps"
                }
                div(classes = "button") {
                    style = "text-align: center"
                    a(classes = "button") {
                        href = "#projects"
                        +"View My Work"
                    }
                }
            }
            div(classes = "column left picture") {}
        }
    }
}

private fun BODY.setInfoSection() {
    div("main") {
        id = "info"
        div("inner scroll") { id = "projects" }
        div("inner info") {
            h3 { +"Powered by Kotlin & Ktor" }
            p {
                text("This portfolio is a live demonstration of a full-stack Kotlin ecosystem. " +
                        "Built as a containerized microservice using Ktor, it functions as a centralized " +
                        "engine managing synchronized system states and high-performance API contracts. By " +
                        "leveraging Ktor’s non-blocking DSL and Kotlinx Serialization, the architecture ensures " +
                        "efficient data exchange and scalable, production-ready deployment via Docker.")
            }
        }
    }
}

private fun BODY.setProjectsSection() {
    div("backgroundAccentSecondary") {
        div("main") {
            div("inner scroll") { id = "about_me" }
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
                        h2(classes = "gold") {
                            +"Architectural Case Studies"
                        }
                    }
                }
            }
            ul {
                p("project") {
                    text("Android applications demonstrating scalable development. " +
                            "These projects are built following Clean Architecture principles and MVVM, " +
                            "ensuring strict separation of concerns, high testability, and isolated Domain, " +
                            "Data, and UI layers. UI state is managed via Unidirectional Data Flow (UDF) " +
                            "using Jetpack Compose.")
                }
                project(
                    imageClass = "vending",
                    title = "Compose Vending Machine",
                    about = "Modern Android application that simulates a real-world vending machine experience. " +
                            "Built using Kotlin and Jetpack Compose, it demonstrates best practices in Android " +
                            "development, including Clean Architecture, MVVM, and Dependency Injection.",
                    link = URL_PROJECT_VENDING_KOTLIN,
                    stack = "Kotlin | Jetpack Compose | Clean Architecture | MVVM | Hilt | Coroutines & Flow"
                )
                project(
                    imageClass = "coding",
                    title = "Unified Kotlin Microservice & API Engine",
                    about = "A containerized, asynchronous backend microservice built with Ktor that functions as a " +
                            "centralized data provider. It directly powers the RESTful APIs for the Vending Machine " +
                            "application, managing synchronized system states. Utilizing a non-blocking routing " +
                            "system with Ktor's DSL and Kotlinx Serialization, it guarantees high-performance " +
                            "API contracts and efficient data exchange. Also, it operates as the server-side " +
                            "rendering engine via Ktor HTML DSL.",
                    link = URL_PROJECT_KTOR,
                    stack = "Kotlin | Ktor & Netty | Kotlinx Serialization | Docker | RESTful API"
                )
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
                h2(classes = "accent") {
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
            addSkill("Kotlin", 5)
            addSkill("MVVM", 5)
            addSkill("StateFlow", 4)
            addSkill("Coroutines", 4)
            addSkill("Retrofit", 4)
        }
        div("column left skills") {
            addSkill("Java", 5)
            addSkill("Android Studio", 5)
            addSkill("Test Automation", 5)
            addSkill("Appium", 4)
            addSkill("Jetpack Compose", 3)
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
    div ("inner certs") {
        ul {
            cert("Android 14 App Development From Beginner to Advanced Developer", "Udemy")
            cert("Build Modern Android App with Ktor Server", "Udemy")
            cert("Functional Programming with Java", "LinkedIn Learning")
            cert("Building an Android App with Jetpack Libraries", "LinkedIn Learning")
            cert("Advanced Java Programming", "LinkedIn Learning")
            cert("Kotlin for Java Developers", "LinkedIn Learning")
            cert("RxJava: Design Patterns for Android Developers", "LinkedIn Learning")
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
            h3(classes = textClass) {
                +text
            }
        }
    }
}

private fun UL.cert(name: String, issuer: String) {
    li {
        h4 { +name }
        p { +issuer }
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
                img(classes = "title animHobby") {
                    style = "transform-origin: center bottom"
                    src = "tent.svg"
                }
            }
            div("column left text") {
                h2(classes = "accent") {
                    +"Outdoors"
                }
            }
        }
        p {
            text("I love spending time outdoors with my family and friends. I take every opportunity to go to the " +
                    "wilderness and explore new places. For me being outdoors is one of the best experiences " +
                    "where I get lost in nature and clear my mind.")
        }
        p {
            text("And in a combination with another hobby of mine - cooking, it makes unforgettable moments. " +
                    "I am fond of it, and I am always trying interesting new recipes.")
        }
        p {
            text("I'm also an enduro mountain biker and I love ridding in the mountains, exploring new routes.")
        }
    }
    div("inner")
}

private fun UL.project(imageClass: String, title: String, about: String, link: String, stack: String) {
    li {
        div {
            projectTitle(imageClass, title, link)
        }
        div ("project") {
            p("project") { +about }
            p("stack") { +stack }
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
