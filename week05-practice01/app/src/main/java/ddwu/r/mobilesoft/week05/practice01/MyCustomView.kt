package ddwu.r.mobilesoft.week05.practice01

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

const val TAG="MyCustomView"

class MyCustomView : View {
    var posX : Float
    var posY : Float = 200f
    var paintColor : Int

    init {
        posX = 200f
        paintColor = Color.RED
    }

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    /*
    1. onTouchEvent 재정의

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        posX = event!!.x    //null이 될 수 있어서 항상 null이 아니게 하도록 +!!, 터치한 곳의 x좌표
        posY = event!!.y
        invalidate()

        return true
    }*/

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas?.drawColor(Color.LTGRAY)
        val paint = Paint()
        paint.setColor(paintColor)
        canvas?.drawCircle(posX, posY, 100f, paint)
        Log.d (TAG, "($posX, $posY)")
    }
}