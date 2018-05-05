package dailydrip.com.textdirectionandroid;

import android.support.v4.text.TextUtilsCompat;
import android.support.v4.view.ViewCompat;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Locale;

/**
 * Created by franzejr on 5/5/18.
 */

public class TextDirectionHelper extends ReactContextBaseJavaModule {

    public TextDirectionHelper(ReactApplicationContext reactContext){
        super(reactContext);
    }

    @Override
    public String getName() {
        return "TextDirectionHelper";
    }

    @ReactMethod
    public String getTextDirection(){
        if(TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == ViewCompat.LAYOUT_DIRECTION_RTL){
            return "RTL";
        }else {
            return "LTR";
        }
    }
}
