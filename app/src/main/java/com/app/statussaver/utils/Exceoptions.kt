package com.app.statussaver.utils

import android.webkit.ConsoleMessage
import java.io.IOException

class ApiException(message: String):IOException(message)
class  NoInternetConnection(message: String):IOException(message)