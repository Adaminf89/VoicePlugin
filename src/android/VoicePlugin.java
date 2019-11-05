package cordova.plugin.voiceplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class VoicePlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        if (action.equals("sorter")) {
            //String message = args.getString(0);
            this.sorter(args, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void sorter(JSONArray args, CallbackContext callbackContext){
        if(args != null){
            try{
                int passedData = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                
                if(passedData == 1){
                    callbackContext.success("One");
                }
            }catch(Exception e){
                callbackContext.error("Your error" +e);
            }
        } else{
            callbackContext.error("Null on Voice");
        }
    }


}
