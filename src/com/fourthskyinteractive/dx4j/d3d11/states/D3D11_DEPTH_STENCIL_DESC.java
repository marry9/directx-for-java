package com.fourthskyinteractive.dx4j.d3d11.states;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;

import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_COMPARISON_FUNC;
import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_DEPTH_WRITE_MASK;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
public class D3D11_DEPTH_STENCIL_DESC extends StructObject {
	public D3D11_DEPTH_STENCIL_DESC() {
		super();
	}
	public D3D11_DEPTH_STENCIL_DESC(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public int DepthEnable() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3D11_DEPTH_STENCIL_DESC DepthEnable(int DepthEnable) {
		this.io.setIntField(this, 0, DepthEnable);
		return this;
	}
	/// C type : D3D11_DEPTH_WRITE_MASK
	@Field(1) 
	public ValuedEnum<D3D11_DEPTH_WRITE_MASK > DepthWriteMask() {
		return this.io.getEnumField(this, 1);
	}
	/// C type : D3D11_DEPTH_WRITE_MASK
	@Field(1) 
	public D3D11_DEPTH_STENCIL_DESC DepthWriteMask(ValuedEnum<D3D11_DEPTH_WRITE_MASK > DepthWriteMask) {
		this.io.setEnumField(this, 1, DepthWriteMask);
		return this;
	}
	/// C type : D3D11_COMPARISON_FUNC
	@Field(2) 
	public ValuedEnum<D3D11_COMPARISON_FUNC > DepthFunc() {
		return this.io.getEnumField(this, 2);
	}
	/// C type : D3D11_COMPARISON_FUNC
	@Field(2) 
	public D3D11_DEPTH_STENCIL_DESC DepthFunc(ValuedEnum<D3D11_COMPARISON_FUNC > DepthFunc) {
		this.io.setEnumField(this, 2, DepthFunc);
		return this;
	}
	@Field(3) 
	public int StencilEnable() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3D11_DEPTH_STENCIL_DESC StencilEnable(int StencilEnable) {
		this.io.setIntField(this, 3, StencilEnable);
		return this;
	}
	/// C type : UINT8
	@Field(4) 
	public byte StencilReadMask() {
		return this.io.getByteField(this, 4);
	}
	/// C type : UINT8
	@Field(4) 
	public D3D11_DEPTH_STENCIL_DESC StencilReadMask(byte StencilReadMask) {
		this.io.setByteField(this, 4, StencilReadMask);
		return this;
	}
	/// C type : UINT8
	@Field(5) 
	public byte StencilWriteMask() {
		return this.io.getByteField(this, 5);
	}
	/// C type : UINT8
	@Field(5) 
	public D3D11_DEPTH_STENCIL_DESC StencilWriteMask(byte StencilWriteMask) {
		this.io.setByteField(this, 5, StencilWriteMask);
		return this;
	}
	/// C type : D3D11_DEPTH_STENCILOP_DESC
	@Field(6) 
	public D3D11_DEPTH_STENCILOP_DESC FrontFace() {
		return this.io.getNativeObjectField(this, 6);
	}
	/// C type : D3D11_DEPTH_STENCILOP_DESC
	@Field(7) 
	public D3D11_DEPTH_STENCILOP_DESC BackFace() {
		return this.io.getNativeObjectField(this, 7);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DepthEnable(); 
		result = prime * result + (int)DepthWriteMask().value(); 
		result = prime * result + (int)DepthFunc().value(); 
		result = prime * result + StencilEnable();
		result = prime * result + StencilReadMask();
		result = prime * result + StencilWriteMask();
		result = prime * result + FrontFace().hashCode();
		result = prime * result + BackFace().hashCode();
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		if(hashCode() != obj.hashCode()) 
			return false;
		
		return true;
	}
}
