package com.fourthskyinteractive.dx4j.d3d11.resources;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_RESOURCE_MISC_FLAG;
import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_USAGE;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_FORMAT;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d11") 
public class D3D11_TEXTURE3D_DESC extends StructObject {
	public D3D11_TEXTURE3D_DESC() {
		super();
	}
	public D3D11_TEXTURE3D_DESC(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public int Width() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3D11_TEXTURE3D_DESC Width(int Width) {
		this.io.setIntField(this, 0, Width);
		return this;
	}
	@Field(1) 
	public int Height() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3D11_TEXTURE3D_DESC Height(int Height) {
		this.io.setIntField(this, 1, Height);
		return this;
	}
	@Field(2) 
	public int Depth() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public D3D11_TEXTURE3D_DESC Depth(int Depth) {
		this.io.setIntField(this, 2, Depth);
		return this;
	}
	@Field(3) 
	public int MipLevels() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3D11_TEXTURE3D_DESC MipLevels(int MipLevels) {
		this.io.setIntField(this, 3, MipLevels);
		return this;
	}
	/// C type : DXGI_FORMAT
	@Field(4) 
	public ValuedEnum<DXGI_FORMAT > Format() {
		return this.io.getEnumField(this, 4);
	}
	/// C type : DXGI_FORMAT
	@Field(4) 
	public D3D11_TEXTURE3D_DESC Format(ValuedEnum<DXGI_FORMAT > Format) {
		this.io.setEnumField(this, 4, Format);
		return this;
	}
	/// C type : D3D11_USAGE
	@Field(5) 
	public ValuedEnum<D3D11_USAGE > Usage() {
		return this.io.getEnumField(this, 5);
	}
	/// C type : D3D11_USAGE
	@Field(5) 
	public D3D11_TEXTURE3D_DESC Usage(ValuedEnum<D3D11_USAGE > Usage) {
		this.io.setEnumField(this, 5, Usage);
		return this;
	}
	@Field(6) 
	public int BindFlags() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public D3D11_TEXTURE3D_DESC BindFlags(int BindFlags) {
		this.io.setIntField(this, 6, BindFlags);
		return this;
	}
	@Field(7) 
	public int CPUAccessFlags() {
		return this.io.getIntField(this, 7);
	}
	@Field(7) 
	public D3D11_TEXTURE3D_DESC CPUAccessFlags(int CPUAccessFlags) {
		this.io.setIntField(this, 7, CPUAccessFlags);
		return this;
	}
	@Field(8) 
	public ValuedEnum<D3D11_RESOURCE_MISC_FLAG> MiscFlags() {
		return this.io.getEnumField(this, 8);
	}
	@Field(8) 
	public D3D11_TEXTURE3D_DESC MiscFlags(ValuedEnum<D3D11_RESOURCE_MISC_FLAG> MiscFlags) {
		this.io.setEnumField(this, 8, MiscFlags);
		return this;
	}
}
