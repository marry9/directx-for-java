package com.fourthskyinteractive.dx4j.d3d11.resources;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d11") 
public class D3D11_BOX extends StructObject {
	public D3D11_BOX() {
		super();
	}
	public D3D11_BOX(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public int left() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3D11_BOX left(int left) {
		this.io.setIntField(this, 0, left);
		return this;
	}
	@Field(1) 
	public int top() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3D11_BOX top(int top) {
		this.io.setIntField(this, 1, top);
		return this;
	}
	@Field(2) 
	public int front() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public D3D11_BOX front(int front) {
		this.io.setIntField(this, 2, front);
		return this;
	}
	@Field(3) 
	public int right() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3D11_BOX right(int right) {
		this.io.setIntField(this, 3, right);
		return this;
	}
	@Field(4) 
	public int bottom() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public D3D11_BOX bottom(int bottom) {
		this.io.setIntField(this, 4, bottom);
		return this;
	}
	@Field(5) 
	public int back() {
		return this.io.getIntField(this, 5);
	}
	@Field(5) 
	public D3D11_BOX back(int back) {
		this.io.setIntField(this, 5, back);
		return this;
	}
}