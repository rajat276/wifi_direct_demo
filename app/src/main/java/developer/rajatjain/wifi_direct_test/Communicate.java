package developer.rajatjain.wifi_direct_test;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pDeviceList;

/**
 * Created by Rajat Jain on 10-01-2017.
 */

public interface Communicate {
    void GetAvailableDeviceList(WifiP2pDeviceList peerList);
    void GetClientList(String list,String gpowner,Boolean isGp);
    void notifyThisDeviceChanged(Intent intent);
}
