package com.kt.myservice;

import static com.kt.myservice.MyApplication.CHANNEL_ID;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

//foreground service
public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(MyService.class.getName(),"onCreate MyService");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(MyService.class.getName(),"onStartCommand MyService");
        //nhận dữ liệu từ startService()
        String strDataIntent = intent.getStringExtra("key_data_intent");
        sendNotification(strDataIntent);
        return START_NOT_STICKY;
    }
    //gửi dữ liệu lên notification
    private void sendNotification(String strDataIntent) {
        //click vào notification
        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        //đưa dữ liệu lên notification
        Notification notification = new NotificationCompat.Builder(this,CHANNEL_ID)
                .setContentTitle("Title notification service example")
                .setContentText(strDataIntent)
                .setSmallIcon(R.drawable.ic_baseline_access_time_24)
                .setContentIntent(pendingIntent)
                .build();
        //đưa nó ra foreground service
        startForeground(1,notification);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        Log.d(MyService.class.getName(),"onDestroy MyService");
        super.onDestroy();
    }
}
