package com.fourthskyinteractive.dx4j.wic;

import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.cpp.com.COMRuntime;
import org.bridj.cpp.com.IID;
import org.bridj.cpp.com.IUnknown;

@IID("")
@Library("wic")
@Runtime(COMRuntime.class)
public class IWICBitmap extends IUnknown {

}
