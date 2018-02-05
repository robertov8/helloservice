package br.com.livroandroid.helloservice

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v4.app.NotificationCompat

object NotificationUtil {
    fun create(context: Context, id: Int, intent: Intent, contentTitle: String, contentText: String) {
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        // Intent para disparar o broadcast
        val p = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        // Cria a notification
        val builder = NotificationCompat
                .Builder(context)
                .setContentIntent(p)
                .setContentTitle(contentTitle)
                .setContentText(contentText)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true)
                .build()
        // Dispara a notification
        manager.notify(id, builder)
    }
}