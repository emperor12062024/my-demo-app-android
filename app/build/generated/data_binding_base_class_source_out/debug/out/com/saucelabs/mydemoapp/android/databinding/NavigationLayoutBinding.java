// Generated by data binding compiler. Do not edit!
package com.saucelabs.mydemoapp.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.saucelabs.mydemoapp.android.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NavigationLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView menuRV;

  protected NavigationLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView menuRV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.menuRV = menuRV;
  }

  @NonNull
  public static NavigationLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.navigation_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NavigationLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NavigationLayoutBinding>inflateInternal(inflater, R.layout.navigation_layout, root, attachToRoot, component);
  }

  @NonNull
  public static NavigationLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.navigation_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NavigationLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NavigationLayoutBinding>inflateInternal(inflater, R.layout.navigation_layout, null, false, component);
  }

  public static NavigationLayoutBinding bind(@NonNull View view) {
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
  public static NavigationLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (NavigationLayoutBinding)bind(component, view, R.layout.navigation_layout);
  }
}
