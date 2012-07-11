package com.fourthskyinteractive.dx4j.d3d9.resources;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d3d9.D3D9.D3DFORMAT;
import com.fourthskyinteractive.dx4j.d3d9.D3D9.D3DPOOL;
import com.fourthskyinteractive.dx4j.d3d9.D3D9.D3DRESOURCETYPE;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d9") 
public class D3DVOLUME_DESC extends StructObject {
	public D3DVOLUME_DESC() {
		super();
	}
	public D3DVOLUME_DESC(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	/// C type : D3DFORMAT
	@Field(0) 
	public ValuedEnum<D3DFORMAT > Format() {
		return this.io.getEnumField(this, 0);
	}
	/// C type : D3DFORMAT
	@Field(0) 
	public D3DVOLUME_DESC Format(ValuedEnum<D3DFORMAT > Format) {
		this.io.setEnumField(this, 0, Format);
		return this;
	}
	/// C type : D3DRESOURCETYPE
	@Field(1) 
	public ValuedEnum<D3DRESOURCETYPE > Type() {
		return this.io.getEnumField(this, 1);
	}
	/// C type : D3DRESOURCETYPE
	@Field(1) 
	public D3DVOLUME_DESC Type(ValuedEnum<D3DRESOURCETYPE > Type) {
		this.io.setEnumField(this, 1, Type);
		return this;
	}
	@Field(2) 
	public int Usage() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public D3DVOLUME_DESC Usage(int Usage) {
		this.io.setIntField(this, 2, Usage);
		return this;
	}
	/// C type : D3DPOOL
	@Field(3) 
	public ValuedEnum<D3DPOOL > Pool() {
		return this.io.getEnumField(this, 3);
	}
	/// C type : D3DPOOL
	@Field(3) 
	public D3DVOLUME_DESC Pool(ValuedEnum<D3DPOOL > Pool) {
		this.io.setEnumField(this, 3, Pool);
		return this;
	}
	@Field(4) 
	public int Width() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public D3DVOLUME_DESC Width(int Width) {
		this.io.setIntField(this, 4, Width);
		return this;
	}
	@Field(5) 
	public int Height() {
		return this.io.getIntField(this, 5);
	}
	@Field(5) 
	public D3DVOLUME_DESC Height(int Height) {
		this.io.setIntField(this, 5, Height);
		return this;
	}
	@Field(6) 
	public int Depth() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public D3DVOLUME_DESC Depth(int Depth) {
		this.io.setIntField(this, 6, Depth);
		return this;
	}
}
