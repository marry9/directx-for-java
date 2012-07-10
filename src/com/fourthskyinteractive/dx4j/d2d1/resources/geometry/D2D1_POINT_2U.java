package com.fourthskyinteractive.dx4j.d2d1.resources.geometry;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d2d1") 
public class D2D1_POINT_2U extends StructObject {
	public D2D1_POINT_2U() {
		super();
	}
	public D2D1_POINT_2U(Pointer pointer) {
		super(pointer);
	}
	/// C type : UINT32
	@Field(0) 
	public int x() {
		return this.io.getIntField(this, 0);
	}
	/// C type : UINT32
	@Field(0) 
	public D2D1_POINT_2U x(int x) {
		this.io.setIntField(this, 0, x);
		return this;
	}
	/// C type : UINT32
	@Field(1) 
	public int y() {
		return this.io.getIntField(this, 1);
	}
	/// C type : UINT32
	@Field(1) 
	public D2D1_POINT_2U y(int y) {
		this.io.setIntField(this, 1, y);
		return this;
	}
}