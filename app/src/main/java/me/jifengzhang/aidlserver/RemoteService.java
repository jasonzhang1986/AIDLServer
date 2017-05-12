package me.jifengzhang.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/**
 * Author: Jifeng Zhang
 * Email : jifengzhang.barlow@gmail.com
 * Date  : 2017/5/12
 * Desc  : 远程服务
 */

public class RemoteService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("AIDLDemo","RemoteService onCreate");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final IRemoteService.Stub mBinder = new IRemoteService.Stub() {
        @Override
        public String getRemoteValue(int input) throws RemoteException {
            Log.i("AIDLDemo","Remote input = "+ input);
            return "RemoteService be invoke!";
        }
    };
}
