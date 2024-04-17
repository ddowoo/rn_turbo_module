package com.rtnrecorder

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.rtnrecorder.NativeRecorderSpec

class RecorderModule(reactContext: ReactApplicationContext) : NativeRecorderSpec(reactContext) {

  override fun getName() = NAME

  override fun add(a: Double, b: Double, promise: Promise) {
    promise.resolve(a + b)
  }

  companion object {
    const val NAME = "RTNRecorder"
  }
}