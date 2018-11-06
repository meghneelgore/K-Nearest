package rendering

import board.Board
import java.awt.Canvas
import java.awt.Graphics
import java.awt.Graphics2D
import java.util.*

class GeometryCanvas(val board: Board) : Canvas() {

    init {
        setSize(1600, 2000)
        Timer().schedule(object : TimerTask() {
            override fun run() {
                repaint()
            }
        }, 0, 10)
    }

    override fun paint(g: Graphics) {
        super.paint(g)
        g as Graphics2D
        board.paint(g)
    }
}