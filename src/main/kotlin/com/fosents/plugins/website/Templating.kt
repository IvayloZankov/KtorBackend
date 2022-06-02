package com.fosents.plugins.website

import com.fosents.data.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.css.*
import kotlinx.css.Float
import kotlinx.css.properties.*

fun Application.configureTemplating() {
    routing {
        initStyle()
    }
}

fun Route.initStyle() {
    get("/styles.css") {
        call.respondCss {
            setMenuStyle()
            setMainStyle()
            setIntroStyle()
            setAboutMeStyle()
            setProjectsStyle()
            setHobbiesStyle()
            setFooterStyle()
            setMedia()
            setAnimations()
        }
    }
}

private fun CssBuilder.setMenuStyle() {
    ul {
        listStyleType = ListStyleType.none
    }
    rule("ul.menu") {
        textAlign = TextAlign.center
        textTransform = TextTransform.lowercase
        padding(all = 0.px)
        margin(all = 0.px)
        fontSize = 0.px
        width = LinearDimension("100%")
        position = Position.fixed
        top = 0.px
        backgroundColor = COLOR_BACKGROUND
        zIndex = 100
    }
    rule("ul.menu.icon") {
        display = Display.none
    }
    rule("li.menu") {
        display = Display.inline
    }
    rule("a.menu") {
        color = COLOR_ACCENT
        textDecoration = TextDecoration.none
        display = Display.inlineBlock
        transitionDuration = Time("0.4s")
        padding(horizontal = 24.px)
        padding(vertical = 10.px)
        width = 150.px
        fontSize = 25.px
        height = 30.px
//        margin(horizontal = (-8).px)
    }
    rule("a.menu:hover") {
        color = Color.whiteSmoke
        backgroundColor = COLOR_ACCENT
    }
}

private fun CssBuilder.setMainStyle() {
    html {
        scrollBehavior = ScrollBehavior.smooth
    }
    body {
        backgroundColor = Color.whiteSmoke
        color = COLOR_FONT_MAIN
        fontFamily = "courier new"
        marginTop = 50.px
        marginBottom = 0.px
        margin(horizontal = LinearDimension.auto)
    }
    h1 {
        fontSize = 60.px
        cursor = Cursor.default
    }
    h2 {
        fontSize = 40.px
        cursor = Cursor.default
    }
    h3 {
        fontSize = 30.px
        cursor = Cursor.default
    }
    p {
        fontSize = 30.px
        maxHeight = 999999.px
        cursor = Cursor.default
    }
    rule("div.main") {
        maxWidth = 1600.px
        margin = "0px auto"
        position = Position.relative
    }
    rule("div.main.intro") {
        padding(horizontal = 50.px)
    }
    rule("div.background") {
        backgroundColor = COLOR_BACKGROUND
        border = "1px solid"
        borderColor = COLOR_BACKGROUND
    }
    rule("div.backgroundAccent") {
        backgroundColor = COLOR_BACKGROUND_ACCENT
    }
    rule("div.backgroundAccentSecondary") {
        backgroundColor = COLOR_BACKGROUND_ACCENT_SEC
        border = "1px solid"
        borderColor = COLOR_BACKGROUND_ACCENT_SEC
    }
    rule("div.inner") {
        padding(horizontal = 50.px)
        paddingTop = 50.px
        position = Position.relative
//        border = "1px solid red"
    }
    rule("div.inner.small") {
        padding(all = 50.px)
    }
    rule("div.scroll") {
        height = 50.px
        width = 50.px
        padding(all = 0.px)
        margin(all = 0.px)
//        border = "1px solid blue"
        position = Position.absolute
        bottom = 0.px

    }
    rule("div.innerSecondary") {
        padding(horizontal = 50.px)
        paddingTop = 0.px
    }
    rule("div.column") {
        float = Float.right
        width = LinearDimension("50%")
        padding(all = 50.px)
        boxSizing = BoxSizing.borderBox
    }
    rule("div.column.left") {
        float = Float.left
    }
    rule("div.column.left.img") {
        height = 200.px
        width = 200.px
        position = Position.relative
        padding(all = 0.px)
//        border = "1px solid red"
    }
    rule("div.column.left.text") {
        height = 200.px
        padding(all = 0.px)
        position = Position.relative
        display = Display.flex
    }
    rule("div.column.left.img.small") {
        height = 100.px
        width = 100.px
    }
    rule("div.column.left.text.small") {
        height = 100.px
    }
    rule("div.columnImgSmall") {
//        padding(all = 50.px)
        height = 100.px
        width = 100.px
        boxSizing = BoxSizing.borderBox
        float = Float.left
        position = Position.relative
    }
    rule("div.columnTextSmall") {
        padding(all = 50.px)
        height = 100.px
        boxSizing = BoxSizing.borderBox
        float = Float.left
        position = Position.relative
//        border = "1px solid blue"
        padding(all = 0.px)
        display = Display.flex
    }
    rule("div.row:after") {
        content = QuotedString("")
        display = Display.table
        clear = Clear.both
    }
    rule("div.title") {
        display = Display.inlineBlock
        width = LinearDimension("100%")
    }
    rule("img.title") {
        height = 150.px
        width = 150.px
        position = Position.absolute
        top = 0.px
        bottom = 0.px
        left = 0.px
        right = 0.px
        margin = "auto"
    }
    rule("img.animRobot") {
        animation("animRobot", Time("3s"), Timing.ease, iterationCount = IterationCount.infinite)
    }
    rule("img.title.small") {
        height = 75.px
        width = 75.px
    }
    rule("h1.title") {
        color = COLOR_FONT_MAIN
        maxHeight = 999999.px
        alignSelf = Align.flexEnd
        marginLeft = 20.px
    }
    rule("h1.accent") {
        color = Color.gold
        maxHeight = 999999.px
        alignSelf = Align.flexEnd
        marginLeft = 20.px
    }
}

private fun CssBuilder.setIntroStyle() {
    rule("div.column.picture") {
        margin(vertical = 50.px)
        borderRadius = 100.px
        background="url('me.png')"
        backgroundRepeat = BackgroundRepeat.noRepeat
        backgroundPosition = "center"
        backgroundSize = "cover"
        height = 700.px
        maxWidth = 700.px
    }
    rule("h1.intro") {
        paddingTop = 100.px
        color = Color.black
        maxHeight = 999999.px
    }
    rule("div.button") {
        padding(vertical = 100.px)
    }
    rule("a.button") {
        color = Color.whiteSmoke
        border = "3px solid"
        borderColor = COLOR_ACCENT
        backgroundColor = COLOR_ACCENT
        borderRadius = 20.px
        fontSize = 32.px
        padding = "16px 32px"
        textAlign = TextAlign.center
        transitionDuration = Time("0.4s")
        fontFamily = "sans-serif"
        cursor = Cursor.pointer
        textDecoration = TextDecoration.none
    }
    rule("a.button:hover") {
        color = Color.whiteSmoke
        border = "3px solid"
        borderColor = COLOR_HOVER
        backgroundColor = COLOR_HOVER
    }
}

private fun CssBuilder.setAboutMeStyle() {
    rule("h1.inner") {
        color = COLOR_FONT_MAIN
        maxHeight = 999999.px
    }
    rule("div.inner.certs") {
        paddingTop = 0.px
        paddingBottom = 50.px
    }
    rule("div.inner.info") {
        position = Position.relative
        padding(all = 50.px)
    }
    rule("div.main.skills") {
        paddingBottom = 20.px
    }
    rule("div.row.skills") {
        paddingBottom = 50.px
    }
    rule("div.column.left.skills") {
        padding(all = 0.px)
        paddingLeft = 100.px
        color = Color.whiteSmoke
    }
    rule("div.cellSkill") {
        float = Float.left
        width = LinearDimension("50%")
        boxSizing = BoxSizing.borderBox
        color = Color.whiteSmoke
        display = Display.flex
        alignItems = Align.center
        verticalAlign = VerticalAlign.middle
        height = 60.px
    }
    rule("span.skillPoint") {
        float = Float.left
        width = 30.px
        height = 30.px
        boxSizing = BoxSizing.borderBox
        color = Color.whiteSmoke
        borderRadius = LinearDimension("50%")
        backgroundColor = Color.whiteSmoke
        marginLeft = 6.px
    }
    rule("h2.accent") {
        margin(all = 0.px)
        marginBottom = 5.px
        marginLeft = 20.px
        color = Color.whiteSmoke
        maxHeight = 999999.px
        alignSelf = Align.flexEnd
    }
    rule("h2.certs") {
        marginLeft = 20.px
    }
    rule("p.skills") {
        marginTop = 0.5.em
        marginBottom = 0.5.em
        fontWeight = FontWeight.bold
    }
    rule("ul.skills") {
        marginTop = 0.px
        border = "1px solid red"
    }
}

private fun CssBuilder.setProjectsStyle() {
    rule("div.projectTitle") {
        margin(vertical = 50.px)
    }
    rule("div.project") {
        margin(horizontal = 50.px)
        marginBottom = 100.px
    }
    rule("div.projectsFrame") {
        height = 150.px
        width = 150.px
        position = Position.absolute
        top = 0.px
        bottom = 0.px
        left = 0.px
        right = 0.px
        margin = "auto"
//        border = "1px solid blue"
    }
    rule("img.wheelBig") {
        height = 100.px
        width = 100.px
        position = Position.absolute
        top = 0.px
        left = 0.px
        animation("animWheel", Time("5s"), Timing.ease, iterationCount = IterationCount.infinite)
    }
    rule("img.wheelMedium") {
        height = 60.px
        width = 60.px
        position = Position.absolute
        bottom = 25.px
        right = 0.px
        animation("animWheelReverse", Time("5s"), Timing.ease, iterationCount = IterationCount.infinite)
    }
    rule("img.wheelSmall") {
        height = 30.px
        width = 30.px
        position = Position.absolute
        bottom = 0.px
        right = 40.px
        animation("animWheel", Time("5s"), Timing.ease, iterationCount = IterationCount.infinite)
    }
    rule("p.project") {
        color = Color.whiteSmoke
    }
    rule("p.progress") {
        fontSize = 20.px
        color = Color.whiteSmoke
    }
    rule("a.project") {
        position = Position.relative
        fontSize = 40.px
        color = Color.whiteSmoke
        fontWeight = FontWeight.bold
        margin(horizontal = 10.px)
        paddingLeft = 100.px
        paddingTop = 20.px
        paddingBottom = 5.px
    }
    rule("a.project:hover") {
        fontWeight = FontWeight.bold
        filter = FILTER_WHITE_TO_GOLD
    }
    rule("a.project.vending") {
        background="url('vending.svg')"
        backgroundRepeat = BackgroundRepeat.noRepeat
    }
    rule("a.project.vending:hover") {
        filter = FILTER_WHITE_TO_GOLD
    }
    rule("a.project.coding") {
        background="url('coding.svg')"
        backgroundRepeat = BackgroundRepeat.noRepeat
    }
    rule("a.project.coding:hover") {
        filter = FILTER_WHITE_TO_GOLD
    }
}

private fun CssBuilder.setHobbiesStyle() {
    rule("div.inner.hobbies") {
        paddingBottom = 100.px
    }
    rule("img.animBike") {
        animation("animBike", Time("5s"), Timing.linear, iterationCount = IterationCount.infinite)
    }
    rule("h1.hobbies") {
        color = COLOR_ACCENT
        maxHeight = 999999.px
        alignSelf = Align.flexEnd
        marginLeft = 20.px
    }
}

private fun CssBuilder.setFooterStyle() {
    rule("div.footer") {
        backgroundColor = COLOR_ACCENT
        border = "1px solid"
        borderColor = COLOR_ACCENT
    }
    rule("div.cellContact") {
        float = Float.left
        width = LinearDimension("50%")
        boxSizing = BoxSizing.borderBox
        color = Color.whiteSmoke
        border = "1px solid red"
        display = Display.flex
    }
    rule("p.footer.copy") {
        fontSize = 16.px
        fontFamily = "sans-serif"
        color = Color("#e6e6e6")
        textDecoration = TextDecoration.none
        textAlign = TextAlign.center
    }
    rule("h1.footer.name") {
        color = Color("#e6e6e6")
        textDecoration = TextDecoration.none
        textAlign = TextAlign.start
    }
    rule("h2.footer") {
        color = Color("#e6e6e6")
        textAlign = TextAlign.start
    }
    rule("ul.footer") {
        textAlign = TextAlign.start
    }
    rule("li.footer") {
        padding(vertical = 3.px)
        listStyleType = ListStyleType.none
    }
    rule("a.footer") {
        fontSize = 30.px
        color = Color("#e6e6e6")
        textAlign = TextAlign.start
        textDecoration = TextDecoration.none
        listStyleType = ListStyleType.none
    }
}

private fun CssBuilder.setMedia() {
    media("(max-width: 1080px)") {
        rule("a.menu") {
            not(":first-child") {
                display = Display.none
            }
        }
        rule("ul.menu.icon") {
            float = Float.right
            display = Display.block
        }
        rule("div.column") {
            width = LinearDimension("100%")
        }
        rule("div.column.picture") {
            maxWidth = 1080.px
        }
        rule("h1.intro") {
            paddingTop = 0.px
        }
        rule("div.column.left.img") {
            width = LinearDimension("100%")
//            right = 0.px
        }
        rule("div.column.left.text") {
            height = 100.px
            width = LinearDimension("100%")
        }
        rule("h1.inner") {
            width = LinearDimension("100%")
            textAlign = TextAlign.center
        }
        rule("h1.title") {
            width = LinearDimension("100%")
            textAlign = TextAlign.center
            alignSelf = Align.center
        }
        rule("h1.accent") {
            width = LinearDimension("100%")
            textAlign = TextAlign.center
            alignSelf = Align.center
        }
        rule("h1.hobbies") {
            width = LinearDimension("100%")
            textAlign = TextAlign.center
            alignSelf = Align.center
        }
    }
}

suspend inline fun ApplicationCall.respondCss(builder: CssBuilder.() -> Unit) {
    this.respondText(CssBuilder().apply(builder).toString(), ContentType.Text.CSS)
}
