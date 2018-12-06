package candy.support.lottie.model.animatable;

import android.graphics.PointF;

import candy.support.lottie.value.Keyframe;
import candy.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import candy.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.List;

public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
  public AnimatablePointValue(List<Keyframe<PointF>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    return new PointKeyframeAnimation(keyframes);
  }
}
