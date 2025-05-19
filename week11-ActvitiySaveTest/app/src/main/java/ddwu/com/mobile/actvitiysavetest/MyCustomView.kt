package ddwu.com.mobile.actvitiysavetest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Parcel
import android.os.Parcelable
import android.util.AttributeSet
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.widget.Toast

class MyCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    var posX = 200.0f
    var posY = 200.0f
    var radius = 100.0f
    var color = Color.GREEN

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.LTGRAY)
        val paint = Paint()
        paint.color = color
        canvas.drawCircle(posX, posY, radius, paint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        posX = event?.x?.toFloat() ?: 200.0f
        posY = event?.y?.toFloat() ?: 200.0f
        invalidate()
        return true
    }
}

