package com.home.salaryuses

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.home.salaryuses.app.ui.login.WelcomeActivity
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.timerTask

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        Timer().schedule(
            timerTask {
                startActivity(Intent(this@LauncherActivity, WelcomeActivity::class.java))
                overridePendingTransition( 0, 0)
                finish()
                overridePendingTransition( 0, 0)
            }, TimeUnit.SECONDS.toMillis(2))
    }
}