/*
 * Created by dotrinh on 6/30/20 8:27 PM
 * Copyright (c) 2020. USE Inc. All rights reserved.
 */

package com.dotrinh.dragdroptworecyclerviews.tool;

import android.util.Log;

public class LogUtil {
    public static void LogD(String Tag, String Message) {
        Log.d(Tag, Message);
    }

    public static void LogE(String Tag, String Message) {
        Log.e(Tag, Message);
    }

    public static void LogI(String Message) {
        Log.i("viewlog", Message);
        // Tool.log_to_internal_file("viewlog: " + Message, Tool.getDefaultContext()); // TODO: 2022/09/15 turn off this if release
        /*
         * result:
         * /data/data/jp.co.zoom.G3ProRemote/files/debug_log__.txt
         */
    }

    public static void LogW(String Tag, String Message) {
        Log.w(Tag, Message);
    }

    public static void log(String Message) {
        Log.i("D384", Message);
    }
}

