package candy.support.lottie.model.content;


import android.support.annotation.Nullable;

import candy.support.lottie.LottieDrawable;
import candy.support.lottie.animation.content.Content;
import candy.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
