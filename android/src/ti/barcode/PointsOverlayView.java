package ti.qrview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import org.appcelerator.kroll.common.Log;
import android.graphics.Rect;

public final class PointsOverlayView extends View {

  PointF[] points;
  private Paint paint;

  public PointsOverlayView(Context context) {
    super(context);
    init();
  }

  private void init() {
    paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(Color.YELLOW);
    paint.setStyle(Paint.Style.FILL);
    //setWillNotDraw(false);
    invalidate();
  }

  public void setPoints(PointF[] points) {
      this.points = points;
      invalidate();
  }

  @Override
  public void onDraw(Canvas canvas) {
    // super.draw(canvas);
    
    if (points != null) {
      for (PointF pointF : points) {
          canvas.drawCircle(pointF.x, pointF.y, 10, paint);
      }
    }
  }
}
