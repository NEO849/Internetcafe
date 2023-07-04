
    // ermöglicht den leichten Zugriff auf Farben in meinem Projekt
    class Farben {

        // ermöglicht den Zugriff auf die Elemente einer Klasse, ohne dafür eine Instanz zu erstellen
        companion object {

            // Reset
            val reset = "\u001b[0m" // Text Reset

            // Regular Colors
            val black = "\u001b[0;30m" // BLACK
            val red = "\u001b[0;31m" // RED
            val green = "\u001b[0;32m" // GREEN
            val yellow = "\u001b[0;33m" // YELLOW
            val blue = "\u001b[0;34m" // BLUE
            val purple = "\u001b[0;35m" // PURPLE
            val cyan = "\u001b[0;36m" // CYAN
            val white = "\u001b[0;37m" // WHITE

            // Bold
            val black_bold = "\u001b[1;30m" // BLACK
            val reed_bold = "\u001b[1;31m" // RED
            val green_bold = "\u001b[1;32m" // GREEN
            val yellow_bold = "\u001b[1;33m" // YELLOW
            val blue_bold = "\u001b[1;34m" // BLUE
            val purple_bold = "\u001b[1;35m" // PURPLE
            val cyan_bold = "\u001b[1;36m" // CYAN
            val white_bold = "\u001b[1;37m" // WHITE

            // Underline
            val black_underlined = "\u001b[4;30m" // BLACK
            val red_underlined = "\u001b[4;31m" // RED
            val green_underlined = "\u001b[4;32m" // GREEN
            val yellow_underlined = "\u001b[4;33m" // YELLOW
            val blue_underlined = "\u001b[4;34m" // BLUE
            val purple_underlined = "\u001b[4;35m" // PURPLE
            val cyan_underlineD = "\u001b[4;36m" // CYAN
            val white_underlineD = "\u001b[4;37m" // WHITE

            // Background
            val black_background = "\u001b[40m" // BLACK
            val red_background = "\u001b[41m" // RED
            val green_background = "\u001b[42m" // GREEN
            val yellow_background = "\u001b[43m" // YELLOW
            val blue_background = "\u001b[44m" // BLUE
            val purple_background = "\u001b[45m" // PURPLE
            val cyan_background = "\u001b[46m" // CYAN
            val white_background = "\u001b[47m" // WHITE

            // High Intensity
            val black_bright = "\u001b[0;90m" // BLACK
            val red_bright = "\u001b[0;91m" // RED
            val green_brighT = "\u001b[0;92m" // GREEN
            val yellow_bright = "\u001b[0;93m" // YELLOW
            val blue_bright = "\u001b[0;94m" // BLUE
            val purple_bright = "\u001b[0;95m" // PURPLE
            val cyan_bright = "\u001b[0;96m" // CYAN
            val white_bright = "\u001b[0;97m" // WHITE

            // Bold High Intensity
            val black_bold_bright = "\u001b[1;90m" // BLACK
            val red_bold_bright = "\u001b[1;91m" // RED
            val green_bold_bright = "\u001b[1;92m" // GREEN
            val yellow_bold_bright = "\u001b[1;93m" // YELLOW
            val blue_bold_bright = "\u001b[1;94m" // BLUE
            val purple_bold_bright = "\u001b[1;95m" // PURPLE
            val cyan_bold_bright = "\u001b[1;96m" // CYAN
            val white_bold_bright = "\u001b[1;97m" // WHITE

            // High Intensity backgrounds
            val black_background_bright = "\u001b[0;100m" // BLACK
            val red_background_bright = "\u001b[0;101m" // RED
            val green_background_bright = "\u001b[0;102m" // GREEN
            val yellow_background_bright = "\u001b[0;103m" // YELLOW
            val blue_background_bright = "\u001b[0;104m" // BLUE
            val purple_background_bright = "\u001b[0;105m" // PURPLE
            val cyan_background_bright = "\u001b[0;106m" // CYAN
            val white_background_bright = "\u001b[0;107m" // WHITE
        }
    }