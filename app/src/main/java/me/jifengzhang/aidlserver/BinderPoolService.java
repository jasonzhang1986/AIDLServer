package me.jifengzhang.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Author: Jifeng Zhang
 * Email : jifengzhang.barlow@gmail.com
 * Date  : 2017/5/15
 * Desc  : Binder池服务
 */

public class BinderPoolService extends Service {
    private IBinder binderPool = new BinderPool.IBinderPoolImpl();
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binderPool;
    }
}
