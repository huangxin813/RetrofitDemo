# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/huangxin/Library/Android/sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-dontnote okhttp3.internal.platform.*
-dontnote com.google.gson.internal.UnsafeAllocator
-dontnote org.apache.http.params.*
-dontnote org.apache.http.conn.*
-dontnote org.apache.http.conn.scheme.*
-dontnote android.net.http.*


-dontwarn retrofit2.*
-dontwarn retrofit2.converter.gson.package-info

-dontwarn okhttp3.*
-dontwarn okhttp3.internal.cache.*
#-dontwarn okhttp3.internal.cache.DiskLruCache
#-dontwarn okhttp3.internal.cache.DiskLruCache$Snapshot
-dontwarn okhttp3.internal.connection.RealConnection
-dontwarn okhttp3.internal.http.RealResponseBody
-dontwarn okhttp3.internal.platform.*
-dontwarn okhttp3.internal.ws.RealWebSocket
-dontwarn okhttp3.internal.Util

-dontwarn okio.*

-keep class retrofit2.** {*;}
-keep class okhttp3.** {*;}
-keep class okio.** {*;}

-keep class com.google.gson.** {*;}
#-keepattributes Signature
