package com.fourthskyinteractive.dx4j.dxgi;

import static org.bridj.Pointer.allocatePointer;

import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.ann.Virtual;
import org.bridj.cpp.com.COMRuntime;
import org.bridj.cpp.com.IID;
import org.bridj.cpp.com.IUnknown;
/**
 * <i>native declaration : DXGI.h:151</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@IID("aec22fb8-76f3-4639-9be0-28eb43a67a2e") 
@Library("dxgi") 
@Runtime(COMRuntime.class)
public class IDXGIObject extends IUnknown {
	public IDXGIObject() {
		super();
	}
//	public IDXGIObject(Pointer pointer) {
//		super(pointer);
//	}
	@Virtual(0) 
	public native int SetPrivateData(Pointer<Byte > Name, int DataSize, Pointer<? > pData);
	@Virtual(1) 
	public native int SetPrivateDataInterface(Pointer<Byte > Name, Pointer<IUnknown > pUnknown);
	@Virtual(2) 
	public native int GetPrivateData(Pointer<Byte > Name, Pointer<Integer > pDataSize, Pointer<? > pData);
	@Deprecated
    @Virtual(3)
	public native int GetParent(Pointer<Byte> riid, Pointer<Pointer<? > > ppParent);
	
	// "Javanized methods
	public <T extends IDXGIObject> T GetParent(Class<T> klass) throws DXGIException {
		Pointer<Pointer<?>> pp = null;
		
		try {
			pp = allocatePointer();
			Pointer<Byte> pGUID = COMRuntime.getIID(klass);
			int result = GetParent(pGUID, pp);
			if(result != 0) {
				throw new DXGIException(result);
			}
			
			return pp.get().getNativeObject(klass);

		} finally {
			if(pp != null) {
				pp.release();
			}
		}
	}
}
