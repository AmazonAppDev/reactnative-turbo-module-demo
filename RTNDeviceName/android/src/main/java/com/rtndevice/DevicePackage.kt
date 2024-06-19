package com.rtndevice;

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.module.model.ReactModuleInfo

class DevicePackage : TurboReactPackage() {
    override fun getModule(name: String?, reactContext: ReactApplicationContext): NativeModule? =
       if (name == DeviceModule.NAME) {
        DeviceModule(reactContext)
       } else {
         null
       }
    
     override fun getReactModuleInfoProvider() = ReactModuleInfoProvider {
       mapOf(
         DeviceModule.NAME to ReactModuleInfo(
           DeviceModule.NAME,
           DeviceModule.NAME,
           false, // canOverrideExistingModule
           false, // needsEagerInit
           true, // hasConstants
           false, // isCxxModule
           true // isTurboModule
         )
       )
     }
}