package com.fourthskyinteractive.dx4j.dxgi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : DXGI.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("dxgi") 
public class DXGI_DISPLAY_COLOR_SPACE extends StructObject {
	public DXGI_DISPLAY_COLOR_SPACE() {
		super();
	}
	public DXGI_DISPLAY_COLOR_SPACE(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	/// C type : FLOAT[8][2]
	@Array({8, 2}) 
	@Field(0) 
	public Pointer<Float > PrimaryCoordinates() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : FLOAT[16][2]
	@Array({16, 2}) 
	@Field(1) 
	public Pointer<Float > WhitePoints() {
		return this.io.getPointerField(this, 1);
	}
}
