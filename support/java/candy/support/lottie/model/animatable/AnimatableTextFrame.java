package candy.support.lottie.model.animatable;

import candy.support.lottie.value.Keyframe;
import candy.support.lottie.animation.keyframe.TextKeyframeAnimation;
import candy.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
