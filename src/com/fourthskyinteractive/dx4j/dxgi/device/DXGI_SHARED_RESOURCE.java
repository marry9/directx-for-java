package com.fourthskyinteractive.dx4j.dxgi.device;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : DXGI.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("dxgi") 
public class DXGI_SHARED_RESOURCE extends StructObject {
	public DXGI_SHARED_RESOURCE() {
		super();
	}
	public DXGI_SHARED_RESOURCE(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	/// C type : HANDLE
	@Field(0) 
	public Pointer<? > Handle() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : HANDLE
	@Field(0) 
	public DXGI_SHARED_RESOURCE Handle(Pointer<? > Handle) {
		this.io.setPointerField(this, 0, Handle);
		return this;
	}
}
