// Generated by data binding compiler. Do not edit!
package com.saucelabs.mydemoapp.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.saucelabs.mydemoapp.android.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MenuHeaderLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout cartCircleRL;

  @NonNull
  public final ImageView cartIV;

  @NonNull
  public final RelativeLayout cartRL;

  @NonNull
  public final TextView cartTV;

  @NonNull
  public final ConstraintLayout headerCL;

  @NonNull
  public final ImageView mTvTitle;

  @NonNull
  public final ImageView menuIV;

  @NonNull
  public final ImageView sortIV;

  protected MenuHeaderLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout cartCircleRL, ImageView cartIV, RelativeLayout cartRL, TextView cartTV,
      ConstraintLayout headerCL, ImageView mTvTitle, ImageView menuIV, ImageView sortIV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cartCircleRL = cartCircleRL;
    this.cartIV = cartIV;
    this.cartRL = cartRL;
    this.cartTV = cartTV;
    this.headerCL = headerCL;
    this.mTvTitle = mTvTitle;
    this.menuIV = menuIV;
    this.sortIV = sortIV;
  }

  @NonNull
  public static MenuHeaderLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.menu_header_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MenuHeaderLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MenuHeaderLayoutBinding>inflateInternal(inflater, R.layout.menu_header_layout, root, attachToRoot, component);
  }

  @NonNull
  public static MenuHeaderLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.menu_header_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MenuHeaderLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MenuHeaderLayoutBinding>inflateInternal(inflater, R.layout.menu_header_layout, null, false, component);
  }

  public static MenuHeaderLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MenuHeaderLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (MenuHeaderLayoutBinding)bind(component, view, R.layout.menu_header_layout);
  }
}
