package hello

import org.scalajs.dom
import dom.document
import scalatags.JsDom.all._

import acumen.example

object Hello3 extends example{
    def main(args: Array[String]): Unit = {

        // intentional overkill to demonstrate scalatags
        val navbar = tag("nav")(
            id:="menu",
            label(
                `for`:="tm",
                id:="toggle-menu",
                "Menubar",
                span(cls:="drop-icon")
            ),
            input(
                `type` :="checkbox",
                id:="tm"
            ),
            ul(
                cls:="main-menu clearfix",
                li(
                    a(
                        href:="#",
                        "File",
                        span(
                            cls:="drop-icon",
                            "▾"
                        ),
                        label(
                            title:="Toggle Drop-down",
                            cls:="drop-icon",
                            `for`:="sm1",
                            "▾"
                        )
                    ),
                    input(
                        `type` :="checkbox",
                        id:="sm1"
                    ),
                    ul(
                        cls:="sub-menu",
                        li(
                            a(
                                href:="#",
                                "New"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Open"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Save"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Save As"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Export Table"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Recover"
                            )
                        )
                    )
                ),
                li(
                    a(
                        href:="#",
                        "Edit",
                        span(
                            cls:="drop-icon",
                            "▾"
                        ),
                        label(
                            title:="Toggle Drop-down",
                            cls:="drop-icon",
                            `for`:="sm1",
                            "▾"
                        )
                    ),
                    input(
                        `type` :="checkbox",
                        id:="sm1"
                    ),
                    ul(
                        cls:="sub-menu",
                        li(
                            a(
                                href:="#",
                                "Undo"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Redo"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Cut"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Copy"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Paste"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Increase Indentation"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Decrease Indentation"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Select all"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                input(
                                    `type` :="checkbox",
                                ),
                                "Find"
                            )
                        )
                    )
                ),
                li(
                    a(
                        href:="#",
                        "View",
                        span(
                            cls:="drop-icon",
                            "▾"
                        ),
                        label(
                            title:="Toggle Drop-down",
                            cls:="drop-icon",
                            `for`:="sm1",
                            "▾"
                        )
                    ),
                    input(
                        `type` :="checkbox",
                        id:="sm1"
                    ),
                    ul(
                        cls:="sub-menu",
                        li(
                            a(
                                href:="#",
                                "Enlarge Font"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Reduce Font"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Reset Font"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Font",
                                span(
                                    cls:="drop-icon",
                                    "►"
                                ),
                                label(
                                    title:="Toggle Drop-down",
                                    cls:="drop-icon",
                                    `for`:="sm2",
                                    "►"
                                )
                            ),
                            input(
                                `type` :="checkbox",
                                id:="sm2"
                            ),
                            ul(
                                cls:="sub-menu",
                                li(
                                    a(
                                        href:="#",
                                        "Monospaced"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "Consolas"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "Courier New"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "Lucida Console"
                                    )
                                )
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Line Numbers"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Aspect Ratio",
                                span(
                                    cls:="drop-icon",
                                    "►"
                                ),
                                label(
                                    title:="Toggle Drop-down",
                                    cls:="drop-icon",
                                    `for`:="sm2",
                                    "►"
                                )
                            ),
                            input(
                                `type` :="checkbox",
                                id:="sm2"
                            ),
                            ul(
                                cls:="sub-menu",
                                li(
                                    a(
                                        href:="#",
                                        "Disable"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "16:9 Ratio"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "Custom Ratio"
                                    )
                                )
                            )
                        )
                    )
                ),
                li(
                    a(
                        href:="#",
                        "Plotting",
                        span(
                            cls:="drop-icon",
                            "▾"
                        ),
                        label(
                            title:="Toggle Drop-down",
                            cls:="drop-icon",
                            `for`:="sm1",
                            "▾"
                        )
                    ),
                    input(
                        `type` :="checkbox",
                        id:="sm1"
                    ),
                    ul(
                        cls:="sub-menu",
                        li(
                            a(
                                href:="#",
                                "Style",
                                span(
                                    cls:="drop-icon",
                                    "►"
                                ),
                                label(
                                    title:="Toggle Drop-down",
                                    cls:="drop-icon",
                                    `for`:="sm2",
                                    "►"
                                )
                            ),
                            input(
                                `type` :="checkbox",
                                id:="sm2"
                            ),
                            ul(
                                cls:="sub-menu",
                                li(
                                    a(
                                        href:="#",
                                        "Line"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "Dots"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "Both"
                                    )
                                )
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Simulator Fields"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Child Count"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "RNG Seeds"
                            )
                        )
                    )
                ),
                li(
                    a(
                        href:="#",
                        "Model",
                        span(
                            cls:="drop-icon",
                            "▾"
                        ),
                        label(
                            title:="Toggle Drop-down",
                            cls:="drop-icon",
                            `for`:="sm1",
                            "▾"
                        )
                    ),
                    input(
                        `type` :="checkbox",
                        id:="sm1"
                    ),
                    ul(
                        cls:="sub-menu",
                        li(
                            a(
                                href:="#",
                                "Run"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Step"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Stop"
                            )
                        )
                    )
                ),
                li(
                    a(
                        href:="#",
                        "Semantics",
                        span(
                            cls:="drop-icon",
                            "▾"
                        ),
                        label(
                            title:="Toggle Drop-down",
                            cls:="drop-icon",
                            `for`:="sm1",
                            "▾"
                        )
                    ),
                    input(
                        `type` :="checkbox",
                        id:="sm1"
                    ),
                    ul(
                        cls:="sub-menu",
                        li(
                            a(
                                href:="#",
                                "Traditionnal",
                                span(
                                    cls:="drop-icon",
                                    "►"
                                ),
                                label(
                                    title:="Toggle Drop-down",
                                    cls:="drop-icon",
                                    `for`:="sm2",
                                    "►"
                                )
                            ),
                            input(
                                `type` :="checkbox",
                                id:="sm2"
                            ),
                            ul(
                                cls:="sub-menu",
                                li(
                                    a(
                                        href:="#",
                                        "2015 Reference"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2015 Optimized"
                                    )
                                )
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Enclosure",
                                span(
                                    cls:="drop-icon",
                                    "►"
                                ),
                                label(
                                    title:="Toggle Drop-down",
                                    cls:="drop-icon",
                                    `for`:="sm2",
                                    "►"
                                )
                            ),
                            input(
                                `type` :="checkbox",
                                id:="sm2"
                            ),
                            ul(
                                cls:="sub-menu",
                                li(
                                    a(
                                        href:="#",
                                        "2015 Enclosure"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2013 PWL"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2013 EVT"
                                    )
                                )
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Depreciated",
                                span(
                                    cls:="drop-icon",
                                    "►"
                                ),
                                label(
                                    title:="Toggle Drop-down",
                                    cls:="drop-icon",
                                    `for`:="sm2",
                                    "►"
                                )
                            ),
                            input(
                                `type` :="checkbox",
                                id:="sm2"
                            ),
                            ul(
                                cls:="sub-menu",
                                li(
                                    a(
                                        href:="#",
                                        "2014 Reference"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2014 Optimized"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2013 Reference"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2013 Optimized"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2012 Reference"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2012 Optimized"
                                    )
                                ),
                                li(
                                    a(
                                        href:="#",
                                        "2012 Parallel"
                                    )
                                )
                            )
                        )
                    )
                ),
                li(
                    a(
                        href:="#",
                        "Plotting",
                        span(
                            cls:="drop-icon",
                            "▾"
                        ),
                        label(
                            title:="Toggle Drop-down",
                            cls:="drop-icon",
                            `for`:="sm1",
                            "▾"
                        )
                    ),
                    input(
                        `type` :="checkbox",
                        id:="sm1"
                    ),
                    ul(
                        cls:="sub-menu",
                        li(
                            a(
                                href:="#",
                                "Start Server"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Stop Server"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Reset Device"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Server Link",
                                span(
                                    cls:="drop-icon",
                                    "►"
                                ),
                                label(
                                    title:="Toggle Drop-down",
                                    cls:="drop-icon",
                                    `for`:="sm2",
                                    "►"
                                )
                            ),
                            input(
                                `type` :="checkbox",
                                id:="sm2"
                            ),
                            ul(
                                cls:="sub-menu",
                                li(
                                    a(
                                        href:="#",
                                        "Don't Know ???"
                                    )
                                )
                            )
                        )
                    )
                ),
                li(
                    a(
                        href:="#",
                        "Help",
                        span(
                            cls:="drop-icon",
                            "▾"
                        ),
                        label(
                            title:="Toggle Drop-down",
                            cls:="drop-icon",
                            `for`:="sm1",
                            "▾"
                        )
                    ),
                    input(
                        `type` :="checkbox",
                        id:="sm1"
                    ),
                    ul(
                        cls:="sub-menu",
                        li(
                            a(
                                href:="#",
                                "Reference Manual"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "About"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "Bugs"
                            )
                        ),
                        li(
                            a(
                                href:="#",
                                "License"
                            )
                        )
                    )
                )
            )
        )

        val text_area = div(
            cls:="wrapper",
            textarea(
                id:="code_area",
                cols:=40,
                rows:=20
            ),
            tag("section")(
                img(src:="./images/play.png"),
                img(src:="./images/step.png"),
                img(src:="./images/stop.png"),
            ),
            tag("section")(
                input(`type` :="checkbox"),
                button(
                    "5+10=?",
                    onclick := { () =>
                        add10(5);
                    }
                )
            )
        )
        

        val root = dom.document.getElementById("root")
        root.innerHTML = ""
        root.appendChild(navbar.render)
        root.appendChild(text_area.render)

    }

}

