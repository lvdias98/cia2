package com.applayos.SewooPrintApplay;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;
import java.util.logging.Logger;
import java.util.logging.Level;

import android.content.Context;

// Import libs custom 


import com.sewoo.jpos.printer.ZPLPrinter;
import com.sewoo.jpos.command.ZPLConst;
import com.sewoo.port.android.BluetoothPort;
import com.applayos.assist.Sample_Print;


/**
 * This class echoes a string called from JavaScript.
 */

public class SewooPrintApplay extends CordovaPlugin {

    private ZPLPrinter zplPrinter;
    private Context context;
    private BluetoothPort bluetoothPort;
    public static final String TAG = "SewooPrintApplay";
    public static Logger logger = Logger.getAnonymousLogger();
    Sample_Print sample;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("echoTest")) {
            String mensagemAlerta = args.getString(0);
            this.echoMethod(mensagemAlerta, callbackContext);
            return true;
        }

        // funcs ionic to android
    
        if (action.equals("start")) {
            String addr = args.getString(0);
            this.startMethod(addr, callbackContext);
            return true;
        }

        if (action.equals("print")) {
            String textInput = args.getString(0);
            this.printTextMethod(textInput, callbackContext);
            return true;
        }
        return false;
    }

    private void echoMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Houve algum erro no texto");
        }
    }

    // private void startMethod(CallbackContext callbackContext) {
    //     try {
    //       Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Iniciando na Main Thread");
    //       // custom code android
    //       zplPrinter = new ZPLPrinter(); 
    //       context = cordova.getActivity().getApplicationContext();

    //       callbackContext.success("SeewooPrintApplay: Started ");
    //     }
    //     catch(Exception e) {
    //       Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> START:catch >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    //       logger.log(Level.SEVERE, "Erro", e);
    //       Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FIM:catch >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    //       callbackContext.error("Ocorreu um erro com SeewooPrintApplay");
    //     }
    // }

    private void startMethod(String addr,CallbackContext callbackContext) {
        try {
            Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Iniciando na startMethod");
            // custom code android
            // zplPrinter = new ZPLPrinter(); 
            bluetoothPort = BluetoothPort.getInstance();
            bluetoothPort.connect(addr);

            context = cordova.getActivity().getApplicationContext();
            sample = new Sample_Print(context);


            callbackContext.success("SeewooPrintApplay: connect BT ");
        }
        catch(Exception e) {
            Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> START:catch >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            logger.log(Level.SEVERE, "Erro", e);
            Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FIM:catch >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            callbackContext.error("Ocorreu um erro com SeewooPrintApplay");
        }
    }


    private void printTextMethod(String textToPrint, CallbackContext callbackContext) {
        try {
            Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Iniciando na Main Thread");
            // custom code android

            sample.Print_Text(1, ZPLConst.SENSE_BLACKMARK);

            callbackContext.success("SeewooPrintApplay: printing ");
        }
        catch(Exception e) {
            Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> START:catch >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            logger.log(Level.SEVERE, "Erro", e);
            Log.e(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FIM:catch >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            callbackContext.error("Ocorreu um erro com SeewooPrintApplay");
        }
    }
}
