#include<jni.h>
#include<string.h>
#include<math.h>

jstring Java_in_mrasif_dev_ndkdemo_MainActivity_helloWorld(JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"Hello World!");
}

jint Java_in_mrasif_dev_ndkdemo_MainActivity_addTwoNumbers(JNIEnv *env, jobject obj, jint a, jint b){
    jint c=a+b;
    return c;
}

jint Java_in_mrasif_dev_ndkdemo_MainActivity_pow(JNIEnv *env, jobject obj, jint a, jint b){
    jint c=pow(a,b);
    return c;
}