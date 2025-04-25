package ddwu.r.mobilesoft.week04.customviewtest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View


class MyCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.LTGRAY)
        val paint = Paint()
        paint.color = Color.GREEN
        canvas.drawCircle(200.toFloat(), 200.toFloat(), 100.toFloat(), paint)
    }
}