package com.rtnrecorder;

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider

class RecorderPackage : TurboReactPackage() {
  override fun getModule(name: String?, reactContext: ReactApplicationContext): NativeModule? = 
   if (name == RecorderModule.NAME) {     
        RecorderModule(reactContext)
    } else {     
        null   
    }

  override fun getReactModuleInfoProvider() = ReactModuleInfoProvider {
    mapOf(
      RecorderModule.NAME to ReactModuleInfo(
        RecorderModule.NAME,
        RecorderModule.NAME,
        false, // canOverrideExistingModule
        false, // needsEagerInit
        true, // hasConstants
        false, // isCxxModule
        true // isTurboModule
      )
    )
  }
}