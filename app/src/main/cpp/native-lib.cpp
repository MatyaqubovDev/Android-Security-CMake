//
// Created by matyaqubov on 7/6/22.
//

#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_dev_matyaqubov_secretkeywithcmake_MainActivity_stringFromJNI(JNIEnv *env, jobject object) {
    std::string hello = "bogibek@dev";
    return env->NewStringUTF(hello.c_str());
}

