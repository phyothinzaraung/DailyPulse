package com.phyo.dailypulse

import platform.Foundation.NSLog
import platform.UIKit.UIDevice
import platform.UIKit.UIScreen

actual class Platform public constructor(){
    actual val osName: String
        get() = UIDevice.currentDevice.systemName
    actual val osVersion: String
        get() = UIDevice.currentDevice.systemVersion
    actual val deviceModel: String
        get() = UIDevice.currentDevice.model
    actual val density: Int
        get() = UIScreen.mainScreen.scale.toInt()

    actual fun logSystemInfo() {
        NSLog(
            "($osName, $osVersion, $deviceModel, $density)"
        )
    }

}