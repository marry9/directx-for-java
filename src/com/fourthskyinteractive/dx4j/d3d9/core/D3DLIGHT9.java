package com.fourthskyinteractive.dx4j.d3d9.core;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d3d9.D3D9.D3DLIGHTTYPE;
import com.fourthskyinteractive.dx4j.d3d9.D3DVECTOR;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d9") 
public class D3DLIGHT9 extends StructObject {
	public D3DLIGHT9() {
		super();
	}
	public D3DLIGHT9(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	/// C type : D3DLIGHTTYPE
	@Field(0) 
	public ValuedEnum<D3DLIGHTTYPE > Type() {
		return this.io.getEnumField(this, 0);
	}
	/// C type : D3DLIGHTTYPE
	@Field(0) 
	public D3DLIGHT9 Type(ValuedEnum<D3DLIGHTTYPE > Type) {
		this.io.setEnumField(this, 0, Type);
		return this;
	}
	/// C type : D3DCOLORVALUE
	@Field(1) 
	public D3DCOLORVALUE Diffuse() {
		return this.io.getNativeObjectField(this, 1);
	}
	/// C type : D3DCOLORVALUE
	@Field(2) 
	public D3DCOLORVALUE Specular() {
		return this.io.getNativeObjectField(this, 2);
	}
	/// C type : D3DCOLORVALUE
	@Field(3) 
	public D3DCOLORVALUE Ambient() {
		return this.io.getNativeObjectField(this, 3);
	}
	/// C type : D3DVECTOR
	@Field(4) 
	public D3DVECTOR Position() {
		return this.io.getNativeObjectField(this, 4);
	}
	/// C type : D3DVECTOR
	@Field(5) 
	public D3DVECTOR Direction() {
		return this.io.getNativeObjectField(this, 5);
	}
	@Field(6) 
	public float Range() {
		return this.io.getFloatField(this, 6);
	}
	@Field(6) 
	public D3DLIGHT9 Range(float Range) {
		this.io.setFloatField(this, 6, Range);
		return this;
	}
	@Field(7) 
	public float Falloff() {
		return this.io.getFloatField(this, 7);
	}
	@Field(7) 
	public D3DLIGHT9 Falloff(float Falloff) {
		this.io.setFloatField(this, 7, Falloff);
		return this;
	}
	@Field(8) 
	public float Attenuation0() {
		return this.io.getFloatField(this, 8);
	}
	@Field(8) 
	public D3DLIGHT9 Attenuation0(float Attenuation0) {
		this.io.setFloatField(this, 8, Attenuation0);
		return this;
	}
	@Field(9) 
	public float Attenuation1() {
		return this.io.getFloatField(this, 9);
	}
	@Field(9) 
	public D3DLIGHT9 Attenuation1(float Attenuation1) {
		this.io.setFloatField(this, 9, Attenuation1);
		return this;
	}
	@Field(10) 
	public float Attenuation2() {
		return this.io.getFloatField(this, 10);
	}
	@Field(10) 
	public D3DLIGHT9 Attenuation2(float Attenuation2) {
		this.io.setFloatField(this, 10, Attenuation2);
		return this;
	}
	@Field(11) 
	public float Theta() {
		return this.io.getFloatField(this, 11);
	}
	@Field(11) 
	public D3DLIGHT9 Theta(float Theta) {
		this.io.setFloatField(this, 11, Theta);
		return this;
	}
	@Field(12) 
	public float Phi() {
		return this.io.getFloatField(this, 12);
	}
	@Field(12) 
	public D3DLIGHT9 Phi(float Phi) {
		this.io.setFloatField(this, 12, Phi);
		return this;
	}
}
