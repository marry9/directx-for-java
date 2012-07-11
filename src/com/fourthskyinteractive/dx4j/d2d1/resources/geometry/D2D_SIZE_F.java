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
public class D2D_SIZE_F extends StructObject {
	public D2D_SIZE_F() {
		super();
	}
	public D2D_SIZE_F(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public float width() {
		return this.io.getFloatField(this, 0);
	}
	@Field(0) 
	public D2D_SIZE_F width(float width) {
		this.io.setFloatField(this, 0, width);
		return this;
	}
	@Field(1) 
	public float height() {
		return this.io.getFloatField(this, 1);
	}
	@Field(1) 
	public D2D_SIZE_F height(float height) {
		this.io.setFloatField(this, 1, height);
		return this;
	}
}
