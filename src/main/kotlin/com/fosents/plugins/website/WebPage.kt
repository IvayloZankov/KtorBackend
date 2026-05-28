package com.fosents.plugins.website

import com.fosents.data.*
import com.fosents.plugins.website.div.DIV_INTRO_TEXT
import com.fosents.plugins.website.div.DIV_SKILLS
import com.fosents.plugins.website.div.DIV_TEXT
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
    }
}

private fun BODY.setIntro() {
    div("background") {
        div(classes = "row main intro") {
            id = "home"
            div(classes = "column left $DIV_INTRO_TEXT") {
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
            div("inner scroll") { id = "mindset" }
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
        div("main $DIV_SKILLS") {
            setSkills()
        }
    }
    div("main") {
        setProfessionalTraining()
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
            div("column left $DIV_TEXT") {
                h2(classes = "accent") {
                    +"Engineering Mindset & Professional Journey"
                }
            }
        }
        h3 {
            +"The Drive for Quality & Automation"
        }
        p {
            text("My career in tech is built on relentless self-improvement and a proactive mindset. Starting in QA, I immediately recognized the bottlenecks of manual testing and took the initiative to build a robust automation framework from scratch. Driven by a desire to optimize processes, I spent countless hours outside of work teaching myself automation and architecture. This dedication not only significantly reduced manual workloads but naturally accelerated my transition into software engineering.")
        }
        h3 {
            +"Architectural Ownership & Mentorship"
        }
        p {
            text("Transitioning to an Android Developer role, I quickly developed a critical eye for structural flaws in legacy codebases. Instead of simply delivering features, I took ownership of the projects, initiating and leading full-scale application refactors to implement Clean Architecture and SOLID principles. I never stop learning, and I naturally gravitate toward sharing that knowledge with my peers. By driving the technical direction on new initiatives and enforcing Clean Code standards through collaborative code reviews, I actively guide fellow developers and help foster a team culture centered around modern best practices and maintainable code.")
        }
        h3 {
            +"A Builder’s Philosophy"
        }
        p {
            text("Beyond the screen, I am fundamentally a builder with a perfectionist streak. Whether I am constructing complex drywall frameworks, designing custom sensor-driven lighting systems, or executing complete room renovations, my approach is identical to my coding philosophy. I research deeply, execute with precision, and see every challenge through to the end. I firmly believe that investing intensive effort upfront—whether for a few weeks or months—creates robust solutions that provide lasting comfort and value for years to come. I build things to last, both in software and in life.")
        }
    }
    div("inner")
}

private fun DIV.setSkills() {
    div("inner small") {
        secTitle("skills.svg", "My Tech Toolbox", "accent")
    }
    div("row $DIV_SKILLS") {
        div("column left $DIV_SKILLS") {
            h4 {
                +"Core Development"
            }
            p{+"Architecture: Clean Architecture, MVVM, SOLID Principles, Clean Code, Dependency Injection (Hilt)."}
            p{+"Modern Android (MAD): Jetpack Compose, Compose Navigation, Coroutines, Flow, WorkManager, Room."}
        }
        div("column left $DIV_SKILLS") {
            h4 {
                +"Quality & Tooling"
            }
            p{+"Testing & CI/CD: JUnit 4/5, Compose Test Rule, Integration Testing, Appium, Jenkins CI/CD."}
            p{+"Languages & Backend: Kotlin, Kotlin DSL, Java, Ktor, Gradle 9."}
        }
    }
}

private fun DIV.setProfessionalTraining() {
    div("inner") {
        secTitle("certs.svg", "Professional Training & Deep Dives", "certs")
    }
    div ("inner certs") {
        ul {
            training(
                title = "Advanced Kotlin Coroutines & Flow",
                description = "Specialized focus on asynchronous programming, structured concurrency, " +
                        "and reactive data streams for high-performance, non-blocking applications."
            )
            training(
                title = "Modern Android Architecture & Kotlin",
                description = "Advanced mastery of the Android SDK, emphasizing Jetpack library implementations, " +
                        "lifecycle management, and scalable architectural patterns."
            )
            training(
                title = "Advanced Java & Object-Oriented Design",
                description = "Deep-level exploration of Java concepts and design patterns, essential for " +
                        "maintaining, optimizing, and refactoring legacy systems within the Android ecosystem."
            )
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

private fun UL.training(title: String, description: String) {
    li {
        h4 { +title }
        p { +description }
    }
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
