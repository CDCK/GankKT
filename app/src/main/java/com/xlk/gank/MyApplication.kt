package com.xlk.gank

import android.app.Application
import com.tencent.bugly.crashreport.CrashReport


/**
 * Created by xlk on 2020/4/23.
 *
 */
class MyApplication : Application() {
    val buglyid = 152540 //=152540 测试版本 =152544 release版
    override fun onCreate() {
        super.onCreate()
        CrashReport.initCrashReport(applicationContext, "d4fc104cf9", true);
        CrashReport.setUserSceneTag(applicationContext, buglyid)
    }
}